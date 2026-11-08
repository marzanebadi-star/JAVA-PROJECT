// Import necessary libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Declare class Namesmovie which extends JFrame
  public class Namesmovie extends JFrame implements MouseListener,ActionListener {
  
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
	JButton B1,B2,B3,B4,B5,B6;
	
	JPanel panel1,panel2,panel3;
	
	 // Constructor
	public Namesmovie() 
	{
		super("Movies Name");// Set JFrame title
		this.setSize(750,510);// Set JFrame size
		setLocationRelativeTo(null);// Center JFrame on screen
		setResizable(false);// Disable JFrame resizing
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Set default close operation
		
		
		
		// Create and configure panel1
		
		panel1 = new JPanel();
		panel1.setBounds(0,0,750,50);
		panel1.setBackground(new Color(148,5,5));
		panel1.setBorder(BorderFactory.createLineBorder(Color.white));
		panel1.setLayout(null);
		
		// Create and configure panel2
		panel2 = new JPanel();
		panel2.setBounds(0,40,750,50);
		panel2.setBorder(BorderFactory.createLineBorder(Color.white));
		panel2.setLayout(null);
		
		// Create and configure panel3
		panel3 = new JPanel();
		panel3.setBounds(0,100,750,400);
		panel3.setBackground(new Color(232,111,95));
		panel3.setLayout(null);
		
		
		 // Create and configure label1
		label1 = new JLabel("CineWorld");
		label1.setFont(new Font("MV Boli",Font.BOLD,36));
		label1.setForeground(new Color(255,242,0));
		label1.setBounds(20,6,180,35);
		panel1.add(label1);
		
		
		
		// Create and configure B1 button
		B1 = new JButton(new ImageIcon(getClass().getResource("/Picture/Manush2.jpg")));
		B1.setBorder(null);
		B1.setBounds(685,9,34,32);
		B1.addMouseListener(this);
		B1.addActionListener(this);
		B1.setFocusable(false);
		
		panel1.add(B1);
		
		
		
		
		//panel 2
		// Create and configure B2 button (Movies)
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
		
		//Buttoon price of ticket
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
		B4.setBounds(405,12,100,35);
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
		
		
		//for panel 3
		
		
		label2 = new JLabel("Now Showing.....");
		label2.setFont(new Font("Tahoma",Font.ITALIC | Font.BOLD,22));
		label2.setForeground(Color.black);
		label2.setBounds(190,104,200,28);
		panel3.add(label2);
		
		
		B6 = new JButton("Get Ticket ");
		B6.setFont(new Font("Tahoma",Font.BOLD,25));
		B6.setForeground(Color.black);
		B6.setBackground(new Color(255,186,78));
		B6.setBounds(250,415,250,38);
		B6.addMouseListener(this);
		B6.addActionListener(this);
		B6.setFocusable(false);
	
		panel3.add(B6);
		
		
		
		//picture
		label3 = new JLabel(new ImageIcon(getClass().getResource("/Picture/Godzillaxkong.jpg")));
		label3.setBounds(20,150,155,210);
		panel3.add(label3);
		
		label4 = new JLabel(new ImageIcon(getClass().getResource("/Picture/JOKERRR.jpg")));
		label4.setBounds(200,150,155,210);
		panel3.add(label4);
		
		label5 = new JLabel(new ImageIcon(getClass().getResource("/Picture/SpiderMan.jpg")));
		label5.setBounds(380,150,155,210);
		panel3.add(label5);
		
		label6= new JLabel(new ImageIcon(getClass().getResource("/Picture/TheDarkKnight.jpg")));
		label6.setBounds(560,150,155,210);
		panel3.add(label6);
		
		//label for panel 3 add movies name
		label7 = new JLabel("Godzilla x Kong");
		label7.setFont(new Font("Serif",Font.BOLD,14));
		label7.setForeground(Color.black);
		label7.setBounds(24,365,200,20);
		panel3.add(label7);
		
		label8 = new JLabel("Joker");
		label8.setFont(new Font("Serif",Font.BOLD,14));
		label8.setForeground(Color.black);
		label8.setBounds(260,365,200,20);
		panel3.add(label8);
		
		label9 = new JLabel("Spider-Man");
		label9.setFont(new Font("Serif",Font.BOLD,14));
		label9.setForeground(Color.black);
		label9.setBounds(390,365,200,20);
		panel3.add(label9);
		
		label10 = new JLabel("The Dark Knight");
		label10.setFont(new Font("Serif",Font.BOLD,14));
		label10.setForeground(Color.black);
		label10.setBounds(570,365,200,20);
		panel3.add(label10);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		setVisible(true);
		
	}
	// Implement MouseListener methods
	public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me) {
		
		if(me.getSource()==B3) 
		{
			B3.setBackground(new Color(0,158,255));
			B3.setForeground(Color.black);
		}
		else if(me.getSource()==B4){
			B4.setBackground(new Color(0,158,255));
			B4.setForeground(Color.yellow);
		}
		else if(me.getSource()==B5){
			B5.setBackground(new Color(0,158,255));
			B5.setForeground(Color.yellow);
		}
		
	}
	public void mouseExited(MouseEvent me){
	if(me.getSource()==B3) 
		{
			B3.setBackground(new Color(140,173,5));
			
		}
		else if(me.getSource()==B4){
			B4.setBackground(new Color(140,173,5));
			
		}
		else if(me.getSource()==B5){
			B5.setBackground(new Color(140,173,5));
			
		}
		
	}
			
	// Implement ActionListener method
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()== B4){
			Timming T = new Timming();
			this.setVisible(false);
			T.setVisible(true);
		}
		else if(ae.getSource()==B3){
			Price p = new Price();
			this.setVisible(false);
			p.setVisible(true);
		}
		else if(ae.getSource()==B5){
			 Place P1 = new Place();
			 this.setVisible(false);
		P1.setVisible(true);}
		else if(ae.getSource()==B6){
			Purchase PP = new Purchase();
			this.setVisible(false);
			PP.setVisible(true);
		}
		else if(ae.getSource()==B1) {
			userinfo u = new userinfo();
			this.setVisible(false);
			u.setVisible(true);
			
		}
		else {
		}
		
	}
	// Main method
	public static void main (String [] args ){
		
		Namesmovie na = new Namesmovie();
	}
	
  }
  