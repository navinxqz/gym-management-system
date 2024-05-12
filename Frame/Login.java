package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Login extends JFrame implements ActionListener, MouseListener
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
    JLabel noteLabel;
    JButton signupButton;
    JButton changeButton;
    JButton backButton;
    JButton exitButton;
    JButton aboutButton;
    JButton helpButton;
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;
	
	private File file; 
	private FileWriter filewriter;
	private Scanner sc;
	
    public Login()
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
        oppColor = new Color(145,145,145,1);

        backgroundIcon = new ImageIcon("Photo/LOGIN.png");
        imgJLabel2 = new JLabel(backgroundIcon);
        imgJLabel2.setBounds(0,0,1100,700);
        panel.add(imgJLabel2);
        

        userLabel = new JLabel("Username:");
        userLabel.setBounds(405, 195,100,80);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(detFont);
        imgJLabel2.add(userLabel);

        usernameArea = new JTextField();
        usernameArea.setBounds(410,260,280, 30);
        usernameArea.setFont(detFont);
        usernameArea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        usernameArea.setBackground(new Color(249,176,63));
        usernameArea.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        imgJLabel2.add(usernameArea);


        passLabel = new JLabel("Password : ");
        passLabel.setBounds(405, 295, 100,80);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(detFont);
        imgJLabel2.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(410,360,280,30);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        passwordField.setBackground(new Color(249,176,63));
        passwordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        passwordField.setFont(detFont);
        imgJLabel2.add(passwordField);

        changeButton = new JButton("Forget Password");
        changeButton.setBounds(562,400,150,20);
        changeButton.setBorderPainted(false);
        changeButton.setFocusable(false);
        changeButton.setBackground(grayColor);
        changeButton.setForeground(Color.WHITE);
        changeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        changeButton.addMouseListener(this);
        changeButton.addActionListener(this);
        changeButton.setFont(new Font("Open Sans", Font.BOLD, 13));
        imgJLabel2.add(changeButton);

        loginButton = new JButton("Log in");
        loginButton.setBounds(397,460,120,30);
        loginButton.setFont(detFont);
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(Color.BLACK);
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.setFocusable(false);
        loginButton.addMouseListener(this);
        loginButton.addActionListener(this);
        imgJLabel2.add(loginButton);


        exitButton = new JButton("Exit");
        exitButton.setBounds(583,460,120,30);
        exitButton.setFont(detFont);
        exitButton.setBackground(Color.WHITE);
        exitButton.setForeground(Color.BLACK);
        exitButton.setBorderPainted(false);
        exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exitButton.setFocusable(false);
        exitButton.addMouseListener(this);
        exitButton.addActionListener(this);
        imgJLabel2.add(exitButton);

        noteLabel = new JLabel("Don't have an account?");
        noteLabel.setBounds(420,500,200,30);
        noteLabel.setForeground(Color.WHITE);
        noteLabel.setFont(detFont);
        imgJLabel2.add(noteLabel);

        signupButton = new JButton("<html><body><h3><u>Sign Up</u></h3></body></html>");
        signupButton.setBounds(600,505,90,20);
        signupButton.setBackground(grayColor);
        signupButton.setForeground(Color.WHITE);
        signupButton.setBorderPainted(false);
        signupButton.setFocusable(false);
        signupButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signupButton.addMouseListener(this);
		signupButton.addActionListener(this);
        signupButton.setFont(detFont);
        imgJLabel2.add(signupButton);

        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(27,17, 30,30);
        backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setFocusable(false);
		backButton.addActionListener(this);
        backButton.addMouseListener(this);
        imgJLabel2.add(backButton);
        

        aboutButton = new JButton("About");
        aboutButton.setBounds(1000,13,80,20);
        aboutButton.setBackground(grayColor);
        aboutButton.setForeground(Color.WHITE);
        aboutButton.setBorderPainted(false);
        aboutButton.setFocusable(false);
        aboutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        aboutButton.addActionListener(this);
        aboutButton.addMouseListener(this);
        aboutButton.setFont(new Font("Open Sans", Font.BOLD, 12));
        imgJLabel2.add(aboutButton);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == aboutButton)
        {
            JOptionPane.showMessageDialog(null, "RAIYEN ZAYED RAKIN(23-50071-1)\nAVOY MOLLICK(23-50066-1)\nMD. NAWSHIN NAVIN(23-50079-1)\nSAZID HOSSAIN SAMI(23-50102-1)", "Team Illuminati", 1);
        }
		else if (ae.getSource()==loginButton){
			String storeduser=usernameArea.getText();
			String suser="username : "+usernameArea.getText();
			String storedpassword=passwordField.getText();
			
			if(storeduser.isEmpty() || storedpassword.isEmpty()){
				JOptionPane.showMessageDialog(null,"Fill Both Fields");
			}
			else if(validateLogin(storeduser,storedpassword)){
				if(account.starExists(suser)){
                   Home H = new Home(storeduser,storedpassword);
                   H.setVisible(true);
			       this.setVisible(false);
					
				}else{
					GenderCheck G = new GenderCheck(storeduser,storedpassword);
					G.setVisible(true);
				this.setVisible(false);}
			}
			
		else{
			   JOptionPane.showMessageDialog(null, "Invalid username/password.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		}
		else if(ae.getSource()==signupButton){
			Signup su = new Signup();
			su.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==backButton){
			UserAdmin ua = new UserAdmin();
			ua.setVisible(true);
			this.setVisible(false);
		}		
		else if(ae.getSource()==changeButton){
			ForgotPasswordFrame FPF = new ForgotPasswordFrame();
			FPF.setVisible(true);
			this.setVisible(false);
		}		
		else if(ae.getSource()==exitButton){
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
		}
		else if(me.getSource() == aboutButton)
		{
			aboutButton.setBackground(grayColor);
			aboutButton.setForeground(Color.BLACK);
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
        else if(me.getSource() == exitButton)
		{
			exitButton.setBackground(Color.WHITE);
			exitButton.setForeground(yellowColor);
		}
        else if(me.getSource() == signupButton)
		{
			//signupButton.setBackground(oppColor);
			signupButton.setForeground(Color.BLACK);
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
		else if(me.getSource() == aboutButton)
		{
			aboutButton.setBackground(grayColor);
			aboutButton.setForeground(Color.WHITE);
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
        else if(me.getSource() == exitButton)
		{
			exitButton.setBackground(Color.WHITE);
			exitButton.setForeground(Color.BLACK);
		}
        else if(me.getSource() == signupButton)
		{
			//signupButton.setBackground(oppColor);
			signupButton.setForeground(Color.WHITE);
		}
        else
        {
            //good practice
        }
	}
    private boolean validateLogin(String username, String password) {
		boolean flag=false;
		
		file=new File("Data/user.txt");
		try{
		sc=new Scanner(file);
		
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