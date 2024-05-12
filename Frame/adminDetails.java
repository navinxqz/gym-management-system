package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class adminDetails extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage;
    ImageIcon backgroundIcon,logo;
    JLabel imgJLabel1;
    JLabel imgJLabel2;
    JLabel headLabel;
	JLabel userLabel;
	JTextField usernameArea;


    JScrollPane scrollbar;
    JTextArea displayArea;
    JButton removeButton;
   
    JButton backButton;
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;

    public adminDetails()
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
        detFont = new Font("Open Sans", Font.BOLD, 17);

        yellowColor = new Color(249,176,63);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,1);

        backgroundIcon = new ImageIcon("Photo/adminDetails.png");
        imgJLabel2 = new JLabel(backgroundIcon);
        imgJLabel2.setBounds(0,0,1100,700);
        panel.add(imgJLabel2);

        headLabel = new JLabel("DETAILS");
        headLabel.setBounds(150, 525, 310, 60);
        headLabel.setForeground(Color.WHITE);
        headLabel.setFont(new Font("Open Sans", Font.BOLD, 50));
        imgJLabel2.add(headLabel);

        displayArea = new JTextArea(account.getDetails("Data/user.txt"));
        displayArea.setBounds(460, 90, 550, 380);
        displayArea.setFont(new Font("Comic Sans", Font.BOLD, 10));
        imgJLabel2.add(displayArea);
	   
	   
        userLabel = new JLabel("Enter User Name");
        userLabel.setBounds(525, 475,330,80);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Comic Sans", Font.BOLD, 25));
        imgJLabel2.add(userLabel);

        usernameArea = new JTextField();
        usernameArea.setBounds(480,550,310,60);
        usernameArea.setFont(detFont);
        usernameArea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        usernameArea.setBackground(yellowColor);
        usernameArea.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(usernameArea);      

        removeButton = new JButton("REMOVE USER");
        removeButton.setBounds(842,560,165,45);
        removeButton.setFont(detFont);
        removeButton.setBackground(Color.WHITE);
        removeButton.setForeground(Color.BLACK);
        removeButton.setBorderPainted(false);
        removeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        removeButton.setFocusable(false);
        removeButton.setFont(detFont);
        removeButton.addMouseListener(this);
        removeButton.addActionListener(this);
        imgJLabel2.add(removeButton);


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
        
        else if(ae.getSource() == removeButton)
        {
		 account.removeUser("username : "+usernameArea.getText());
            adminDetails d = new adminDetails();
            d.setVisible(true);
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