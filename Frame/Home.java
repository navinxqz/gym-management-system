package Frame;


import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.*;
//import java.Images.*;


public class Home extends JFrame implements ActionListener,MouseListener{
	JLabel imglabel,Title,STitle;
	JButton progress,tips,help,probutton,signout,aboutus,userplan,exit;
	JPanel panel;
	ImageIcon img,profile,logo;
	Color mycolor,homec;
	private String name,password;
	
public Home (String name,String password){
	    super("AIUB FITNESS ZONE");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");		
		this.setIconImage(logo.getImage());
	
    this.name=name;
	this.password=password;
		
	mycolor =new Color(249,176,63);
	homec =new Color(111,75,28);
	
	panel = new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.BLACK);
	
	img = new ImageIcon("Photo/Home.png");//Background image
	imglabel=new JLabel(img);
	imglabel.setBounds(0,0,1100,700);
	panel.add(imglabel);	

	
	progress = new JButton("Subscription");
	progress.setBounds(0,23,200,60);
	progress.setFont(new Font("Open Sans",Font.BOLD,20));
	progress.setCursor(new Cursor(Cursor.HAND_CURSOR));
	progress.setForeground(Color.WHITE);
	progress.setBackground(mycolor);
	progress.setFocusable(false);
	progress.setBorderPainted(false);
	progress.addActionListener(this);
	imglabel.add(progress);	
	
	tips = new JButton("Coach Tips");
	tips.setBounds(300,23,150,60);
	tips.setFont(new Font("Open Sans",Font.BOLD,20));
    tips.setCursor(new Cursor(Cursor.HAND_CURSOR));
	tips.setForeground(Color.WHITE);
	tips.setBackground(mycolor);
	tips.setFocusable(false);
	tips.setBorderPainted(false);
	tips.addActionListener(this);
	imglabel.add(tips);		
	
	help = new JButton("Helpline");
	help.setBounds(600,23,150,60);
	help.setFont(new Font("Open Sans",Font.BOLD,20));
    help.setCursor(new Cursor(Cursor.HAND_CURSOR));
	help.setForeground(Color.WHITE);
	help.setBackground(mycolor);
	help.setFocusable(false);
	help.setBorderPainted(false);
	help.addActionListener(this);
	imglabel.add(help);	
	
	//profile = new ImageIcon("profilelogo.png");//Background image
	probutton =new JButton("Profile");
	probutton.setBounds(880,128,220,61);
    probutton.setFont(new Font("Open Sans",Font.BOLD,30));
    probutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
	probutton.setForeground(Color.WHITE);
	probutton.setBackground(mycolor);
	probutton.setBorderPainted(false);
	probutton.setFocusable(false);
	probutton.addActionListener(this);
	imglabel.add(probutton);	
	
	signout =new JButton("Sign Out"); 
	signout.setBounds(920,233,200,60);
	signout.setFont(new Font("Open Sans",Font.BOLD,27));
    signout.setCursor(new Cursor(Cursor.HAND_CURSOR));
	signout.setForeground(Color.WHITE);
	signout.setBackground(mycolor);
	signout.setBorderPainted(false);
	signout.setFocusable(false);
	signout.addActionListener(this);
	imglabel.add(signout);		
	
	aboutus =new JButton("About"); 
	aboutus.setBounds(1000,330,95,40);
	aboutus.setFont(new Font("Open Sans",Font.BOLD,21));
    aboutus.setCursor(new Cursor(Cursor.HAND_CURSOR));
	aboutus.setForeground(Color.WHITE);
	aboutus.setBackground(mycolor);
	aboutus.setBorderPainted(false);
	aboutus.setFocusable(false);
	aboutus.addActionListener(this);
	aboutus.addMouseListener(this);
	imglabel.add(aboutus);	
	
	userplan =new JButton("Show My Workout Plan"); 
	userplan.setBounds(0,500,1100,150);
	userplan.setBackground(mycolor);
	userplan.setFont(new Font("Open Sans",Font.BOLD,90));
    userplan.setCursor(new Cursor(Cursor.HAND_CURSOR));
	userplan.setBorderPainted(false);
	userplan.setFocusable(false);
	userplan.addActionListener(this);
	imglabel.add(userplan);
	
	exit=new JButton("X");
	exit.setBounds(1030,18,45,40);
	exit.setFont(new Font("Open Sans",Font.BOLD,17));
    exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
	exit.setBackground(homec);
	exit.setForeground(Color.WHITE);
	exit.setBorderPainted(false);
	exit.setFocusable(false);
	exit.addActionListener(this);
	imglabel.add(exit);
	
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
	

	

this.add(panel);
}

public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==probutton){
		Profile P = new Profile(name,password);
		P.setVisible(true);
		this.setVisible(false);
	}	
	else if(ae.getSource()==progress){

		subscription S = new subscription(name,password);
		S.setVisible(true);
		this.setVisible(false);

	}
	else if(ae.getSource()==tips){
		Coach C = new Coach(name,password);
		C.setVisible(true);
		this.setVisible(false);
	}	
	else if(ae.getSource()==help){
		JOptionPane.showMessageDialog(null,"Call +17072002");
	}
	else if(ae.getSource()==signout){
		Login L = new Login();
		L.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==exit){

		this.setVisible(false);
	}
	else if(ae.getSource()==aboutus){
		About A = new About(name,password);
		A.setVisible(true);
		this.setVisible(false);
		}
	else if(ae.getSource()==userplan){
		if(account.getWorkout("username : "+name)){
			noEquipWorkout nw = new noEquipWorkout(name,password);
			nw.setVisible(true);
			this.setVisible(false);
		}		
		else {
			yesEquipWorkout yw = new yesEquipWorkout(name,password);
			yw.setVisible(true);
			this.setVisible(false);
		}
	}
}
public void mouseClicked(MouseEvent me){

}
public void mousePressed(MouseEvent me){
}
public void mouseReleased(MouseEvent me){
}

public void mouseEntered(MouseEvent me){

}
public void mouseExited(MouseEvent me){

}

}
	
	