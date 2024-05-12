package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class adminSubs extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage,logo;
    ImageIcon backgroundIcon;
    JLabel imgJLabel1;
    JLabel imgJLabel2;
    JLabel headLabel;
	JLabel userLabel;
	JTextField usernameArea;

    JScrollPane scrollbar;
    JTextArea displayArea;
    JButton userInfo;
    JButton subsButton;
   
    JButton backButton;
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;

    public adminSubs()
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
        detFont = new Font("Open Sans", Font.BOLD, 12);

        yellowColor = new Color(249,176,63);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,1);

        backgroundIcon = new ImageIcon("Photo/subs.png");
        imgJLabel2 = new JLabel(backgroundIcon);
        imgJLabel2.setBounds(0,0,1100,700);
        panel.add(imgJLabel2);

        headLabel = new JLabel("SUBSCRIPTION");
        headLabel.setBounds(100, 525, 310, 60);
        headLabel.setForeground(Color.WHITE);
        headLabel.setFont(new Font("Open Sans", Font.BOLD, 40));
        imgJLabel2.add(headLabel);
		
        displayArea = new JTextArea(account.getDetails("Data/subscription.txt"));
        displayArea.setBounds(460, 90, 550, 380);
        displayArea.setFont(new Font("Comic Sans", Font.BOLD, 12));
        imgJLabel2.add(displayArea);

        userLabel = new JLabel("Enter User Name");
        userLabel.setBounds(460, 475,330,40);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Comic Sans", Font.BOLD, 25));
        imgJLabel2.add(userLabel);

        usernameArea = new JTextField();
        usernameArea.setBounds(680,480,310,50);
        usernameArea.setFont(new Font("Comic Sans", Font.BOLD, 18));
        usernameArea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        usernameArea.setBackground(yellowColor);
        usernameArea.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(usernameArea);


        userInfo = new JButton("REMOVE SUBSCRIPTION");
        userInfo.setBounds(470,560,185,50);
        userInfo.setFont(detFont);
        userInfo.setBackground(Color.WHITE);
        userInfo.setForeground(Color.BLACK);
        userInfo.setBorderPainted(false);
        userInfo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        userInfo.setFocusable(false);
        userInfo.setFont(detFont);
        userInfo.addMouseListener(this);
        userInfo.addActionListener(this);
        imgJLabel2.add(userInfo);

        subsButton = new JButton("ADD SUBSCRIPTION");
        subsButton.setBounds(820,560,185,50);
        subsButton.setFont(detFont);
        subsButton.setBackground(Color.WHITE);
        subsButton.setForeground(Color.BLACK);
        subsButton.setBorderPainted(false);
        subsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        subsButton.setFocusable(false);
        subsButton.setFont(detFont);
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
            adminHome h = new adminHome();
            h.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == userInfo)
        {
		    account.removeSubscription("username : "+usernameArea.getText());
		    adminSubs s = new adminSubs();
            s.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == subsButton)
        {
		    account.addSubscription("username : "+usernameArea.getText());
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
        if(me.getSource() == backButton)
		{
			backButton.setBackground(grayColor);
		}
		
		
		// else if(me.getSource() == loginButton)
		// {
		// 	loginButton.setBackground(Color.WHITE);
		// 	loginButton.setForeground(yellowColor);
		// }
        
       
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
		
		
		// else if(me.getSource() == loginButton)
		// {
		// 	loginButton.setBackground(Color.WHITE);
		// 	loginButton.setForeground(Color.BLACK);
		// }
        
        
        else
        {
            //good practice
        }
	}
    
}