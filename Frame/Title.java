package Frame;


import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.*;




public class Title extends JFrame implements ActionListener{
	JLabel qoute,Title,STitle,imglabel;
	JButton Start;
	JPanel panel;
	ImageIcon img,logo;
	Color mycolor;
public Title (){
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
	panel.setBackground(Color.BLACK);
	
	img = new ImageIcon("Photo/Titleimg.png");//Background image
	imglabel=new JLabel(img);
	imglabel.setBounds(0,0,1100,700);
	this.add(imglabel);
	
	qoute=new JLabel("ADDICTED TO GETTING STRONGER");//Qoute
	qoute.setBounds(80,20,500,150);
	qoute.setFont(new Font("Open Sans",Font.BOLD,18));
	qoute.setForeground(Color.WHITE);
	imglabel.add(qoute);		
	
	
	Title=new JLabel("AIUB");//1st title line
	Title.setBounds(180,200,500,150);
	Title.setFont(new Font("Open Sans",Font.BOLD,150));
	Title.setForeground(Color.WHITE);
	imglabel.add(Title);	
	
	STitle=new JLabel("FITNESS ZONE");//2nd title line
	STitle.setBounds(80,350,600,100);
	STitle.setFont(new Font("Open Sans",Font.BOLD,80));
	STitle.setForeground(Color.WHITE);
	imglabel.add(STitle);
	
	Start = new JButton("Get Started");
	Start.setBounds(275,520,220,55);
	Start.setFont(new Font("Open Sans",Font.BOLD,25));
	Start.setCursor(new Cursor(Cursor.HAND_CURSOR));
	Start.setForeground(Color.WHITE);
	Start.setBackground(mycolor);
	Start.setFocusable(false);
	Start.addActionListener(this);
	imglabel.add(Start);

	
	this.add(panel);
}
public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==Start){
        info1 i1 = new info1();
		i1.setVisible(true);
		this.setVisible(false);
	}
}

}
	
	