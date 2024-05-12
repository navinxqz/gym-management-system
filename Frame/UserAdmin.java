package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class UserAdmin extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage,logo;
    ImageIcon backgroundIcon;
    ImageIcon pic1;  //285,285
    ImageIcon pic2;
    JLabel imgJLabel1;
    JLabel imgJLabel2;
    JLabel imgJLabel3;
    JButton backButton;
    JButton userButton;
    JButton adminButton;
    
    Font headFont;
    Font detFont;
    Color yellowColor;
    Color grayColor;

    public UserAdmin()
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

        headFont = new Font("Open Sans", Font.BOLD, 65);
        detFont = new Font("Open Sans", Font.BOLD, 21);

        yellowColor = new Color(249, 176, 63);
        grayColor = new Color(145,144,145);

        backgroundIcon = new ImageIcon("Photo/OR.png");
        imgJLabel1 = new JLabel(backgroundIcon);
        imgJLabel1.setBounds(0,0,1100,700);
        panel.add(imgJLabel1);

        pic1 = new ImageIcon("Photo/user.png");
        imgJLabel2 = new JLabel(pic1);
        imgJLabel2.setBounds(120, 140, 285,285);
        imgJLabel1.add(imgJLabel2);

        pic2 = new ImageIcon("Photo/admin.jpg");
        imgJLabel3 = new JLabel(pic2);
        imgJLabel3.setBounds(695, 140, 285,285);
        imgJLabel1.add(imgJLabel3);

        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(21,24, 30,30);
        backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.addMouseListener(this);
        backButton.addActionListener(this);
        imgJLabel1.add(backButton);
        
        userButton = new JButton("Log in as a User");
        userButton.setBounds(160, 510, 200,50);
        userButton.setBackground(yellowColor);
        userButton.setForeground(Color.WHITE);
        userButton.setBorderPainted(false);
        userButton.setFont(detFont);
        userButton.setFocusable(false);
        userButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        userButton.addMouseListener(this);
        userButton.addActionListener(this);
        imgJLabel1.add(userButton);

        adminButton = new JButton("Log in as an Admin");
        adminButton.setBounds(720, 510, 230,50);
        adminButton.setBackground(yellowColor);
        adminButton.setForeground(Color.WHITE);
        adminButton.setBorderPainted(false);
        adminButton.setFont(detFont);
        adminButton.setFocusable(false);
        adminButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminButton.addMouseListener(this);
        adminButton.addActionListener(this);
        imgJLabel1.add(adminButton);

       

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==userButton){
		 Login L = new Login();
		 L.setVisible(true);
		 this.setVisible(false);
	 }
	 else if(ae.getSource()==adminButton){
		 AdminLogin AL = new AdminLogin();
		 AL.setVisible(true);
		 this.setVisible(false);
	 }
	 else if(ae.getSource()==backButton){
		 info1 i1 = new info1();
		 i1.setVisible(true);
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
     if(me.getSource() == userButton)
     {
        userButton.setForeground(Color.BLACK);
     }
     else if(me.getSource() == adminButton)
     {
        adminButton.setForeground(Color.BLACK);
     }
     else
     {

     }
	}
	public void mouseExited(MouseEvent me)
	{
	 if(me.getSource() == userButton)
     {
        userButton.setForeground(Color.WHITE);
     }
     else if(me.getSource() == adminButton)
     {
        adminButton.setForeground(Color.WHITE);
     }
     else
     {
        
     }
	}
    public static void main(String[] args) {
        UserAdmin f = new UserAdmin();
        f.setVisible(true);
    }
}