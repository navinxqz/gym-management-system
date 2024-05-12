package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Signup extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage;
    ImageIcon backgroundIcon,logo;
    JLabel imgJLabel1;
    JLabel imgJLabel2;
    JLabel headLabel;
    JLabel userLabel;
    JTextField usernameArea;
    JLabel emailLabel;
    JTextField emailField;
    JLabel passLabel;
    JPasswordField passwordField;
    JLabel confirmJLabel;
    JPasswordField confirmPasswordField;
    JButton signupButton;
    JLabel noteLabel;
    JButton loginButton;
    JButton backButton;
    JButton reportButton;
    JButton helpButton;
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;
	FileWriter writer ;
	File file;

    public Signup()
    {
	    super("AIUB FITNESS ZONE");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");		
		this.setIconImage(logo.getImage());

        panel = new JPanel();
        panel.setLayout(null);       
        panel.setBackground(Color.CYAN);

        headFont = new Font("Comic Sans", Font.BOLD, 35);
        detFont = new Font("Open Sans", Font.BOLD, 15);

        yellowColor = new Color(255,181,62);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,(int) 0.53);

        backgroundIcon = new ImageIcon("Photo/signup(2).png");
        imgJLabel2 = new JLabel(backgroundIcon);
        imgJLabel2.setBounds(0,0,1100,700);
        panel.add(imgJLabel2);

        userLabel = new JLabel("Enter Username:");
        userLabel.setBounds(410, 135,130,80);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(detFont);
        imgJLabel2.add(userLabel);

        usernameArea = new JTextField();
        usernameArea.setBounds(410,200,280, 25);
        usernameArea.setFont(detFont);
        usernameArea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        usernameArea.setBackground(yellowColor);
        usernameArea.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(usernameArea);

        emailLabel = new JLabel("Enter Phone Number : ");
        emailLabel.setBounds(410, 220, 200,80);
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setFont(detFont);
        imgJLabel2.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(410,290,280, 25);
        emailField.setFont(detFont);
        emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        emailField.setBackground(yellowColor);
        emailField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(emailField);

        passLabel = new JLabel("Enter Password : ");
        passLabel.setBounds(410, 310, 150,80);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(detFont);
        imgJLabel2.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(410,380,280,25);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        passwordField.setBackground(yellowColor);
        passwordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        passwordField.setFont(detFont);
        panel.add(passwordField);

        confirmJLabel = new JLabel("Confirm Password :");
        confirmJLabel.setBounds(410, 400, 150,80);
        confirmJLabel.setForeground(Color.WHITE);
        confirmJLabel.setFont(detFont);
        imgJLabel2.add(confirmJLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(410,470,280,25);
        confirmPasswordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        confirmPasswordField.setBackground(yellowColor);
        confirmPasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        confirmPasswordField.setFont(detFont);
        panel.add(confirmPasswordField);

        signupButton = new JButton("Sign Up");
        signupButton.setBounds(410,570,280,30);
        signupButton.setFont(detFont);
        signupButton.setBackground(Color.WHITE);
        signupButton.setForeground(Color.BLACK);
        signupButton.setBorderPainted(false);
        signupButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signupButton.setFocusable(false);
        signupButton.addMouseListener(this);
		signupButton.addActionListener(this);
        imgJLabel2.add(signupButton);


        noteLabel = new JLabel("Already have an account?");
        noteLabel.setBounds(410,610,200,30);
        noteLabel.setForeground(Color.WHITE);
        noteLabel.setFont(detFont);
        imgJLabel2.add(noteLabel);

        loginButton = new JButton("<html><body><h3><u>Log in</u></h3></body></html>");
        loginButton.setBounds(605,615,80,20);
        loginButton.setBackground(grayColor);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBorderPainted(false);
        loginButton.setFocusable(false);
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.addMouseListener(this);
		loginButton.addActionListener(this);
        loginButton.setFont(detFont);
        imgJLabel2.add(loginButton);

        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(27,17, 30,30);        
		backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setFocusable(false);
        backButton.addMouseListener(this);
		backButton.addActionListener(this);
        imgJLabel2.add(backButton);
        

        reportButton = new JButton("<html><body><u>Report</u></body></html>");
        reportButton.setBounds(1000,13,85,20);
        reportButton.setBackground(grayColor);
        reportButton.setForeground(Color.WHITE);
        reportButton.setBorderPainted(false);
        reportButton.setFocusable(false);
        reportButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reportButton.addActionListener(this);
        reportButton.addMouseListener(this);
        reportButton.setFont(detFont);
        imgJLabel2.add(reportButton);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == reportButton)
        {
            JOptionPane.showMessageDialog(null,"Reported successfully. \nWe will work on it and inform you shortly","Report feedback",2);
        }
		else if(ae.getSource()==loginButton || ae.getSource()==backButton){
			Login L = new Login();
			L.setVisible(true);
			this.setVisible(false);
		}		
		else if(ae.getSource()==signupButton){
			String name=usernameArea.getText();
			String contact = emailField.getText();
			String newpass = passwordField.getText();
			String conpass = confirmPasswordField.getText();
			
			if(name.isEmpty() || contact.isEmpty() || newpass.isEmpty() || conpass.isEmpty()){
			    JOptionPane.showMessageDialog(null,"Fill all informations");
			}
			else if(newpass.equals(conpass)){
				if(SignUpHandler.validateName("username : "+usernameArea.getText())){
		    SignUpHandler.signUp(usernameArea.getText(),passwordField.getText(),emailField.getText());
			JOptionPane.showMessageDialog(null,"Account Created Successfully");
			Login L = new Login();
			L.setVisible(true);
			this.setVisible(false);
				}
				else{
            JOptionPane.showMessageDialog(null, "User Already Exists. Please enter a valid Name.", "Error", JOptionPane.ERROR_MESSAGE);
				}
					
			}
			else{
				 JOptionPane.showMessageDialog(null,"New Paswords Doesnt Match");
			}
		}		
		else if(ae.getSource()==backButton){
			Login L = new Login();
			L.setVisible(true);
			this.setVisible(false);
		}

		
    }

    public void mouseClicked(MouseEvent me)
    {
       
    }
	public void mousePressed(MouseEvent me)
    {
    
    }
	public void mouseReleased(MouseEvent me)
    {
        
    }

	public void mouseEntered(MouseEvent me)
	{
        if(me.getSource() == backButton)
		{
			backButton.setBackground(grayColor);
			//backButton.setForeground(Color.WHITE);
		}
		else if(me.getSource() == reportButton)
		{
			reportButton.setBackground(grayColor);
			reportButton.setForeground(Color.BLACK);
		}
	
		else if(me.getSource() == signupButton)
		{
			signupButton.setBackground(Color.WHITE);
			signupButton.setForeground(yellowColor);
		}
        
        else if(me.getSource() == loginButton)
		{
			//loginButton.setBackground(oppColor);
			loginButton.setForeground(Color.BLACK);
		}
        else
        {
            //good practice
        }
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == backButton)
		{
			backButton.setBackground(grayColor);
		}
		else if(me.getSource() == reportButton)
		{
			reportButton.setBackground(grayColor);
			reportButton.setForeground(Color.WHITE);
		}
		
		else if(me.getSource() == signupButton)
		{
			signupButton.setBackground(Color.WHITE);
			signupButton.setForeground(Color.BLACK);
		}
        
        else if(me.getSource() == loginButton)
		{
			//loginButton.setBackground(oppColor);
			loginButton.setForeground(Color.WHITE);
		}
        else
        {
            //good practice
        }
	}

}