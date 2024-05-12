package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.*;
//import java.Images.*;



public class Coach extends JFrame implements ActionListener{
	JLabel imglabel,Title;
	JButton with,without,back;
	JPanel panel;
	ImageIcon img,backimg,logo;
	Color mycolor;
	private String name,password;
public Coach(String name,String password){
	    super("AIUB FITNESS ZONE");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");	
		this.setIconImage(logo.getImage());
		
	mycolor =new Color(249,176,63);
	
	panel = new JPanel();
	panel.setLayout(null);
	
	img = new ImageIcon("Photo/Coach.png");//Background image
	imglabel=new JLabel(img);
	imglabel.setBounds(0,0,1100,700);
	panel.add(imglabel);	
	
	Title=new JLabel("Coach Tips");//1st title line
	Title.setBounds(250,30,700,100);
	Title.setFont(new Font("Open Sans",Font.BOLD,100));
	Title.setForeground(Color.WHITE);
	imglabel.add(Title);	
	

	
	with = new JButton("With Equipments");
	with.setBounds(280,190,500,140);
	with.setFont(new Font("Open Sans",Font.BOLD,50));
	with.setCursor(new Cursor(Cursor.HAND_CURSOR));
	with.setForeground(Color.WHITE);
	with.setBackground(mycolor);
	with.setFocusable(false);
	with.setBorderPainted(false);
	with.addActionListener(this);
	imglabel.add(with);	
	
	without = new JButton("Without Equipments");
	without.setBounds(280,400,500,140);
	without.setFont(new Font("Open Sans",Font.BOLD,45));
    without.setCursor(new Cursor(Cursor.HAND_CURSOR));
	without.setForeground(Color.WHITE);
	without.setBackground(mycolor);
	without.setFocusable(false);
	without.setBorderPainted(false);
    without.addActionListener(this);
	imglabel.add(without);	

	backimg =new ImageIcon("Photo/backbutton.png");
	
    back = new JButton(backimg);
	back.setBounds(100,50,40,40);
	back.setFont(new Font("Open Sans",Font.BOLD,25));
    back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	back.setForeground(mycolor);
	back.setBackground(mycolor);
	back.setFocusable(false);
	back.setBorderPainted(false);
	back.addActionListener(this);
	imglabel.add(back);			
	


this.add(panel);
}
public String getpass(){
	return password;
}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==with){
			Withframe wf = new Withframe(name,password);
			wf.setVisible(true);
			this.setVisible(false);
		}
	    else if(ae.getSource()==without){
			Withoutframe wof = new Withoutframe(name,password);
			wof.setVisible(true);
			this.setVisible(false);

		}
		else if(ae.getSource()==back){
			Home H = new Home(name,password);
			H.setVisible(true);
			this.setVisible(false);

	}
	}

}
	
	