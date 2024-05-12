package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class AllExercise extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage;
    ImageIcon backgroundIcon,logo;
    
    JLabel imgJPanel1;
    JScrollPane scrollbar;

    JLabel headLabel;
    JLabel e1, m1, h1, e2, m2, h2, e3, m3, h3, e4, m4, h4, e5, m5, h5, e6, m6, h6, e7, m7, h7, e8, m8, h8 ;
    
    JButton backButton;
    Font headFont;
    Font detFont;
    Color yellowColor;
    Color grayColor;
    private String name,password;
    public AllExercise(String name,String password)
    {
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
        //panel.setBackground(Color.CYAN);

        headFont = new Font("Open Sans", Font.BOLD, 55);
        detFont = new Font("Open Sans", Font.BOLD, 20);

        yellowColor = new Color(249, 176, 63);
        grayColor = new Color(145,144,145);

        panel = new JPanel(new BorderLayout()); 

        backgroundIcon = new ImageIcon("Photo/allEx.png");
        imgJPanel1 = new JLabel(backgroundIcon);
        imgJPanel1.setBounds(0,0, 1100,2000);

        scrollbar = new JScrollPane(imgJPanel1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scrollbar, BorderLayout.CENTER);

        headLabel = new JLabel("ALL EXERCISES");
        headLabel.setBounds(90,70, 600, 50);
        headLabel.setForeground(yellowColor);
        headLabel.setFont(headFont);
        imgJPanel1.add(headLabel);

        e1 = new JLabel("2 sets of 5 bench-press, comfort weight.");
        e1.setBounds(520,195, 700, 50);
        e1.setForeground(Color.WHITE);
        e1.setFont(detFont);
        imgJPanel1.add(e1);

        e2 = new JLabel("2 sets of 10 curls, comfort weight.");
        e2.setBounds(520,560, 700, 50);
        e2.setForeground(Color.WHITE);
        e2.setFont(detFont);
        imgJPanel1.add(e2);

        e3 = new JLabel("2 sets of 10 reps, 5+comfort weight.");
        e3.setBounds(520,915, 700, 50);
        e3.setForeground(Color.WHITE);
        e3.setFont(detFont);
        imgJPanel1.add(e3);

        e4 = new JLabel("2 sets of 5 dibs, 5mins break between sets.");
        e4.setBounds(520,1280, 700, 50);
        e4.setForeground(Color.WHITE);
        e4.setFont(detFont);
        imgJPanel1.add(e4);

        e5 = new JLabel("2 sets of 5 bench-press, comfort weight.");
        e5.setBounds(520,1635, 700, 50);
        e5.setForeground(Color.WHITE);
        e5.setFont(detFont);
        imgJPanel1.add(e5);

        e6 = new JLabel("2 sets of 10 curls, comfort weight.");
        e6.setBounds(520,2000, 700, 50);
        e6.setForeground(Color.WHITE);
        e6.setFont(detFont);
        imgJPanel1.add(e6);

        e7 = new JLabel("2 sets of 10 reps, 5+comfort weight.");
        e7.setBounds(520,2355, 700, 50);
        e7.setForeground(Color.WHITE);
        e7.setFont(detFont);
        imgJPanel1.add(e7);

        e8 = new JLabel("2 sets of 5 dibs, 5mins break between sets.");
        e8.setBounds(520,2720, 700, 50);
        e8.setForeground(Color.WHITE);
        e8.setFont(detFont);
        imgJPanel1.add(e8);

        m1 = new JLabel("2 sets of 10 bench-presses, 5+comfort weight.");
        m1.setBounds(520,275, 700, 50);
        m1.setForeground(Color.WHITE);
        m1.setFont(detFont);
        imgJPanel1.add(m1);

        m2 = new JLabel("2 sets of 15 curls, 5+comfort weight.");
        m2.setBounds(520,630, 700, 50);
        m2.setForeground(Color.WHITE);
        m2.setFont(detFont);
        imgJPanel1.add(m2);

        m3 = new JLabel("2 sets of 15 reps, 10+comfort weight.");
        m3.setBounds(520,995, 700, 50);
        m3.setForeground(Color.WHITE);
        m3.setFont(detFont);
        imgJPanel1.add(m3);

        m4 = new JLabel("2 sets of 15 dips, 6mins break between sets.");
        m4.setBounds(520,1350, 700, 50);
        m4.setForeground(Color.WHITE);
        m4.setFont(detFont);
        imgJPanel1.add(m4);

        m5 = new JLabel("2 sets of 10 bench-presses, 5+comfort weight.");
        m5.setBounds(520,1710, 700, 50);
        m5.setForeground(Color.WHITE);
        m5.setFont(detFont);
        imgJPanel1.add(m5);

        m6 = new JLabel("2 sets of 15 curls, 5+comfort weight.");
        m6.setBounds(520,2070, 700, 50);
        m6.setForeground(Color.WHITE);
        m6.setFont(detFont);
        imgJPanel1.add(m6);

        m7 = new JLabel("2 sets of 15 reps, 10+comfort weight.");
        m7.setBounds(520,2435, 700, 50);
        m7.setForeground(Color.WHITE);
        m7.setFont(detFont);
        imgJPanel1.add(m7);

        m8 = new JLabel("2 sets of 15 dips, 6mins break between sets.");
        m8.setBounds(520,2795, 700, 50);
        m8.setForeground(Color.WHITE);
        m8.setFont(detFont);
        imgJPanel1.add(m8);

        h1 = new JLabel("3 sets of 10 bench-presses, 2xcomfort weight.");
        h1.setBounds(520,345, 700, 50);
        h1.setForeground(Color.WHITE);
        h1.setFont(detFont);
        imgJPanel1.add(h1);

        h2 = new JLabel("3 sets of 15 curls, 2xcomfort weight.");
        h2.setBounds(520,710, 700, 50);
        h2.setForeground(Color.WHITE);
        h2.setFont(detFont);
        imgJPanel1.add(h2);

        h3 = new JLabel("3 sets of 15 reps, 2xcomfort weight.");
        h3.setBounds(520,1065, 700, 50);
        h3.setForeground(Color.WHITE);
        h3.setFont(detFont);
        imgJPanel1.add(h3);

        h4 = new JLabel("3 sets of 15 dibs, 2mins break between sets.");
        h4.setBounds(520,1420, 700, 50);
        h4.setForeground(Color.WHITE);
        h4.setFont(detFont);
        imgJPanel1.add(h4);

        h5 = new JLabel("3 sets of 10 bench-presses, 2xcomfort weight.");
        h5.setBounds(520,1790, 700, 50);
        h5.setForeground(Color.WHITE);
        h5.setFont(detFont);
        imgJPanel1.add(h5);

        h6 = new JLabel("3 sets of 15 curls, 2xcomfort weight.");
        h6.setBounds(520,2150, 700, 50);
        h6.setForeground(Color.WHITE);
        h6.setFont(detFont);
        imgJPanel1.add(h6);

        h7 = new JLabel("3 sets of 15 reps, 2xcomfort weight.");
        h7.setBounds(520,2515, 700, 50);
        h7.setForeground(Color.WHITE);
        h7.setFont(detFont);
        imgJPanel1.add(h7);

        h8 = new JLabel("3 sets of 15 dibs, 2mins break between sets.");
        h8.setBounds(520,2865, 700, 50);
        h8.setForeground(Color.WHITE);
        h8.setFont(detFont);
        imgJPanel1.add(h8);

        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(25,30, 30,30);
        backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.addMouseListener(this);
        backButton.addActionListener(this);
        imgJPanel1.add(backButton);
        
        // nextButton = new JButton("NEXT");
        // nextButton.setBounds(885, 560,130,35);
        // nextButton.setBackground(grayColor);
        // nextButton.setForeground(Color.WHITE);
        // nextButton.setBorderPainted(false);
        // nextButton.setFocusable(false);
        // nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // nextButton.addActionListener(this);
        // nextButton.setFont(detFont);
        // nextButton.addMouseListener(this);
        // imgJLabel1.add(nextButton);
       

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
		if(account.getWorkout("username : "+name)){
			noEquipWorkout nw = new noEquipWorkout(name,password);
			nw.setVisible(true);
			this.setVisible(false);
		}		
		else{
			yesEquipWorkout yw = new yesEquipWorkout(name,password);
			yw.setVisible(true);
			this.setVisible(false);
		}

    }

    public void mouseClicked(MouseEvent me)
    {
       
    }
	public void mousePressed(MouseEvent me)
    {
        
    }
	public void mouseReleased(MouseEvent me)
    {
        
    }

	public void mouseEntered(MouseEvent me)
	{
    //  if(me.getSource() == nextButton)
    //  {
    //     nextButton.setForeground(Color.BLACK);
    //  }
    //  else
    //  {

    //  }
	}
	public void mouseExited(MouseEvent me)
	{
	//  if(me.getSource() == nextButton)
    //  {
    //     nextButton.setForeground(Color.WHITE);
    //  }
    //  else
    //  {
        
    //  }
	}

}