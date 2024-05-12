package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class noEquipWorkout extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage,logo;
    ImageIcon backgroundIcon;
    
    JLabel imgJPanel1;
    JScrollPane scrollbar;

    JLabel headLabel;
    JLabel e1, m1, h1, e2, m2, h2, e3, m3, h3, e4, m4, h4;
    JLabel allExer;

    JButton click;
    JButton backButton;
    Font headFont;
    Font detFont;
    Color yellowColor;
    Color grayColor;
	
	private String name,password;

    public noEquipWorkout(String name,String password)
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

        backgroundIcon = new ImageIcon("Photo/noEquip.png");
        imgJPanel1 = new JLabel(backgroundIcon);
        imgJPanel1.setBounds(0,0, 1100,2000);

        scrollbar = new JScrollPane(imgJPanel1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scrollbar, BorderLayout.CENTER);

        headLabel = new JLabel("WORKOUT ROUTINE");
        headLabel.setBounds(90,70, 600, 50);
        headLabel.setForeground(yellowColor);
        headLabel.setFont(headFont);
        imgJPanel1.add(headLabel);

        e1 = new JLabel("2 sets of 5 push-ups, 2mins break between sets.");
        e1.setBounds(520,195, 700, 50);
        e1.setForeground(Color.WHITE);
        e1.setFont(detFont);
        imgJPanel1.add(e1);

        e2 = new JLabel("2 sets of 10 sit-ups, 3mins break between sets.");
        e2.setBounds(520,560, 700, 50);
        e2.setForeground(Color.WHITE);
        e2.setFont(detFont);
        imgJPanel1.add(e2);

        e3 = new JLabel("2 sets of 10 jumps, 2mins break between sets.");
        e3.setBounds(520,915, 700, 50);
        e3.setForeground(Color.WHITE);
        e3.setFont(detFont);
        imgJPanel1.add(e3);

        e4 = new JLabel("2 sets of 5 pull-ups, 5mins break between sets.");
        e4.setBounds(520,1280, 700, 50);
        e4.setForeground(Color.WHITE);
        e4.setFont(detFont);
        imgJPanel1.add(e4);


        m1 = new JLabel("2 sets of 10 push-ups, 4mins break between sets.");
        m1.setBounds(520,275, 700, 50);
        m1.setForeground(Color.WHITE);
        m1.setFont(detFont);
        imgJPanel1.add(m1);

        m2 = new JLabel("3 sets of 10 sit-ups, 3mins break between sets.");
        m2.setBounds(520,620, 700, 50);
        m2.setForeground(Color.WHITE);
        m2.setFont(detFont);
        imgJPanel1.add(m2);

        m3 = new JLabel("3 sets of 20 jumps, 3mins break between sets.");
        m3.setBounds(520,995, 700, 50);
        m3.setForeground(Color.WHITE);
        m3.setFont(detFont);
        imgJPanel1.add(m3);

        m4 = new JLabel("2 sets of 10 pull-ups, 6mins break between sets.");
        m4.setBounds(520,1350, 700, 50);
        m4.setForeground(Color.WHITE);
        m4.setFont(detFont);
        imgJPanel1.add(m4);

        h1 = new JLabel("3 sets of 15 push-ups, 7mins break between sets.");
        h1.setBounds(520,345, 700, 50);
        h1.setForeground(Color.WHITE);
        h1.setFont(detFont);
        imgJPanel1.add(h1);

        h2 = new JLabel("3 sets of 20 sit-ups, 5mins break between sets.");
        h2.setBounds(520,710, 700, 50);
        h2.setForeground(Color.WHITE);
        h2.setFont(detFont);
        imgJPanel1.add(h2);

        h3 = new JLabel("3 sets of 40 jumps, 5mins break between sets.");
        h3.setBounds(520,1065, 700, 50);
        h3.setForeground(Color.WHITE);
        h3.setFont(detFont);
        imgJPanel1.add(h3);

        h4 = new JLabel("3 sets of 15 pull-ups, 2mins break between sets.");
        h4.setBounds(520,1420, 700, 50);
        h4.setForeground(Color.WHITE);
        h4.setFont(detFont);
        imgJPanel1.add(h4);

        allExer = new JLabel("<html><body>ALL <br>EXERCISES</body></html>");
        allExer.setBounds(90,1650, 600, 150);
        allExer.setForeground(Color.WHITE);
        allExer.setFont(new Font("Open Sans", Font.BOLD, 45));
        imgJPanel1.add(allExer);

        click = new JButton("<html><body><u>Click Here.<u></body></html>");
        click.setBounds(500, 1700, 400, 60);
        click.setBorderPainted(false);
        click.setFocusable(false);
        click.setFont(headFont);
        click.setBackground(grayColor);
        click.setForeground(Color.WHITE);
        click.setCursor(new Cursor(Cursor.HAND_CURSOR));
        click.addMouseListener(this);
        click.addActionListener(this);
        imgJPanel1.add(click);

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
        

       

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==backButton){
			Home H = new Home(name,password);
			H.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==click){
			AllExercise AE = new AllExercise(name,password);
			AE.setVisible(true);
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