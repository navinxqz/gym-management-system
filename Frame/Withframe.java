package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.*;
//import java.Images.*;



public class Withframe extends JFrame implements ActionListener{
	JLabel imglabel,Title;
	JButton back;
	JPanel panel;
	ImageIcon img,backimg,logo;
	Color mycolor;
	private String name,password;
public Withframe(String name,String password){
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
	
	img = new ImageIcon("Photo/With.png");//Background image
	imglabel=new JLabel(img);
	imglabel.setBounds(0,0,1100,700);
	panel.add(imglabel);	
	Title=new JLabel("Follow Tips");//1st title line
	Title.setBounds(250,0,700,100);
	Title.setFont(new Font("Open Sans",Font.BOLD,80));
	Title.setForeground(Color.WHITE);
	imglabel.add(Title);

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
public void actionPerformed(ActionEvent ae){

	if(ae.getSource()==back){
		Coach C = new Coach(name,password);
		C.setVisible(true);
		
		this.setVisible(false);
	}
}

}
	
	