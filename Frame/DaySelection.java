package Frame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DaySelection extends JFrame implements ActionListener{
    private JPanel panel;
    private JLabel topJLabel,topJLabel2,imgLabel;
    private ImageIcon backgroundIcon,logo;
    private JButton bt1,submitButton;
    private JCheckBox[] day;
    private String name,password;

    public DaySelection(String name,String password){
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

        backgroundIcon = new ImageIcon("Photo/frame4.png");
        imgLabel = new JLabel(backgroundIcon);
        imgLabel.setSize(1100,700);
        panel.add(imgLabel);

        //toplvl 1
        topJLabel= new JLabel("What days do you") ;
		topJLabel.setBounds(82,125,(int)434.6,50);
		topJLabel.setForeground(new Color(0xE9E8E8));
		topJLabel.setFont(new Font("Gotham",Font.BOLD,40));
		imgLabel.add(topJLabel);

        //toplvl 2
        topJLabel2= new JLabel("want to workout ?") ;
		topJLabel2.setBounds(85,175,(int)434.6,50);
		topJLabel2.setForeground(new Color(0xE9E8E8));
		topJLabel2.setFont(new Font("Gotham",Font.BOLD,40));
		imgLabel.add(topJLabel2);

        //check box
        day = new JCheckBox[7];
        String[] days = {" Saturday", " Sunday"," Monday", " Tuesday", " Wednesday", " Thursday", " Friday"};


        int yPos = 253; // Vertical position

        for (int i = 0; i < 7; i++) {
            day[i] = new JCheckBox(days[i]);
            day[i].setFont(new Font("Gotham",Font.PLAIN,18));
            day[i].setBorderPainted(false);
            day[i].setFocusable(false);
            day[i].setBackground(new Color(0x646364));
            day[i].setForeground(new Color(0xE9E8E8));
            day[i].setBounds(160, yPos, 200, 25); // Set position and size
            day[i].addActionListener(this);
            imgLabel.add(day[i]);

            yPos += 40; // Adjust vertical position for the next checkbox
        }

        //submit button
        submitButton = new JButton("Submit");
        submitButton.setBounds(160,558, 250, 47);
        submitButton.setBackground(new Color(0xF9B03F));
        submitButton.setForeground(Color.WHITE);
        submitButton.setBorderPainted(false);
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Gotham",Font.BOLD,20));
		submitButton.addActionListener(this);

        submitButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedDays = new StringBuilder("Selected days: ");
                
                for (int i = 0; i < day.length; i++) {
                    JCheckBox checkbox = day[i];
                    if (checkbox.isSelected()) {
                        
                        selectedDays.append(checkbox.getText()).append(" ");
                    }
                }
                JOptionPane.showMessageDialog(null, selectedDays.toString());

            }
        });
        

        imgLabel.add(submitButton);

        //back button
        Icon icon = new ImageIcon("Photo/backButton.png");
        bt1 = new JButton(icon);
        bt1.setBounds(77,43,48,48);
        bt1.setBackground(new Color(0x646364));
        bt1.setBorderPainted(false);
        bt1.setFocusable(false);
        bt1.addActionListener(this);
        imgLabel.add(bt1);


		this.add(panel);
    }
    public void actionPerformed(ActionEvent ae)
	  {
		  String command=ae.getActionCommand();

          //back button
          if(bt1.getText().equals(command)){
            BMI B = new BMI(name,password);
            B.setVisible(true);
            this.setVisible(false);
          }
		  else if(submitButton.getText().equals(command)){
            EquipmentChecking ASF = new EquipmentChecking(name,password);
            ASF.setVisible(true);
			this.setVisible(false);
		  }
	  }
}