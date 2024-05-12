package Frame;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;

public class ForgotPasswordFrame extends JFrame implements ActionListener{
     JPanel panel;
     JLabel aiubFitnessLabel;
	 JLabel enterPhoneLabel;
     JLabel phoneLabel;
     JTextField nameField;
     JButton resetButton;
	 ImageIcon img,logo;
	 ImageIcon backimg;
	 JLabel imgLabel;
	 JButton back;
	 Scanner sc;
	 File file;
	 

    public ForgotPasswordFrame() {
 	    super("AIUB FITNESS ZONE");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");		
		this.setIconImage(logo.getImage());

        panel = new JPanel();
        panel.setLayout(null);
		
		img = new ImageIcon("Photo/reset.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,1100,700);
		panel.add(imgLabel);

        aiubFitnessLabel = new JLabel("Forget Password");
        aiubFitnessLabel.setFont(new Font("Open Sans", Font.BOLD, 50));
     	aiubFitnessLabel.setForeground(Color.WHITE);
        aiubFitnessLabel.setBounds(350,70, 500, 70);
		
        enterPhoneLabel = new JLabel("Enter the User Name Associated with Your Account");
        enterPhoneLabel.setFont(new Font("Open Sans", Font.BOLD, 20));
        enterPhoneLabel.setForeground(Color.WHITE);
        enterPhoneLabel.setBounds(550, 250, 600, 30);

        phoneLabel = new JLabel("User Name : ");
	    phoneLabel.setFont(new Font("Open Sans",Font.BOLD,20));
	    phoneLabel.setForeground(Color.WHITE);
        phoneLabel.setBounds(550, 320, 200, 30);

        nameField = new JTextField();
        nameField.setBounds(710, 310, 300, 50);
		nameField.setFont(new Font("Open Sans",Font.PLAIN,30));
		nameField.setBackground(new Color(249,176,63));
		nameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        resetButton = new JButton("Reset");
        resetButton.setBounds(780, 410, 150, 40);
		resetButton.setFont(new Font("Open Sans",Font.BOLD,25));
		resetButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		resetButton.setBackground(Color.WHITE);
		resetButton.setFocusable(false);
		resetButton.setBorderPainted(false);
		resetButton.addActionListener(this);

		backimg =new ImageIcon("Photo/backbutton.png");
		
		back = new JButton(backimg);
		back.setBounds(100,50,40,40);
		back.setFont(new Font("Open Sans",Font.BOLD,25));
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setBackground(new Color(249,176,63));
		back.setFocusable(false);
		back.setBorderPainted(false);
		back.addActionListener(this);


        imgLabel.add(aiubFitnessLabel);
        imgLabel.add(enterPhoneLabel);
        imgLabel.add(phoneLabel);
        imgLabel.add(nameField);
        imgLabel.add(resetButton);
		imgLabel.add(back);		


        this.add(panel);
    }

     private void generateAndShowNewPassword() {
        String enteredName = nameField.getText();

        if (nameExists(enteredName)) {
            Random random = new Random();
            String newPassword = ""+(1000 + random.nextInt(9000));
			account.changePassword("username : "+enteredName,"password : "+newPassword);
			
            JOptionPane.showMessageDialog(this, "Your new password is: " + newPassword, "New Password", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "User not found. Please enter a valid email.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

     boolean nameExists(String enteredName) {
		boolean flag=false;
		
		file=new File("Data/user.txt");
		try{
		sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String[] value=line.split("\t");
			if(value[0].equals("username : "+enteredName))
			{
				flag=true;
			}
		}
		sc.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return flag;
    }
	
      public void actionPerformed(ActionEvent ae) {
		  if(ae.getSource()==resetButton){
                generateAndShowNewPassword();
		  }
		  else if(ae.getSource()==back){
			  Login L = new Login();
			  L.setVisible(true);
			  this.setVisible(false);
		  }
        }

}
