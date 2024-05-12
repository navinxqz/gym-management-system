package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class info2 extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage,logo;
    ImageIcon backgroundIcon;
    ImageIcon pic1;  //310, 233
    ImageIcon pic2;
    JLabel imgJLabel1;
    JLabel imgJLabel2;
    JLabel imgJLabel3;
    JLabel detailsJLabel1;
    JLabel detailsJLabel2;
    JButton backButton;
    JButton nextButton;
    
    Font headFont;
    Font detFont;
    Color yellowColor;
    Color grayColor;

    public info2()
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

        headFont = new Font("Open Sans", Font.BOLD, 55);
        detFont = new Font("Open Sans", Font.BOLD, 30);

        yellowColor = new Color(249, 176, 63);
        grayColor = new Color(145,144,145);

        backgroundIcon = new ImageIcon("Photo/info-2nd-portion.png");
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

        detailsJLabel1 = new JLabel("FACILITIES");
        detailsJLabel1.setBounds(500,160,350,60);
        detailsJLabel1.setBackground(Color.yellow);
        detailsJLabel1.setForeground(Color.WHITE);
        detailsJLabel1.setFont(headFont);
        imgJLabel1.add(detailsJLabel1);

        detailsJLabel2 = new JLabel("<html><body>This includes offering a range of exercise equipments and facilities to cater to various fitness levels and interests.<html><body>");
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
        backButton.addActionListener(this);
        backButton.addMouseListener(this);
        imgJLabel1.add(backButton);
        
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
        if(ae.getSource() == backButton)
        {
            info1 i = new info1();
            i.setVisible(true);
            this.setVisible(false);
        }
		else if(ae.getSource()==nextButton){
			UserAdmin ua = new UserAdmin();
			ua.setVisible(true);
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
     else
     {
        
     }
	}

}