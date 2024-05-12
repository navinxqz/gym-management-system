package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GenderCheck  extends JFrame implements MouseListener, ActionListener
{

	private JPanel panel;
	private ImageIcon backgroundIcon,maleicon,femaleicon,logo;
	private JLabel imgLabel, toplbl;
	private JButton bt1,con,male,female,eButton;
	private String name,password;

	public GenderCheck(String name,String password){
	    super("AIUB FITNESS ZONE");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");		
		this.setIconImage(logo.getImage());
		
		
		panel= new JPanel();
		panel.setLayout(null);

		
		this.name=name;
		this.password=password;

        backgroundIcon = new ImageIcon("Photo/frame2.png");
        imgLabel = new JLabel(backgroundIcon);
        imgLabel.setSize(1100,700);
        panel.add(imgLabel);

		maleicon= new ImageIcon("Photo/tmale.png");
		femaleicon=new ImageIcon("Photo/tfemale.png");

		male = new JButton();
		male.setBounds(94,285,188,182);
		male.setBackground(new Color(0x908f8f));
		male.addMouseListener(this);
		male.setFocusable(false);
	//	male.setBorderPainted(false);
		male.setIcon(maleicon);
		imgLabel.add(male);

		female = new JButton();
		female.setBounds(306,288,188,182);
		female.setBackground(new Color(0x908f8f));
		female.addMouseListener(this);
		female.setFocusable(false);
	//	female.setBorderPainted(false);
		female.setIcon(femaleicon);
		imgLabel.add(female);

		toplbl= new JLabel("Please Indicate Your Gender") ;
		toplbl.setBounds(80,165,(int)434.6,37);
		toplbl.setForeground(new Color(0xE9E8E8));
		toplbl.setFont(new Font("Gotham",Font.BOLD,32));
		imgLabel.add(toplbl);

		//back button
		Icon icon = new ImageIcon("Photo/backButton.png");
        bt1 = new JButton(icon);
        bt1.setBounds(77,43,48,48);
        bt1.setBackground(new Color(0x646364));
        bt1.setBorderPainted(false);
        bt1.setFocusable(false);
        bt1.addActionListener(this);
        imgLabel.add(bt1);

		//next button
		con=new JButton("Next");
		con.setBounds(130,497,315,49);
		con.setBackground(new Color(0xF9B03F));
		con.setForeground(Color.WHITE);
        con.setBorderPainted(false);
        con.setFocusable(false);
        con.setFont(new Font("Gotham",Font.BOLD,20));
		con.addActionListener(this);
		con.setEnabled(false);
		imgLabel.add(con);
/*
		//exit button	
		Icon xIcon = new ImageIcon("");
		eButton= new JButton(xIcon);
        eButton.setBounds(77,43,48,48);
        eButton.setBackground(new Color(0x646364));
        eButton.setBorderPainted(false);
        eButton.setFocusable(false);
        eButton.addActionListener(this);
        imgLabel.add(eButton);
*/

		this.add(panel);		
	}
	//mouse listener
	  public void mouseClicked(MouseEvent me){
		if(me.getSource() == male){
			con.setEnabled(true);
			male.setBackground(new Color(0xF9B03F)); //male
			female.setBackground(new Color(0x908f8f));
		}
		else if(me.getSource()==female){
			con.setEnabled(true);
			female.setBackground(new Color(0xF9B03F));
			male.setBackground(new Color(0x908f8f));
		}
	  }
	  public void mousePressed(MouseEvent me){}
	  public void mouseReleased(MouseEvent me){}
	  public void mouseEntered(MouseEvent me){}
	  public void mouseExited(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	  {
		  
		  String command=ae.getActionCommand();
		  
		  
		  if (con.getText().equals(command)){
			//next button
			  BMI B =new BMI(name,password);
		      B.setVisible(true);
			  this.setVisible(false);
		  }
	  }

}