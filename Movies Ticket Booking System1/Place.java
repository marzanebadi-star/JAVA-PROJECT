import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Place extends JFrame implements MouseListener,ActionListener {
	
	//Declare necessary components
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,
	label10;
	JButton B1,B2,B3,B4,B5,B6;
	JPanel panel1,panel2,panel3,panel4,panel5,panel6;
	
	//Constructor method
	public Place() {
		super("Places");                  //set  title of the JFrame
		this.setSize(750,510);            //set  size of the JFrame
		setLocationRelativeTo(null);      //set  location of the Jframe to the center of the screen
		setResizable(false);              //Disable resizing of the JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set defaukt close operation
		
		
		
		//panel create with specific dimension,background,borders,layouts
		
		panel1=new JPanel();              //panel for the header
		panel1.setBounds(0,0,750,50);
		panel1.setBackground(new Color(148,5,5));
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setLayout(null);
		
		
		
		panel2=new JPanel();              //panel for navigation buttons
		panel2.setBounds(0,40,750,50);
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.setLayout(null);
		
		
		
		panel3=new JPanel();             //panel for displaying place 1 information
		panel3.setBounds(50,110,650,100);
		panel3.setBackground(new Color(232,111,95));
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel3.setLayout(null);
		
		
		
		panel4=new JPanel();             //panel for displaying place 2 information
		panel4.setBounds(50,230,650,100);
		panel4.setBackground(new Color(255,211,94));
		panel4.setBorder(BorderFactory.createLineBorder(Color.black));
		panel4.setLayout(null);
		
		
		
		panel5=new JPanel();             //panel for displaying place 3 information
		panel5.setBounds(50,350,650,100);
		panel5.setBackground(new Color(52,176,26));
		panel5.setBorder(BorderFactory.createLineBorder(Color.black));
		panel5.setLayout(null);
		
		
		
		panel6=new JPanel();             // main panel for layout
		panel6.setBounds(0,100,750,410);
		panel6.setBackground(Color.white);
		
		panel6.setBorder(BorderFactory.createLineBorder(Color.black));
		panel6.setLayout(null);
		
		
		
		
		label1 = new JLabel("CineWorld");                    //header label
		label1.setFont(new Font("MV Boli",Font.BOLD,36));
		label1.setForeground(new Color(255,242,0));
		label1.setBounds(20,6,180,35);
		panel1.add(label1);
		
		
		
		//in panel 1 for haedline and userinfo icon image
		
		B1 = new JButton(new ImageIcon(getClass().getResource("/Picture/Manush2.jpg")));
		B1.setBorder(null);
		B1.setBounds(685,9,34,32);
		B1.addMouseListener(this);
		B1.addActionListener(this);
		B1.setFocusable(false);
		
		panel1.add(B1);
		
		//for panel 2
		
		B2 = new JButton("Movies");                        //movies button
		B2.setFont(new Font("Calibri",Font.BOLD,18));
		B2.setForeground(Color.black);
		B2.setBackground(new Color(255,186,78));
		B2.setBorder(null);
		B2.setBounds(25,12,150,35);
		B2.addMouseListener(this);
		B2.addActionListener(this);
		B2.setFocusable(false);
		
		panel2.add(B2);
		
		
		
		B3 = new JButton("Price Ticket");                  // price button
		B3.setFont(new Font("Calibri",Font.BOLD,18));
		B3.setForeground(Color.black);
		B3.setBackground(new Color(255,186,78));
		B3.setBorder(null);
		B3.setBounds(230,12,90,35);
		B3.addMouseListener(this);
		B3.addActionListener(this);
		B3.setFocusable(false);
		
		panel2.add(B3);
		
		
		
		B4 = new JButton("Timming");                       //timing button
		B4.setFont(new Font("Calibri",Font.BOLD,18));
		B4.setForeground(Color.black);
		B4.setBackground(new Color(255,186,78));
		B4.setBorder(null);
		B4.setBounds(405,12,100,35);
		B4.addMouseListener(this);
		B4.addActionListener(this);
		B4.setFocusable(false);
		
		panel2.add(B4);
		
		
		
		B5 = new JButton("Places");                        //places button
		B5.setFont(new Font("Calibri",Font.BOLD,18));
		B5.setForeground(Color.black);
		B5.setBackground(new Color(255,186,78));
		B5.setBorder(null);
		B5.setBounds(600,12,80,35);
		B5.addMouseListener(this);
		B5.addActionListener(this);
		B5.setFocusable(false);
		
		panel2.add(B5);
		
		
		
		//panel 3 for one place
		
		label2 = new JLabel("<html> Bashundhara City Shopping Complex <br/> Tejturi Bazar West,Panthapath,Dhaka 1215 </html>");
		label2.setFont(new Font("Times New Roman",Font.ITALIC,20));
		label2.setForeground(Color.black);
		label2.setBounds(20,8,440,80);
		panel3.add(label2);
		//panel 4 for another place
		label3 = new JLabel("<html> Sony Square <br/> 105 Mirpur Road,Dhaka 1216 </html>");
		label3.setFont(new Font("Times New Roman",Font.ITALIC,20));
		label3.setForeground(Color.black);
		label3.setBounds(20,8,440,80);
		panel4.add(label3);
		//panel 5 for another place
		label4 = new JLabel("<html> Level 7, Lion Shoppers World <br/> Kadumtoli Model Town <br/> Babubazar Bridge,Dhaka 1310 <html>");
		label4.setFont(new Font("Times New Roman",Font.ITALIC,20));
		label4.setForeground(Color.black);
		label4.setBounds(20,8,440,80);
		panel5.add(label4);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		this.add(panel6);
		setVisible(true);       //Make the JFrame visible
	}
	public void mouseClicked(MouseEvent me){} //implementing mouselistener methods
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me) {
		
		if(me.getSource()==B2) 
		{
			B3.setBackground(new Color(0,158,255));
			B3.setForeground(Color.yellow);
		}
		else if(me.getSource()==B4){
			B4.setBackground(new Color(0,158,255));
			B4.setForeground(Color.yellow);
		}
		else if(me.getSource()==B3){
			B5.setBackground(new Color(0,158,255));
			B5.setForeground(Color.yellow);
		}
		
	}
	public void mouseExited(MouseEvent me){
	if(me.getSource()==B2) 
		{
			B3.setBackground(new Color(140,173,5));
			
		}
		else if(me.getSource()==B4){
			B4.setBackground(new Color(140,173,5));
			
		}
		else if(me.getSource()==B3){
			B5.setBackground(new Color(140,173,5));
			
		}
		
	}
	public void actionPerformed(ActionEvent ae){  //implementing actionlistener method
		if(ae.getSource()==B2){
			//movies button
			Namesmovie na = new Namesmovie();
			this.setVisible(false);
			na.setVisible(true);
		}
		else if(ae.getSource()==B4){
			//time button
			Timming Ti = new Timming();
			this.setVisible(false);
			Ti.setVisible(true);
		}
		else if(ae.getSource()==B3) {
			//price button
			Price p = new Price();
			this.setVisible(false);
			p.setVisible(true);
		}
		else{
		}
		
			
	}
}
		