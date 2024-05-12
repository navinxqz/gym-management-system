package Frame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BMI extends JFrame implements ActionListener{
	private JButton bt1,con,nexButton;
	private JPanel panel;
	private JLabel toplabel,label2,label3,imglabel,m,kg,birth,bmilvl,status,bmiJLabel,statusJLabel;
	private Font lbf;
	private ImageIcon backgroundIcon,logo;
	private JTextField mf,kgf,bf;
	private String name,password;
	
	public BMI(String name,String password){
	    super("AIUB FITNESS ZONE");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");		
		this.setIconImage(logo.getImage());
		
		
		panel= new JPanel();
		panel.setBackground(new Color(0x646364));
		panel.setLayout(null);

		
		this.name=name;
		this.password=password;

        backgroundIcon = new ImageIcon("Photo/frame3.png");
        imglabel = new JLabel(backgroundIcon);
        imglabel.setSize(1100,700);
        panel.add(imglabel);

		toplabel= new JLabel("Your height and weight");
		toplabel.setBounds((int)86.5,105,(int)436.5,45);
		toplabel.setForeground(Color.WHITE);
		toplabel.setFont(new Font("Gotham",Font.BOLD,35));
        toplabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		imglabel.add(toplabel);
		
		label2= new JLabel("It's necessary for the selection");
		label3= new JLabel("of personal training & BMI calculation");
		label2.setBounds((int)110,170,403,32);
		label3.setBounds((int)87,205,(int)436.5,30);
		label2.setForeground(new Color(0x20262E));
		label3.setForeground(new Color(0x20262E));
		label2.setFont(new Font("Gotham",Font.PLAIN,28));
		label3.setFont(new Font("Gotham",Font.PLAIN,25));
		imglabel.add(label2);
		imglabel.add(label3);

		//back
		Icon icon = new ImageIcon("Photo/backButton.png");
        bt1 = new JButton(icon);
        bt1.setBounds(77,43,48,48);
        bt1.setBackground(new Color(0x646364));
        bt1.setBorderPainted(false);
        bt1.setFocusable(false);
        bt1.addActionListener(this);
        imglabel.add(bt1);

		lbf=new Font("Klavika",Font.PLAIN,25);
		
		//meter text box & label
		mf= new JTextField();
		mf.setBounds(110,275,60,40);
		mf.setBackground(Color.WHITE);
		mf.setFont(lbf);
		mf.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		mf.setHorizontalAlignment(JTextField.RIGHT);
		imglabel.add(mf);
		
		m= new JLabel("         ft");
		m.setBounds(142,270,118,49);
		m.setForeground(Color.WHITE);
		m.setFont(new Font("Gotham",Font.BOLD,20));
		imglabel.add(m);
		
		//kg text box & label
		kgf= new JTextField();
		kgf.setBounds(335,275,62,40);
		kgf.setBackground(Color.WHITE);
		kgf.setFont(lbf);
		kgf.setHorizontalAlignment(JTextField.RIGHT);
		kgf.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		imglabel.add(kgf);
		
		kg= new JLabel("   kg");
		kg.setBounds(400,270,110,49);
		kg.setForeground(Color.WHITE);
		kg.setFont(new Font("Gotham",Font.BOLD,20));
		imglabel.add(kg);
		
		//birth text box & label
		birth = new JLabel("Your Date of Birth");
		birth.setBounds(125,335,370,48);
		birth.setForeground(Color.WHITE);
		birth.setFont(new Font("Gotham",Font.BOLD,40));
		imglabel.add(birth);
		
 		bf= new JTextField("D/M/Y");
		bf.setBounds(200,400,180,53);
		bf.setBackground(Color.WHITE);
		bf.setFont(new Font("Gotham",Font.BOLD,20));
		bf.setHorizontalAlignment(JTextField.CENTER);
		bf.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		imglabel.add(bf);


		//next button
		con=new JButton("BMI Check");
		con.setBounds((int)120,560,350,33);
		con.setBackground(new Color(0xF9B03F));
		con.setForeground(Color.WHITE);
        con.setBorderPainted(false);
        con.setFocusable(false);
        con.setFont(new Font("Gotham",Font.BOLD,20));
		con.addActionListener(this);
		imglabel.add(con);

		con.addActionListener(new ActionListener() {
    
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });

        //bmi lvl
        bmilvl= new JLabel("   BMI");
		bmilvl.setBounds((int)721.5,270,117,50);
		bmilvl.setForeground(Color.WHITE);
		bmilvl.setFont(new Font("Gotham",Font.BOLD,20));
		imglabel.add(bmilvl);

        //bmi result
        bmiJLabel= new JLabel();
		bmiJLabel.setBounds(845,275,140,40);
		bmiJLabel.setBackground(Color.WHITE);
		bmiJLabel.setFont(new Font("Gotham",Font.BOLD,20));
		bmiJLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		imglabel.add(bmiJLabel);

        //status lvl
        status= new JLabel("   Status");
		status.setBounds((int)721.5,(int)333.5,117,50);
		status.setForeground(Color.WHITE);
		status.setFont(new Font("Gotham",Font.BOLD,20));
		imglabel.add(status);

		//status result show
		statusJLabel= new JLabel();
		statusJLabel.setBounds(850,334,130,50);
		statusJLabel.setBackground(Color.WHITE);
		statusJLabel.setFont(new Font("Gotham",Font.BOLD,20));
		statusJLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		imglabel.add(statusJLabel);

		//next button
		nexButton=new JButton("Next");
		nexButton.setBounds(815,417,180,45);
		nexButton.setBackground(new Color(0xF9B03F));
		nexButton.setForeground(Color.WHITE);
        nexButton.setBorderPainted(false);
        nexButton.setFocusable(false);
        nexButton.setFont(new Font("Gotham",Font.BOLD,20));
		nexButton.addActionListener(this);
		nexButton.setEnabled(false);
		imglabel.add(nexButton);


		this.add(panel);		
	}

	public void actionPerformed(ActionEvent ae){  
		  String command =ae.getActionCommand();		  
		  if (bt1.getText().equals(command)){
			//back button
			  GenderCheck G=new GenderCheck(name,password);
		      G.setVisible(true);
			  this.setVisible(false);
		  }
		  else if(nexButton.getText().equals(command)){
			//next button
			DaySelection D = new DaySelection(name,password);
			D.setVisible(true);
			this.setVisible(false);
		  }
	  }

     public void calculateBMI() {
            try {
                double weight = Double.parseDouble(kgf.getText());
                double height = Double.parseDouble(mf.getText())/3.281; //convert in meter
                double bmi = weight / (height * height);

                String comment;
    
              if (bmi < 18.5) {
		            nexButton.setEnabled(true);	
                    comment = "Underweight";
                } else if (bmi < 24.9) {
		            nexButton.setEnabled(true);	
                    comment = "Normal";
                } else if (bmi < 29.9) {
                    comment = "Overweight";
		            nexButton.setEnabled(true);	
                } else {
		            nexButton.setEnabled(true);	
                    comment = "Obese";
                }
    
                bmiJLabel.setText(String.format(" %.2f", bmi));
                statusJLabel.setText(comment);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid weight and height.");
            } 	
        }


}

