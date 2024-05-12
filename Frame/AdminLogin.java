package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;


public class AdminLogin extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage,logo;
    ImageIcon backgroundIcon;
    JLabel imgJLabel1;
    JLabel imgJLabel2;
    JLabel headLabel;
    JLabel userLabel;
    JTextField usernameArea;
    JLabel passLabel;
    JPasswordField passwordField;
    JButton loginButton;
   
    JButton changeButton;
    JButton backButton;
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;

    public AdminLogin()
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
        detFont = new Font("Open Sans", Font.BOLD, 18);

        yellowColor = new Color(249,176,63);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,1);

        backgroundIcon = new ImageIcon("Photo/adminLogin.png");
        imgJLabel2 = new JLabel(backgroundIcon);
        imgJLabel2.setBounds(0,0,1100,700);
        panel.add(imgJLabel2);

        headLabel = new JLabel("ADMINISTRATION");
        headLabel.setBounds(120, 130, 500, 60);
        headLabel.setForeground(Color.WHITE);
        headLabel.setFont(headFont);
        imgJLabel2.add(headLabel);

        userLabel = new JLabel("Admin name:");
        userLabel.setBounds(535, 225,130,80);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(detFont);
        imgJLabel2.add(userLabel);

        usernameArea = new JTextField();
        usernameArea.setBounds(660,245,310, 30);
        usernameArea.setFont(detFont);
        usernameArea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        usernameArea.setBackground(yellowColor);
        usernameArea.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(usernameArea);


        passLabel = new JLabel("Password    : ");
        passLabel.setBounds(535, 340, 130,80);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(detFont);
        imgJLabel2.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(660,360,310,30);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        passwordField.setBackground(yellowColor);
        passwordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        passwordField.setFont(detFont);
        panel.add(passwordField);


        loginButton = new JButton("Log in");
        loginButton.setBounds(620,505,270,40);
        loginButton.setFont(detFont);
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(Color.BLACK);
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.setFocusable(false);
        loginButton.setFont(detFont);
        loginButton.addMouseListener(this);
        loginButton.addActionListener(this);
        imgJLabel2.add(loginButton);



        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(27,27, 30,30);
        backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setFocusable(false);
        backButton.addMouseListener(this);
        backButton.addActionListener(this);
        imgJLabel2.add(backButton);
        

        

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==backButton){
			UserAdmin ua = new UserAdmin();
			ua.setVisible(true);
			this.setVisible(false);
	}
    else if (ae.getSource()==loginButton){
			String storeduser=usernameArea.getText();
			String suser="username : "+usernameArea.getText();
			String storedpassword=passwordField.getText();
			
			if(storeduser.isEmpty() || storedpassword.isEmpty()){
				JOptionPane.showMessageDialog(null,"Fill Both Fields");
			}
			else if(validateLogin(storeduser,storedpassword)){
				adminHome aH = new adminHome();
				aH.setVisible(true);
				this.setVisible(false);
				}
			
		else{
			   JOptionPane.showMessageDialog(null, "Invalid username/password.", "Error", JOptionPane.ERROR_MESSAGE);
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
		}
		
		else if(me.getSource() == changeButton)
		{
	        //changeButton.setBackground(new Color(145,145,145,(int) 0.53));
			changeButton.setForeground(Color.BLACK);
		
		}
		else if(me.getSource() == loginButton)
		{
			loginButton.setBackground(Color.WHITE);
			loginButton.setForeground(yellowColor);
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
		
		else if(me.getSource() == changeButton)
		{
	        //changeButton.setBackground(Color.WHITE);
			changeButton.setForeground(Color.WHITE);
		
		}
		else if(me.getSource() == loginButton)
		{
			loginButton.setBackground(Color.WHITE);
			loginButton.setForeground(Color.BLACK);
		}
        
        
        else
        {
            //good practice
        }
	}
    private boolean validateLogin(String username, String password) {
		boolean flag=false;
		
		File file=new File("Data/admin.txt");
		try{
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String[] value=line.split("\t");
			if(value[0].equals("username : "+usernameArea.getText())&&value[1].equals("password : "+passwordField.getText()))
			{
				flag=true;
			}

		}
				sc.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return flag;
		
	}
}