package Frame;
import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class EquipmentChecking extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage;
    ImageIcon backgroundIcon,logo;
    JLabel imgJLabel1;
    JLabel detailsJLabel1;
    JLabel detailsJLabel2;
    JButton backButton;
    JButton nextButton;
    JRadioButton equip, noequip;
    ButtonGroup e;
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;
	private String name,password;

    public EquipmentChecking(String name,String password)
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
        panel.setBackground(Color.CYAN);

        headFont = new Font("Open Sans", Font.BOLD, 35);
        detFont = new Font("Open Sans", Font.BOLD, 20);

        yellowColor = new Color(249, 176, 63);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,(int) 0.53);

        backgroundIcon = new ImageIcon("Photo/equipment.png");
        imgJLabel1 = new JLabel(backgroundIcon);
        imgJLabel1.setBounds(0,0,1100,700);
        panel.add(imgJLabel1);

        equip = new JRadioButton(" WITH EQUIPMENT");
        equip.setBounds(100,450,400,50);
        equip.setBackground(grayColor);
        equip.setBorderPainted(false);
        equip.setFocusable(false);
        equip.setForeground(Color.WHITE);
        equip.addMouseListener(this);
        equip.setFont(headFont);
        imgJLabel1.add(equip);

        noequip = new JRadioButton(" WITHOUT EQUIPMENT");
        noequip.setBounds(593,450,420,50);
        noequip.setBackground(grayColor);
        noequip.setBorderPainted(false);
        noequip.setFocusable(false);
        noequip.setForeground(Color.WHITE);
        noequip.addMouseListener(this);
        noequip.setFont(headFont);
        imgJLabel1.add(noequip);
        
        e = new ButtonGroup();
        e.add(equip);
        e.add(noequip);

        detailsJLabel1 = new JLabel("<html><body>Includes different types of machinery of the gym and full-body exercises.</body></html>");
        detailsJLabel1.setBounds(100,530,400,50);
        detailsJLabel1.setBackground(Color.yellow);
        detailsJLabel1.setForeground(Color.WHITE);
        detailsJLabel1.setFont(detFont);
        imgJLabel1.add(detailsJLabel1);

        detailsJLabel2 = new JLabel("<html><body>Includes different types of instructed full-body exercises.</body></html>");
        detailsJLabel2.setBounds(607,530,400,50);
        detailsJLabel2.setBackground(Color.yellow);
        detailsJLabel2.setForeground(Color.WHITE);
        detailsJLabel2.setFont(detFont);
        imgJLabel1.add(detailsJLabel2);
        
       
        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(26,24, 30,30);
        backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);
        backButton.addMouseListener(this);
        imgJLabel1.add(backButton);
        
        nextButton = new JButton("NEXT");
        nextButton.setBounds(960,20,100,40);
		nextButton.setFont(new Font("Open Sans",Font.BOLD,18));
		nextButton.setBorderPainted(false);
		nextButton.setFocusable(false);
        nextButton.setBackground(yellowColor);
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        nextButton.addMouseListener(this);
        imgJLabel1.add(nextButton);
       

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==nextButton){

				if(equip.isSelected())

				{
				  account.addWith("username : "+name);
				  YesEquipment ye = new YesEquipment(name,password);

				  ye.setVisible(true);

				  this.setVisible(false);

				}

				else if(noequip.isSelected())

				{
				  account.addWithout("username : "+name);
				  NoEquipment ne = new NoEquipment(name,password);

				  ne.setVisible(true);

				  this.setVisible(false);


                }

        else{}


      }
		else if(ae.getSource()==backButton){
		    DaySelection D = new DaySelection(name,password);
			D.setVisible(true);
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
      if(me.getSource() == equip)
      {
        equip.setForeground(yellowColor);
      }
      else if(me.getSource() == noequip)
      {
        noequip.setForeground(yellowColor);
      }
      else
      {

      }
	}
	public void mouseExited(MouseEvent me)
	{
	  if(me.getSource() == equip)
      {
        equip.setForeground(Color.WHITE);
      }
      else if(me.getSource() == noequip)
      {
        noequip.setForeground(Color.WHITE);
      }
      else
      {
        
      }
	}

}