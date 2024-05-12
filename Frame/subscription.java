package Frame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class subscription extends JFrame implements ActionListener{
    private ImageIcon backgroundIcon,backimg,logo;
    private JPanel panel;
    private JLabel imgJLabel,topJLabel2,bottomLabel2,tk1,info;
    private JButton back,sButton;
    private String name,password;

    public subscription(String name,String password){
	    super("AIUB FITNESS ZONE");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");		
		this.setIconImage(logo.getImage());
		
		this.name=name;
		this.password=password;
		
		
		panel= new JPanel();
		panel.setLayout(null);

		
        //background
        backgroundIcon = new ImageIcon("Photo/subscription.png");
        imgJLabel = new JLabel(backgroundIcon);
        imgJLabel.setSize(1100,700);
        panel.add(imgJLabel);

        //toplvl 2
        topJLabel2= new JLabel("SUBSCRIPTION") ;
		topJLabel2.setBounds(340,70,444,140);
		topJLabel2.setForeground(Color.WHITE);
		topJLabel2.setFont(new Font("Gotham",Font.PLAIN,52));
		imgJLabel.add(topJLabel2);


        //btm lvl 2
        bottomLabel2= new JLabel("( Enter the gym like you own the place )") ;
		bottomLabel2.setBounds(400,490,290,20);
		bottomLabel2.setForeground(Color.WHITE);
		bottomLabel2.setFont(new Font("Arial",Font.PLAIN,16));
		imgJLabel.add(bottomLabel2);

        //cost lvl
        tk1= new JLabel("Only 300 Taka") ;
		tk1.setBounds(435,190,350,40);
		tk1.setForeground(Color.WHITE);
		tk1.setFont(new Font("Open Sans",Font.BOLD,30));
		imgJLabel.add(tk1);
		
		info = new JLabel("<html><body>. VIP gym access   <br> . personal trainer <br> . Selfie any time any where <br> . Personal training schedule <br> . Exclusive gym events<body><html>");
        info.setBounds(350,100,400,500);
		info.setForeground(Color.WHITE);
		info.setFont(new Font("Open Sans",Font.BOLD,25));
		imgJLabel.add(info);
        
		backimg = new ImageIcon("Photo/backbutton.png");

        //free button
        back=new JButton(backimg);
		back.setBounds(50,20,40,40);
		back.setBackground(new Color(249,176,63));
		back.setForeground(Color.WHITE);
        back.setBorderPainted(false);
        back.setFocusable(false);
        back.setFont(new Font("Open Sans",Font.BOLD,20));
		back.addActionListener(this);
		imgJLabel.add(back);

        //subscription button
        sButton=new JButton("Buy Plan");
		sButton.setBounds(420,522,250,60);
		sButton.setBackground(new Color(249,176,63));
		sButton.setForeground(Color.WHITE);
        sButton.setBorderPainted(false);
        sButton.setFocusable(false);
        sButton.setFont(new Font("Open Sans",Font.BOLD,20));
		sButton.addActionListener(this);
		imgJLabel.add(sButton);


		this.add(panel);
    }
	
public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==sButton){
		  if(account.getSubscriber("username : "+name)){
			  JOptionPane.showMessageDialog(null,"You Are Already A Subscriber");
		      }
	      else{
		payment p = new payment(name,password);
		p.setVisible(true);
		this.setVisible(false);
		}
	}
	else if(ae.getSource()==back){
		Home H = new Home(name,password);
		H.setVisible(true);
		this.setVisible(false);
	}
}

}