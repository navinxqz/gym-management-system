package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class adminAdd extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage,logo;
    ImageIcon backgroundIcon;
    JLabel imgJLabel1;
    JLabel imgJLabel2;
    JLabel headLabel;
    JLabel userLabel;
    JTextField usernameArea;
    JLabel emailLabel;
    JTextField emailField;
    JLabel passLabel;
    JPasswordField passwordField;
    JButton adduserButton;
    JButton backButton;
    JButton helpButton;
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;
	FileWriter writer ;
	File file;

    public adminAdd()
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

        yellowColor = new Color(249,176,63);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,(int) 0.53);

        backgroundIcon = new ImageIcon("Photo/adminAdd.png");
        imgJLabel2 = new JLabel(backgroundIcon);
        imgJLabel2.setBounds(0,0,1100,700);
        panel.add(imgJLabel2);

        headLabel = new JLabel("ADD USER");
        headLabel.setBounds(150, 500, 310, 60);
        headLabel.setForeground(Color.WHITE);
        headLabel.setFont(new Font("Open Sans", Font.BOLD, 40));
        imgJLabel2.add(headLabel);

        userLabel = new JLabel("Enter Username:");
        userLabel.setBounds(500, 135,130,80);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(detFont);
        imgJLabel2.add(userLabel);

        usernameArea = new JTextField();
        usernameArea.setBounds(500,195,470, 40);
        usernameArea.setFont(detFont);
        usernameArea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        usernameArea.setBackground(yellowColor);
        usernameArea.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(usernameArea);

        emailLabel = new JLabel("Enter Phone Number : ");
        emailLabel.setBounds(500, 245, 200,80);
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setFont(detFont);
        imgJLabel2.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(500,310,470, 40);
        emailField.setFont(detFont);
        emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        emailField.setBackground(yellowColor);
        emailField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(emailField);

        passLabel = new JLabel("Enter Password : ");
        passLabel.setBounds(500, 360, 150,80);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(detFont);
        imgJLabel2.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(500,420,470,40);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        passwordField.setBackground(yellowColor);
        passwordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        passwordField.setFont(detFont);
        panel.add(passwordField);

        adduserButton = new JButton("ADD USER");
        adduserButton.setBounds(635,525,200,50);
        adduserButton.setFont(detFont);
        adduserButton.setBackground(Color.WHITE);
        adduserButton.setForeground(Color.BLACK);
        adduserButton.setBorderPainted(false);
        adduserButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adduserButton.setFocusable(false);
        adduserButton.addMouseListener(this);
		adduserButton.addActionListener(this);
        imgJLabel2.add(adduserButton);


      
        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(27,17, 50,50);        backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setFocusable(false);
        backButton.addMouseListener(this);
		backButton.addActionListener(this);
        imgJLabel2.add(backButton);
    

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == backButton)
        {
            adminHome h = new adminHome();
            h.setVisible(true);
            this.setVisible(false);
        }
		else if(ae.getSource()==adduserButton){
			String name=usernameArea.getText();
			String contact = emailField.getText();
			String newpass = passwordField.getText();
			
			if(name.isEmpty() || contact.isEmpty() || newpass.isEmpty()){
			    JOptionPane.showMessageDialog(null,"Fill all informations");
			}
			else if(SignUpHandler.validateName("username : "+name)){
				
		    SignUpHandler.signUp(usernameArea.getText(),passwordField.getText(),emailField.getText());
				JOptionPane.showMessageDialog(null,"Account Added Successfully");}
				
				else{
            JOptionPane.showMessageDialog(null, "User Already Exists. Please enter a valid Name.", "Error", JOptionPane.ERROR_MESSAGE);
				}
              
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
		
	
		else if(me.getSource() == adduserButton)
		{
			adduserButton.setBackground(Color.WHITE);
			adduserButton.setForeground(yellowColor);
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
		
		
		else if(me.getSource() == adduserButton)
		{
			adduserButton.setBackground(Color.WHITE);
			adduserButton.setForeground(Color.BLACK);
		}
        else
        {
            //good practice
        }
	}

}