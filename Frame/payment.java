package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class payment  extends JFrame implements MouseListener, ActionListener
{

	 JPanel panel;
	 ImageIcon backgroundIcon,bkashicon,nagadicon,logo;
	 JLabel imgLabel,toplbl,paylabel,transactionL;
	 JButton bt1,con,bkash,nagad,eButton;
	 JTextField transaction;
	Color mycolor,bkashcolor,nagadcolor;
	private String name,password;
	private int check=0;
	

	public payment(String name,String password){
		
	    super("AIUB FITNESS ZONE");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");	
		this.setIconImage(logo.getImage());
		
		
		panel= new JPanel();
		panel.setBounds(400,100,1100,700);

		
		this.name=name;
		this.password=password;

		
	    mycolor =new Color(249,176,63);
	    nagadcolor =new Color(255,153,51);
	    bkashcolor = new Color(215,15,100);

        backgroundIcon = new ImageIcon("Photo/payment.png");
        imgLabel = new JLabel(backgroundIcon);
        imgLabel.setSize(1100,700);
        panel.add(imgLabel);

		bkashicon= new ImageIcon("Photo/bkash.png");
		nagadicon=new ImageIcon("Photo/nagad.png");

		bkash = new JButton();
		bkash.setBounds(396,182,113,107);
		bkash.setBackground(Color.WHITE);
		bkash.setFont(new Font("Open Sans",Font.BOLD,20));
		bkash.setForeground(Color.BLACK);
		bkash.addMouseListener(this);
		bkash.setFocusable(false);
		bkash.setBorderPainted(false);
		bkash.setIcon(bkashicon);
		imgLabel.add(bkash);

		nagad = new JButton();
		nagad.setBounds(588,182,113,107);
		nagad.setFont(new Font("Open Sans",Font.BOLD,20));
		nagad.setBackground(Color.WHITE);
		nagad.setForeground(Color.BLACK);
		nagad.addMouseListener(this);
		nagad.setFocusable(false);
		nagad.setBorderPainted(false);
		nagad.setIcon(nagadicon);
		imgLabel.add(nagad);

		toplbl= new JLabel("Select Your Payment Method") ;
		toplbl.setBounds(400,70,500,75);
		toplbl.setForeground(Color.WHITE);
		toplbl.setFont(new Font("Open Sans",Font.BOLD,22));
		imgLabel.add(toplbl);		
		
		paylabel= new JLabel("Agent Nubmer : (01601021702)") ;
		paylabel.setBounds(400,320,500,75);
		paylabel.setForeground(Color.WHITE);
		paylabel.setFont(new Font("Open Sans",Font.BOLD,21));
		imgLabel.add(paylabel);

		//back button
		Icon icon = new ImageIcon("Photo/backButton.png");
        bt1 = new JButton(icon);
        bt1.setBounds(77,43,48,48);
        bt1.setBackground(new Color(249,176,63));
        bt1.setBorderPainted(false);
        bt1.setFocusable(false);
        bt1.addActionListener(this);
        imgLabel.add(bt1);
		
		transactionL=new JLabel("Transaction Id : ");
		transactionL.setBounds(360,420,500,75);
		transactionL.setFont(new Font("Open Sans",Font.BOLD,25));
		transactionL.setForeground(Color.WHITE);
		imgLabel.add(transactionL);
			
		transaction = new JTextField();
		transaction.setBounds(560,440,200,45);
		transaction.setFont(new Font("Open Sans",Font.PLAIN,35));
		transaction.setBackground(mycolor);
		transaction.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		transaction.addActionListener(this);
		imgLabel.add(transaction);

		//next button
		con=new JButton("Confirm");
		con.setBounds(460,575,180,45);
		con.setBackground(Color.WHITE);
		con.setForeground(mycolor);
        con.setBorderPainted(false);
        con.setFocusable(false);
        con.setFont(new Font("Gotham",Font.BOLD,20));
		con.addActionListener(this);
		imgLabel.add(con);



		this.add(panel);		
	}
	//mouse listener
	  public void mouseClicked(MouseEvent me){
		if(me.getSource() == bkash){
			bkash.setBackground(mycolor); //bkash
			nagad.setBackground(Color.WHITE);
			check=1;
		}
		else if(me.getSource()==nagad){
			nagad.setBackground(mycolor);
			bkash.setBackground(Color.WHITE);
			check=2;
		}

			
	  }
	  public void mousePressed(MouseEvent me){}
	  public void mouseReleased(MouseEvent me){}
	  public void mouseEntered(MouseEvent me){}
	  public void mouseExited(MouseEvent me){}
	
	
	public void actionPerformed(ActionEvent ae)
	  {
		 if(ae.getSource()==con){
			 
				if(transaction.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"Please Enter Your Transaction Id");
				}
				else if(check==1){
					   afterpayment ap = new afterpayment(name,password);
					   ap.setVisible(true);
					   this.setVisible(false);
								try {
									FileWriter writer = new FileWriter("Data/subscription.txt", true);
									writer.write("username : "+name+ "\t");
									writer.write("Payment Method : Bkash" + "\t");
									writer.write("Transaction Id : "+transaction.getText()+"\n");
									writer.close();
								} catch (IOException e) {
									e.printStackTrace();
								}
				 }				
				 else if(check==2){
					   afterpayment ap = new afterpayment(name,password);
					   ap.setVisible(true);
					   this.setVisible(false);
								try {
									FileWriter writer = new FileWriter("Data/subscription.txt", true);
									writer.write("username : "+name+ "\t");
									writer.write("Payment Method : Nagad" + "\t");
									writer.write("Transaction Id : "+transaction.getText()+"\n");
									writer.close();
								} catch (IOException e) {
									e.printStackTrace();
								}
				 }
				 else{
					JOptionPane.showMessageDialog(null,"Please Select Payment Method");
			   }
		   }
		 else if(ae.getSource()==bt1){
					subscription S =new subscription(name,password);
					S.setVisible(true);
					this.setVisible(false);
				}
			}


}