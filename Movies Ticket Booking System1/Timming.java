import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Class Timming extending JFrame and implementing MouseListener and ActionListener interfaces
public class Timming extends JFrame implements MouseListener, ActionListener {
	
	// Declaration of instance variables
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,
	label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23,label24,label25;
	
	
	JButton B1,B2,B3,B4,B5;
	
	JPanel panel1,panel2,panel3;
	
	// Constructor
	public Timming() {
		
		super("Timming");// Set JFrame title
		this.setSize(750,520);// Set JFrame size
		setLocationRelativeTo(null);// Center JFrame on screen
		setResizable(false);// Disable JFrame resizing
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Set default close operation
		
		// Creation and configuration of panel1
		
		panel1 = new JPanel();
		panel1.setBounds(0,0,750,50);
		panel1.setBackground(new Color(148,5,5));
		panel1.setBorder(BorderFactory.createLineBorder(Color.white));
		panel1.setLayout(null);
	  
	    panel2 = new JPanel();
		panel2.setBounds(0,40,750,50);
		//panel2.setBackground(new Color(202,171,255));
		panel2.setBorder(BorderFactory.createLineBorder(Color.white));
		panel2.setLayout(null);
		
		panel3 = new JPanel();
		panel3.setBounds(0,100,750,400);
		panel3.setBackground(new Color(232,111,95));
		panel3.setLayout(null);
		
		
		
		
		label1 = new JLabel("CineWorld");
		label1.setFont(new Font("MV Boli",Font.BOLD,36));
		label1.setForeground(new Color(255,242,0));
		label1.setBounds(20,6,180,35);
		panel1.add(label1);
		
		B1 = new JButton(new ImageIcon(getClass().getResource("/Picture/Manush2.jpg")));
		B1.setBorder(null);
		B1.setBounds(685,9,34,32);
		B1.addMouseListener(this);
		B1.addActionListener(this);
		B1.setFocusable(false);
		
		panel1.add(B1);
		
		
		//for panel 2
		// button for movies
		B2 = new JButton("Movies");
		B2.setFont(new Font("Calibri",Font.BOLD,18));
		B2.setForeground(Color.black);
		B2.setBackground(new Color(255,186,78));
		B2.setBorder(null);
		B2.setBounds(25,12,150,35);
		B2.addMouseListener(this);
		B2.addActionListener(this);
		B2.setFocusable(false);
		
		panel2.add(B2);
		//button ticket
		B3 = new JButton("Price Ticket");
		B3.setFont(new Font("Calibri",Font.BOLD,18));
		B3.setForeground(Color.black);
		B3.setBackground(new Color(255,186,78));
		B3.setBorder(null);
		B3.setBounds(230,12,90,35);
		B3.addMouseListener(this);
		B3.addActionListener(this);
		B3.setFocusable(false);
		
		panel2.add(B3);
		
		//button time
		B4 = new JButton("Timming");
		B4.setFont(new Font("Calibri",Font.BOLD,18));
		B4.setForeground(Color.black);
		B4.setBackground(new Color(255,186,78));
		B4.setBorder(null);
		B4.setBounds(405,12,140,35);
		B4.addMouseListener(this);
		B4.addActionListener(this);
		B4.setFocusable(false);
		
		panel2.add(B4);
		//button place
		B5 = new JButton("Places");
		B5.setFont(new Font("Calibri",Font.BOLD,18));
		B5.setForeground(Color.black);
		B5.setBackground(new Color(255,186,78));
		B5.setBorder(null);
		B5.setBounds(600,12,80,35);
		B5.addMouseListener(this);
		B5.addActionListener(this);
		B5.setFocusable(false);
		
		panel2.add(B5);
		
		
		// for panel 3 picture
		
		
		label2 = new JLabel(new ImageIcon(getClass().getResource("/Picture/Godzillaxkong.jpg")));
		label2.setBounds(20,100,130,170);
		panel3.add(label2);
		
		label3= new JLabel(new ImageIcon(getClass().getResource("/Picture/JOKERRR.jpg")));
		label3.setBounds(20,295,130,170);
		panel3.add(label3);
		
		label4 = new JLabel(new ImageIcon(getClass().getResource("/Picture/SpiderMan.jpg")));
		label4.setBounds(385,100,130,170);
		panel3.add(label4);
		
		label5= new JLabel(new ImageIcon(getClass().getResource("/Picture/TheDarkKnight.jpg")));
		label5.setBounds(385,295,130,170);
		panel3.add(label5);
		
		
		// for panel 3 add movies name also
		
		label6 = new JLabel("Godzilla x Kong");
		label6.setFont(new Font("Serif",Font.BOLD,17));
		label6.setForeground(Color.black);
		label6.setBackground(Color.orange);
		label6.setBounds(170,110,200,20);
		panel3.add(label6);
		
		label7= new JLabel("Joker");
		label7.setFont(new Font("Serif",Font.BOLD,17));
		label7.setForeground(Color.black);
		label7.setBackground(Color.orange);
		label7.setBounds(200,300,200,20);
		panel3.add(label7);
		
		label8 = new JLabel("Spider-Man");
		label8.setFont(new Font("Serif",Font.BOLD,17));
		label8.setForeground(Color.black);
		label8.setBackground(Color.orange);
		label8.setBounds(560,110,200,20);
		panel3.add(label8);
		
		label9 = new JLabel("The Dark Knight");
		label9.setFont(new Font("Serif",Font.BOLD,14));
		label9.setForeground(Color.black);
		label9.setBounds(540,300,200,20);
		panel3.add(label9);
		
		
		//Time set in panel 3
		//for godzila
		label10 = new JLabel("12:00 PM");
		label10.setFont(new Font("Serif",Font.PLAIN,15));
		label10.setForeground(Color.black);
		label10.setOpaque(true);
		label10.setBackground(new Color(60,163,255));
		label10.setBounds(180,160,66,28);
		panel3.add(label10);
		
		label11 = new JLabel("3:00 PM");
		label11.setFont(new Font("Serif",Font.PLAIN,15));
		label11.setForeground(Color.black);
		label11.setOpaque(true);
		label11.setBackground(new Color(60,163,255));
		label11.setBounds(260,160,66,28);
		panel3.add(label11);
		
		label12 = new JLabel("5:00 PM");
		label12.setFont(new Font("Serif",Font.PLAIN,15));
		label12.setForeground(Color.black);
		label12.setOpaque(true);
		label12.setBackground(new Color(60,163,255));
		label12.setBounds(180,200,66,28);
		panel3.add(label12);
		
		label13 = new JLabel("8:00 PM");
		label13.setFont(new Font("Serif",Font.PLAIN,15));
		label13.setForeground(Color.black);
		label13.setOpaque(true);
		label13.setBackground(new Color(60,167,255));
		label13.setBounds(260,200,66,28);
		panel3.add(label13);
		
		
		//for joker
		
		label14 = new JLabel("12:00 PM");
		label14.setFont(new Font("Serif",Font.PLAIN,15));
		label14.setForeground(Color.black);
		label14.setOpaque(true);
		//label14.setBackground(new Color(157,225,236));
		label14.setBounds(180,350,66,28);
		panel3.add(label14);
		
		label15 = new JLabel("3:00 PM");
		label15.setFont(new Font("Serif",Font.PLAIN,15));
		label11.setForeground(Color.black);
		label15.setOpaque(true);
		//label15.setBackground(new Color(157,225,236));
		label15.setBounds(260,350,66,28);
		panel3.add(label15);
		
		label16 = new JLabel("5:00 PM");
		label16.setFont(new Font("Serif",Font.PLAIN,15));
		label16.setForeground(Color.black);
		label16.setOpaque(true);
		//label16.setBackground(new Color(157,225,236));
		label16.setBounds(180,390,66,28);
		panel3.add(label16);
		
		label17 = new JLabel("8:00 PM");
		label17.setFont(new Font("Serif",Font.PLAIN,15));
		label17.setForeground(Color.black);
		label17.setOpaque(true);
		//label17.setBackground(new Color(157,225,236));
		label17.setBounds(260,390,66,28);
		panel3.add(label17);
		
		
		//for spiderman
		
		label18 = new JLabel("12:00 PM");
		label18.setFont(new Font("Serif",Font.PLAIN,15));
		label18.setForeground(Color.black);
		label18.setOpaque(true);
		//label18.setBackground(new Color(157,225,236));
		label18.setBounds(540,160,66,28);
		panel3.add(label18);
		
		label19 = new JLabel("3:00 PM");
		label19.setFont(new Font("Serif",Font.PLAIN,15));
		label19.setForeground(Color.black);
		label19.setOpaque(true);
		//label19.setBackground(new Color(157,225,236));
		label19.setBounds(620,160,66,28);
		panel3.add(label19);
		
		label20 = new JLabel("5:00 PM");
		label20.setFont(new Font("Serif",Font.PLAIN,15));
		label20.setForeground(Color.black);
		label20.setOpaque(true);
		//label20.setBackground(new Color(157,225,236));
		label20.setBounds(540,200,66,28);
		panel3.add(label20);
		
		label21 = new JLabel("8:00 PM");
		label21.setFont(new Font("Serif",Font.PLAIN,15));
		label21.setForeground(Color.black);
		label21.setOpaque(true);
		//label21.setBackground(new Color(157,225,236));
		label21.setBounds(620,200,66,28);
		panel3.add(label21);
		
		//the dark knight
		
		label18 = new JLabel("12:00 PM");
		label18.setFont(new Font("Serif",Font.PLAIN,15));
		label18.setForeground(Color.black);
		label18.setOpaque(true);
		label18.setBackground(new Color(60,163,255));
		label18.setBounds(540,350,66,28);
		panel3.add(label18);
		
		label19 = new JLabel("3:00 PM");
		label19.setFont(new Font("Serif",Font.PLAIN,15));
		label19.setForeground(Color.black);
		label19.setOpaque(true);
		label19.setBackground(new Color(60,163,255));
		label19.setBounds(620,350,66,28);
		panel3.add(label19);
		
		label20 = new JLabel("5:00 PM");
		label20.setFont(new Font("Serif",Font.PLAIN,15));
		label20.setForeground(Color.black);
		label20.setOpaque(true);
		label20.setBackground(new Color(60,163,255));
		label20.setBounds(540,390,66,28);
		panel3.add(label20);
		
		
		label21 = new JLabel("8:00 PM");
		label21.setFont(new Font("Serif",Font.PLAIN,15));
		label21.setForeground(Color.black);
		label21.setOpaque(true);
		label21.setBackground(new Color(60,163,255));
		label21.setBounds(620,390,66,28);
		panel3.add(label21);
		
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me) {
		
		if(me.getSource()==B2) 
		{
			B3.setBackground(new Color(0,158,255));
			B3.setForeground(Color.yellow);
		}
		else if(me.getSource()==B3){
			B4.setBackground(new Color(0,158,255));
			B4.setForeground(Color.yellow);
		}
		else if(me.getSource()==B5){
			B5.setBackground(new Color(0,158,255));
			B5.setForeground(Color.yellow);
		}
		
	}
	public void mouseExited(MouseEvent me){
	if(me.getSource()==B2) 
		{
			B3.setBackground(new Color(140,173,5));
			
		}
		else if(me.getSource()==B3){
			B4.setBackground(new Color(140,173,5));
			
		}
		else if(me.getSource()==B5){
			B5.setBackground(new Color(140,173,5));
			
		}
		
	}
			
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== B2) {
			Namesmovie na = new Namesmovie();
			this.setVisible(false);
			na.setVisible(true);
		}
		else if(ae.getSource()==B3){
			Price p = new Price();
			this.setVisible(false);
			p.setVisible(true);
		}
		else if(ae.getSource()==B5){
			 Place P1 = new Place();
			 this.setVisible(false);
			 P1.setVisible(true);
		}
		else{
		}
	}

   public static void main(String [] args ){
	   
	   Timming T = new Timming();
   }

}
