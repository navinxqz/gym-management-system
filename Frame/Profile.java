package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.Images.*;



public class Profile extends JFrame implements MouseListener,ActionListener{
	
	JLabel imglabel,Title,username,email,changepassl,currentpassl,newpassl,confirmpassl;
	JPasswordField currentpass,newpass,confirmpass;
	JButton confirm,back,show,hide;
	JPanel panel;
	ImageIcon img,backimg,logo;
	Color mycolor,textback;
	private String name,password;

public Profile (String name,String password){
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
	textback = new Color(229,230,232);
	panel = new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.BLACK);
	
	img = new ImageIcon("Photo/profile.png");
	imglabel=new JLabel(img);
	imglabel.setBounds(0,0,1100,700);
	panel.add(imglabel);
	
	Title=new JLabel("Profile");//1st title line
	Title.setBounds(450,30,300,100);
	Title.setFont(new Font("Open Sans",Font.BOLD,50));
	Title.setForeground(Color.WHITE);
	imglabel.add(Title);	

    username=new JLabel("Account Name : "+name);
	username.setBounds(350,120,700,100);
	username.setFont(new Font("Open Sans",Font.BOLD,18));
	username.setForeground(Color.BLACK);
	imglabel.add(username);	   
	
	email = new JLabel("Contact Number  : "+account.getContact("username : "+name));
	email.setBounds(350,200,600,100);
	email.setFont(new Font("Open Sans",Font.BOLD,18));
	email.setForeground(Color.BLACK);
	imglabel.add(email);	
	
	changepassl = new JLabel("Change Password");
	changepassl.setBounds(500,300,300,100);
	changepassl.setFont(new Font("Open Sans",Font.BOLD,30));
	changepassl.setForeground(Color.WHITE);
	imglabel.add(changepassl);	
	
	
	currentpassl = new JLabel("Current Password :");
	currentpassl.setBounds(170,355,300,100);
	currentpassl.setFont(new Font("Open Sans",Font.BOLD,20));
	currentpassl.setForeground(Color.BLACK);
	imglabel.add(currentpassl);	
	
	currentpass = new JPasswordField();
	currentpass.setBounds(390,390,500,40);
	currentpass.setEchoChar('*');
	currentpass.setFont(new Font("Open Sans",Font.PLAIN,30));
	currentpass.setBackground(textback);
    currentpass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	currentpass.addActionListener(this);
	imglabel.add(currentpass);	
	
	newpass = new JPasswordField();
	newpass.setBounds(390,460,500,40);
	newpass.setEchoChar('*');
	newpass.setFont(new Font("Open Sans",Font.PLAIN,30));
	newpass.setBackground(textback);
    newpass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	newpass.addActionListener(this);
	imglabel.add(newpass);	
	
	confirmpass = new JPasswordField();
	confirmpass.setBounds(390,528,500,40);
	confirmpass.setEchoChar('*');
	confirmpass.setFont(new Font("Open Sans",Font.PLAIN,30));
	confirmpass.setBackground(textback);
    confirmpass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	confirmpass.addActionListener(this);
	imglabel.add(confirmpass);
	
	newpassl = new JLabel("New Password      :");
	newpassl.setBounds(170,425,300,100);
	newpassl.setFont(new Font("Open Sans",Font.BOLD,20));
	newpassl.setForeground(Color.BLACK);
	imglabel.add(newpassl);	

	confirmpassl = new JLabel("Confirm Password :");
	confirmpassl.setBounds(170,500,300,100);
	confirmpassl.setFont(new Font("Open Sans",Font.BOLD,20));
	confirmpassl.setForeground(Color.BLACK);
	imglabel.add(confirmpassl);	

	
	confirm = new JButton("Confirm");
	confirm.setBounds(520,590,220,40);
	confirm.setFont(new Font("Open Sans",Font.BOLD,25));
    confirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
	confirm.setForeground(mycolor);
	confirm.setBackground(Color.WHITE);
	confirm.setFocusable(false);
	confirm.setBorderPainted(false);
	confirm.addActionListener(this);
	imglabel.add(confirm);	
	
	show = new JButton("");
	show.setBounds(930,470,20,20);
	show.setIcon(new ImageIcon("Photo/icon2.png"));
	show.setBackground(mycolor);
	show.setCursor(new Cursor(Cursor.HAND_CURSOR));
	show.setFocusable(false);
	show.setBorderPainted(false);
	show.addActionListener(this);
	imglabel.add(show);	
	
	hide = new JButton("");
	hide.setBounds(930,470,20,20);
	hide.setIcon(new ImageIcon("Photo/icon3.png"));
	hide.setBackground(mycolor);
	hide.setCursor(new Cursor(Cursor.HAND_CURSOR));
	hide.setFocusable(false);
	hide.setBorderPainted(false);
	hide.addActionListener(this);
	imglabel.add(hide);
	
	
	backimg =new ImageIcon("Photo/backbutton.png");
	
    back = new JButton(backimg);
	back.setBounds(100,50,40,40);
	back.setFont(new Font("Open Sans",Font.BOLD,25));
    back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	back.setForeground(Color.WHITE);
	back.setBackground(mycolor);
	back.setFocusable(false);
	back.setBorderPainted(false);
	back.addActionListener(this);
	imglabel.add(back);		

this.add(panel);
}

public void actionPerformed(ActionEvent ae){
	String cp = currentpass.getText();
	String np = newpass.getText();
	String cop = confirmpass.getText();
	
	if(ae.getSource()==back){
		Home H = new Home(name,password);
		H.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==show){
		if(currentpass.getEchoChar() != '\u0000'){
			currentpass.setEchoChar('\u0000');
			newpass.setEchoChar('\u0000');
			confirmpass.setEchoChar('\u0000');
			show.setVisible(false);
			hide.setVisible(true);
		}
	}
	else if(ae.getSource()==hide){
		if(currentpass.getEchoChar() == '\u0000'){
			currentpass.setEchoChar('*');
			newpass.setEchoChar('*');
			confirmpass.setEchoChar('*');
			hide.setVisible(false);
			show.setVisible(true);
		}
	}
		
			
		
	else if(ae.getSource()==confirm){
		if(cp.isEmpty()){
			JOptionPane.showMessageDialog(null,"Enter Current Password First");
		}
		else if(cp.equals(password)){
			if(np.isEmpty() || cop.isEmpty()){
			     JOptionPane.showMessageDialog(null,"Fill Both New and Confirm Pass");	
			}
			else if(np.equals(cop)){
				  password=np;
				  account.changePassword(("username : "+name),("password : "+password));
				 JOptionPane.showMessageDialog(null,newpass.getText()+" Is your new Pass");
			}
              else{
				 JOptionPane.showMessageDialog(null,"New Paswords Doesnt Match");
			  }
		}
		else{
			JOptionPane.showMessageDialog(null,"Current Password Dosent Match");
		}
			
	}

				  
}
public void mouseClicked(MouseEvent me){
	if(me.getSource()==confirm){
	}

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
	
	