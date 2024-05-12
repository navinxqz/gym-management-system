package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class info1 extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage;
    ImageIcon backgroundIcon;
    ImageIcon pic1;  //310, 233
    ImageIcon pic2,logo;
    JLabel imgJLabel1;
    JLabel imgJLabel2;
    JLabel imgJLabel3;
    JLabel detailsJLabel1;
    JLabel detailsJLabel2;
    JButton backButton;
    JButton nextButton;
    JButton skipButton;
    
    Font headFont;
    Font detFont;
    Color yellowColor;
    Color grayColor;

    public info1()
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
        detFont = new Font("Open Sans", Font.BOLD, 30);

        yellowColor = new Color(249, 176, 63);
        grayColor = new Color(145,144,145);

        backgroundIcon = new ImageIcon("Photo/info-first-portion.png");
        imgJLabel1 = new JLabel(backgroundIcon);
        imgJLabel1.setBounds(0,0,1100,700);
        panel.add(imgJLabel1);

        pic1 = new ImageIcon("Photo/pic1.jpg");
        imgJLabel2 = new JLabel(pic1);
        imgJLabel2.setBounds(110, 140, 310,233);
        imgJLabel1.add(imgJLabel2);

        pic2 = new ImageIcon("Photo/pic2.jpg");
        imgJLabel3 = new JLabel(pic2);
        imgJLabel3.setBounds(110, 390, 310,233);
        imgJLabel1.add(imgJLabel3);

        detailsJLabel1 = new JLabel("GOALS");
        detailsJLabel1.setBounds(500,160,350,60);
        detailsJLabel1.setBackground(Color.yellow);
        detailsJLabel1.setForeground(Color.WHITE);
        detailsJLabel1.setFont(headFont);
        imgJLabel1.add(detailsJLabel1);

        detailsJLabel2 = new JLabel("<html><body>The primary goal of a AIUB gymnasium is to encourage physical activity and help individuals achieve and maintain a healthy lifestyle.<html><body>");
        detailsJLabel2.setBounds(507,210,450,320);
        detailsJLabel2.setBackground(Color.yellow);
        detailsJLabel2.setForeground(Color.WHITE);
        detailsJLabel2.setFont(detFont);
        imgJLabel1.add(detailsJLabel2);

        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(21,34, 30,30);
        backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.addMouseListener(this);
        backButton.addActionListener(this);
        imgJLabel1.add(backButton);

        skipButton = new JButton("SKIP");
        skipButton.setBounds(695, 560,130,35);
        skipButton.setBackground(grayColor);
        skipButton.setForeground(Color.WHITE);
        skipButton.setBorderPainted(false);
        skipButton.setFocusable(false);
        skipButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        skipButton.addActionListener(this);
        skipButton.setFont(detFont);
        skipButton.addMouseListener(this);
        imgJLabel1.add(skipButton);
        
        nextButton = new JButton("NEXT");
        nextButton.setBounds(885, 560,130,35);
        nextButton.setBackground(grayColor);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBorderPainted(false);
        nextButton.setFocusable(false);
        nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        nextButton.addActionListener(this);
        nextButton.setFont(detFont);
        nextButton.addMouseListener(this);
        imgJLabel1.add(nextButton);
       

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==skipButton){
			UserAdmin ua = new UserAdmin();
			ua.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==nextButton){
			info2 f2 = new info2();
			f2.setVisible(true);
			this.setVisible(false);
		}		
		else if(ae.getSource()==backButton){
			Title f2 = new Title();
			f2.setVisible(true);
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
     if(me.getSource() == nextButton)
     {
        nextButton.setForeground(Color.BLACK);
     }
     else if(me.getSource() == skipButton) 
     {
        skipButton.setForeground(Color.BLACK);
     }
     else 
     {

     }
	}
	public void mouseExited(MouseEvent me)
	{
	 if(me.getSource() == nextButton)
     {
        nextButton.setForeground(Color.WHITE);
     }
     else if(me.getSource() == skipButton) 
     {
        skipButton.setForeground(Color.WHITE);
     }
     else
     {
        
     }
	}
}