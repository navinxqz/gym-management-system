package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class adminHome extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage,logo;
    ImageIcon backgroundIcon;
    JLabel imgJLabel1;
    JLabel imgJLabel2;
    JLabel headLabel;

    JButton userInfo;
    JButton detailsButton;
    JButton subsButton;

   
    JButton changeButton;
    JButton backButton;
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;

    public adminHome()
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

        headFont = new Font("Comic Sans", Font.BOLD, 25);
        detFont = new Font("Open Sans", Font.BOLD, 30);

        yellowColor = new Color(255,181,62);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,1);

        backgroundIcon = new ImageIcon("Photo/adminHome.png");
        imgJLabel2 = new JLabel(backgroundIcon);
        imgJLabel2.setBounds(0,0,1100,700);
        panel.add(imgJLabel2);

        headLabel = new JLabel("ADMIN PANEL");
        headLabel.setBounds(400, 80, 400, 60);
        headLabel.setForeground(Color.WHITE);
        headLabel.setFont(new Font("Open Sans", Font.BOLD, 45));
        imgJLabel2.add(headLabel);

        userInfo = new JButton("ADD USER");
        userInfo.setBounds(65,570,240,70);
        userInfo.setFont(detFont);
        userInfo.setBackground(yellowColor);
        userInfo.setForeground(Color.WHITE);
        userInfo.setBorderPainted(false);
        userInfo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        userInfo.setFocusable(false);
        userInfo.setFont(detFont);
        userInfo.addMouseListener(this);
        userInfo.addActionListener(this);
        imgJLabel2.add(userInfo);

        detailsButton = new JButton("SHOW DETAILS");
        detailsButton.setBounds(430,570,240,70);
        detailsButton.setFont(detFont);
        detailsButton.setBackground(yellowColor);
        detailsButton.setForeground(Color.WHITE);
        detailsButton.setBorderPainted(false);
        detailsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        detailsButton.setFocusable(false);
        detailsButton.setFont(headFont);
        detailsButton.addMouseListener(this);
        detailsButton.addActionListener(this);
        imgJLabel2.add(detailsButton);

        subsButton = new JButton("SUBSCRIPTION");
        subsButton.setBounds(795,570,240,70);
        subsButton.setFont(detFont);
        subsButton.setBackground(yellowColor);
        subsButton.setForeground(Color.WHITE);
        subsButton.setBorderPainted(false);
        subsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        subsButton.setFocusable(false);
        subsButton.setFont(headFont);
        subsButton.addMouseListener(this);
        subsButton.addActionListener(this);
        imgJLabel2.add(subsButton);


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

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == backButton)
        {
		 AdminLogin AL = new AdminLogin();
		 AL.setVisible(true);
		 this.setVisible(false);    
        }
        else if(ae.getSource() == userInfo)
        {
            adminAdd a = new adminAdd();
            a.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == detailsButton)
        {
            adminDetails d = new adminDetails();
            d.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == subsButton)
        {
            adminSubs s = new adminSubs();
            s.setVisible(true);
            this.setVisible(false);
        }
        else{

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
        if(me.getSource() == detailsButton)
		{
            detailsButton.setForeground(Color.BLACK);
		}
		else if(me.getSource() == userInfo)
        {
            userInfo.setForeground(Color.BLACK);
        }
        else if(me.getSource() == subsButton)
        {
            subsButton.setForeground(Color.BLACK);
        }
        else
        {
            //good practice
        }
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == detailsButton)
		{
            detailsButton.setForeground(Color.WHITE);
		}
		else if(me.getSource() == userInfo)
        {
            userInfo.setForeground(Color.WHITE);
        }
        else if(me.getSource() == subsButton)
        {
            subsButton.setForeground(Color.WHITE);
        }
        else
        {
            //good practice
        }
	}
    public static void main(String[] args) {
        adminHome f = new adminHome();
        f.setVisible(true);
    }
}