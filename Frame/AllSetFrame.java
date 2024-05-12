package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class AllSetFrame extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage;
    ImageIcon backgroundIcon,logo;
    JLabel imgJLabel1;
    JLabel imgJLabel2;

    JLabel headLabel;
    
    
   
   
    JButton backButton;
    JButton nextButton;
    
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;
    private String name,password;
	
    public AllSetFrame(String name,String password)
    {
	    super("AIUB FITNESS ZONE");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");		
		this.setIconImage(logo.getImage());
		
		this.name=name;
		this.password=password;

        panel = new JPanel();
        panel.setLayout(null);       

        headFont = new Font("Comic Sans", Font.BOLD, 50);
        detFont = new Font("Open Sans", Font.BOLD, 15);

        yellowColor = new Color(255,181,62);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,(int) 0.53);

        backgroundIcon = new ImageIcon("Photo/Background.png");
        imgJLabel2 = new JLabel(backgroundIcon);
        imgJLabel2.setBounds(0,0,1100,700);
        panel.add(imgJLabel2);

        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(29,27, 32,32);
        backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);
        backButton.addMouseListener(this);
        backButton.addActionListener(this);
        imgJLabel2.add(backButton);
        
        logoImage = new ImageIcon("Photo/right.png");
        imgJLabel1 = new JLabel(logoImage);
        imgJLabel1.setBounds(495,250,100,100);
        imgJLabel2.add(imgJLabel1);

        headLabel = new JLabel("YOU ARE ALL SET.");
        headLabel.setBounds(310, 380, 800, 100);
        headLabel.setFont(headFont);
        headLabel.setForeground(yellowColor);
        imgJLabel2.add(headLabel);

        nextButton = new JButton("PROCEED");
        nextButton.setBounds(390,500, 290,60);
        nextButton.setBackground(new Color(249,176,63));
        nextButton.setForeground(Color.WHITE);
        nextButton.setFont(headFont);
        nextButton.setBorderPainted(false);
        nextButton.setFocusable(false);
        nextButton.addMouseListener(this);
        nextButton.addActionListener(this);
        imgJLabel2.add(nextButton);


        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==nextButton){
		    account.addStar("username : "+name);
            Home H = new Home(name,password);
            H.setVisible(true);
			this.setVisible(false);
	  }
	  else if(ae.getSource()==backButton){
            EquipmentChecking ASF = new EquipmentChecking(name,password);
            ASF.setVisible(true);
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
        
	}
	public void mouseExited(MouseEvent me)
	{
		
	}

}