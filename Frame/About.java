package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.*;
//import java.Images.*;



public class About extends JFrame implements ActionListener{
	JLabel imglabel;
	JButton back;
	JPanel panel;
	ImageIcon img,backimg,logo;
	private String name,password;
public About(String name,String password){
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
	
	img = new ImageIcon("Photo/About.png");//Background image
	imglabel=new JLabel(img);
	imglabel.setBounds(0,0,1100,700);
	panel.add(imglabel);	
	
	
	backimg =new ImageIcon("Photo/backbutton.png");
	
    back = new JButton(backimg);
	back.setBounds(100,50,40,40);
	back.setFont(new Font("Open Sans",Font.BOLD,25));
    back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	back.setBackground(Color.WHITE);
	back.setFocusable(false);
	back.setBorderPainted(false);
	back.addActionListener(this);
	imglabel.add(back);	
			
	


this.add(panel);

}
public void actionPerformed(ActionEvent ae){

	if(ae.getSource()==back){
		Home H = new Home(name,password);
		H.setVisible(true);
		
		this.setVisible(false);
	}
}

}
	
	