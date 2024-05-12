package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class NoEquipment extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage,logo;
    ImageIcon backgroundIcon;
    JLabel imgJLabel1;
    JLabel imgJLabel2;

    JLabel pushupLabel;
    JLabel jumpLabel;
    JLabel situpLabel;
    JLabel pullupLabel;
    
   
   
    JButton backButton;
    JButton nextButton;
    
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;
	
	private String name,password;

    public NoEquipment(String name,String password)
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

        headFont = new Font("Comic Sans", Font.BOLD, 38);
        detFont = new Font("Open Sans", Font.BOLD, 15);

        yellowColor = new Color(255,181,62);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,(int) 0.53);

        backgroundIcon = new ImageIcon("Photo/noequip1.png");
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
        
        pushupLabel = new JLabel("PUSH-UPS");
        pushupLabel.setBounds(275,170,220,100);
        pushupLabel.setForeground(yellowColor);
        pushupLabel.setFont(headFont);
        imgJLabel2.add(pushupLabel);

        jumpLabel = new JLabel("<html><body>JUMPING JACKS</body></html>");
        jumpLabel.setBounds(832,170,220,100);
        jumpLabel.setForeground(yellowColor);
        jumpLabel.setFont(headFont);
        imgJLabel2.add(jumpLabel);

        situpLabel = new JLabel("SIT-UPS");
        situpLabel.setBounds(320,435,220,100);
        situpLabel.setForeground(yellowColor);
        situpLabel.setFont(headFont);
        imgJLabel2.add(situpLabel);

        pullupLabel = new JLabel("PULL-UPS");
        pullupLabel.setBounds(815,435,220,100);
        pullupLabel.setForeground(yellowColor);
        pullupLabel.setFont(headFont);
        imgJLabel2.add(pullupLabel);

        nextButton = new JButton("NEXT");
        nextButton.setBounds(800,610, 190,40);
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
			AllSetFrame asf = new AllSetFrame(name,password);
			asf.setVisible(true);
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