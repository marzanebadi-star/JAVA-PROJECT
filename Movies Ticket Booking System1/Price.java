import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class Price extends JFrame implements MouseListener,ActionListener {
	 
	 
	 JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
	 
	 JButton B1,B2,B3,B4,B5,B6;
	 JPanel panel1,panel2,panel3,panel4,panel5;
	 
	 public Price() {
		 
		 super("Prices");
		 this.setSize(750,510);
		 setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 //panels
		 panel1 = new JPanel();
		panel1.setBounds(0,0,750,50);
		panel1.setBackground(new Color(148,5,5));
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setLayout(null);

     
	    panel2 = new JPanel();
		panel2.setBounds(0,40,750,50);
		//panel2.setBackground(new Color(202,171,255));
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.setLayout(null);
		
		panel3 = new JPanel();
		panel3.setBounds(0,90,254,410);
		panel3.setBackground(new Color(232,111,95));
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel3.setLayout(null);
		
		panel4=new JPanel();
		panel4.setBounds(245,90,245,410);
		panel4.setBorder(BorderFactory.createLineBorder(Color.black));
		panel4.setLayout(null);
		
		panel5 = new JPanel();
		panel5.setBounds(490,90,260,410);
		panel5.setBackground(new Color(52,176,26));
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel5.setLayout(null);
		
		
		
		
		
		label1 = new JLabel("CineWorld");
		label1.setFont(new Font("MV Boli",Font.BOLD,36));
		label1.setForeground(new Color(255,242,0));
		label1.setBounds(20,8,180,35);
		panel1.add(label1);
		
		B1 = new JButton(new ImageIcon(getClass().getResource("/Picture/Manush2.jpg")));
		B1.setBorder(null);
		B1.setBounds(685,9,34,32);
		B1.addMouseListener(this);
		B1.addActionListener(this);
		B1.setFocusable(false);
		
		panel1.add(B1);
		
		//Button movie
		
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
		
		//button ticket price
		B3 = new JButton("Price Ticket");
		B3.setFont(new Font("Calibri",Font.BOLD,18));
		B3.setForeground(Color.black);
		B3.setBackground(new Color(255,186,78));
		B3.setBorder(null);
		B3.setBounds(230,12,90,35);
		B3.addMouseListener(this);
		B3.addActionListener(this);
		B3.setFocusable(true);
		
		panel2.add(B3);
		//butoon time
		
		B4 = new JButton("Timming");
		B4.setFont(new Font("Calibri",Font.BOLD,18));
		B4.setForeground(Color.black);
		B4.setBackground(new Color(255,186,78));
		B4.setBorder(null);
		B4.setBounds(405,12,140,38);
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
		
		
	   //panel 3 for premium seat add
	   
	   
	   
	   label5 = new JLabel("Premium ");
	   label5.setFont(new Font("Times New Roman",Font.PLAIN,22));
	   label5.setBounds(60,120,210,140);
	   panel3.add(label5);
	   //panel 4 for regular seat add
	   label6 = new JLabel("Regular ");
	   label6.setFont(new Font("Times New Roman",Font.PLAIN,22));
	   label6.setBounds(60,120,210,140);
	   panel4.add(label6);
	   //panel 5 for vip seat add
	   label7 = new JLabel("VIP ");
	   label7.setFont(new Font("Times New Roman",Font.PLAIN,22));
	   label7.setBounds(575,208,210,140);
	   panel5.add(label7);
	   
	   //add pricess in pnael 3,4,5
	   label8 = new JLabel("900 Tk:Each");
	   label8.setFont(new Font("Times New Roman",Font.ITALIC | Font.BOLD,22));
	   label8.setBounds(30,220,210,140);
	   panel3.add(label8);
	   
	   label9 = new JLabel("600 Tk:Each");
	   label9.setFont(new Font("Times New Roman",Font.ITALIC | Font.BOLD,22));
	   label9.setBounds(30,220,210,140);
	   panel4.add(label9);
	   
	   label10 = new JLabel("1200 Tk:Each");
	   label10.setFont(new Font("Times New Roman",Font.ITALIC | Font.BOLD,22));
	   label10.setBounds(520,312,210,140);
	   panel5.add(label10);
	   
	   
	   this.add(panel1);
	   this.add(panel2);
	   this.add(panel3);
	   this.add(panel4);
	   this.add(panel5);
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
	if(me.getSource()==B2) 
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
			
	 public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource()==B2) {
			 Namesmovie na = new Namesmovie();
			 this.setVisible(false);
			 na.setVisible(true);
		 }
		 
		 else if(ae.getSource()==B4){
			 
			 Timming T = new Timming();
			 this.setVisible(false);
			 T.setVisible(true);
		 }
		 else if(ae.getSource()==B5){
			 Place P1 = new Place();
			 this.setVisible(false);
			 P1.setVisible(true);
		 }
		 else {
		 }
	 }
 }