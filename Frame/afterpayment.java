package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.*;


//import java.Images.*;



public class afterpayment extends JFrame implements ActionListener{
	JLabel imglabel,Title,STitle;
	JButton close;
	JPanel panel;
	ImageIcon img,logo;
	Color mycolor;
	private String name,password;
	
	
public afterpayment(String name,String password){
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
	
	
	img = new ImageIcon("Photo/afterpayment.png");//Background image
	imglabel=new JLabel(img);
	imglabel.setBounds(0,0,1100,700);
	panel.add(imglabel);	
	
	
	Title=new JLabel("SUCCESSFULLY");//1st title line
	Title.setBounds(380,260,500,100);
	Title.setFont(new Font("Open Sans",Font.BOLD,40));
	Title.setForeground(Color.WHITE);
	imglabel.add(Title);	
	
	STitle=new JLabel("SUBMITTED");//2ND title line
	STitle.setBounds(430,310,500,100);
	STitle.setFont(new Font("Open Sans",Font.BOLD,40));
	STitle.setForeground(Color.WHITE);
	imglabel.add(STitle);

	
    close = new JButton("Colse this window");
	close.setBounds(440,540,220,45);
	close.setFont(new Font("Open Sans",Font.BOLD,21));
    close.setCursor(new Cursor(Cursor.HAND_CURSOR));
	close.setForeground(Color.WHITE);
	close.setBackground(mycolor);
	close.setFocusable(false);
	close.setBorderPainted(false);
	close.addActionListener(this);
	imglabel.add(close);		
			
	


this.add(panel);
}
public void actionPerformed(ActionEvent ae){

	if(ae.getSource()==close){
		Home H = new Home(name,password);
		H.setVisible(true);
		
		this.setVisible(false);
	}
}

}
	
	