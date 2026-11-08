import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

  public class Purchase extends JFrame implements ActionListener {
	  
	  JPanel panel1,panel2,panel3,panel4;
	  JButton B1,B2,B3,B4;
	  JComboBox combo1,combo2,combo3,combo4,combo5,combo6;
	  JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17,L18,L19;
	  
	  
	  
	  public Purchase()
	  {
		super("Parchase Ticket");
		this.setSize(750,510);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		panel1=new JPanel();
		panel1.setBounds(0,0,750,50);
		panel1.setBackground(new Color(148,5,5));
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setLayout(null);
		
		panel2=new JPanel();
		panel2.setBounds(0,50,750,460);
		panel2.setBackground(new Color(232,111,95));
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.setLayout(null);
	
		panel3=new JPanel();
		panel3.setBounds(0,50,750,460);
		panel3.setBackground(new Color(232,111,95));
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel3.setLayout(null);
		
		//panel for headline
		
	L1 = new JLabel("CineWorld");
		L1.setFont(new Font("MV Boli",Font.BOLD,36));
		L1.setForeground(new Color(255,242,0));
		L1.setBounds(20,6,180,35);
		panel1.add(L1);
		
		//panel for buttons in panel2
		
		B1 = new JButton("Carry On ");
		B1.setFont(new Font("Times New Roman",Font.PLAIN,26));
		B1.setBounds(550,410,160,38);
		B1.addActionListener(this);
		B1.setFocusable(false);
		panel2.add(B1);
		
		B2 = new JButton("Back ");
		B2.setFont(new Font("Times New Roman",Font.PLAIN,26));
		B2.setBounds(30,415,100,34);
		B2.setBackground(Color.ORANGE);
		B2.addActionListener(this);
		B2.setFocusable(false);
		panel2.add(B2);
		
		//in label 3
		L3 = new JLabel("Purchase Ticket now....");
		L3.setFont(new Font("MV Boli",Font.BOLD,28));
		L3.setForeground(Color.black);
		L3.setOpaque(true);
		L3.setBackground(new Color(95,197,224));
		L3.setBorder(BorderFactory.createLineBorder(Color.black));
		L3.setBounds(220,70,320,37);
		panel2.add(L3);
		//Date
		L4=new JLabel("Choose Date");
		L4.setFont(new Font("Times New Roman",Font.ITALIC,18));
		L4.setForeground(Color.black);
		L4.setBounds(35,150,125,20);
		panel2.add(L4);
		
		
		String date[] ={"14 May 2024","15 May 2024","16 May 2024"};
		combo1 = new JComboBox(date);
        combo1.addActionListener(this);
        combo1.setBounds(150,150,200,28);
        panel2.add(combo1);		
	   
	   //movie choosen
	   L5=new JLabel("Choose Movie");
	   L5.setFont(new Font("Times New Roman",Font.ITALIC,18));
		L5.setForeground(Color.black);
		L5.setBounds(35,230,200,28);
		panel2.add(L5);
		
		
		String movie[]={"Godxilla X Kong","Joker","Spider-Man","The Dark Knight"};
		combo2 = new JComboBox(movie);
        combo2.addActionListener(this);
        combo2.setBounds(150,230,200,28);
        panel2.add(combo2);		
	   
	   //Teatre
	   
		 L6=new JLabel("Choose Theatre");
	   L6.setFont(new Font("Times New Roman",Font.ITALIC,18));
		L6.setForeground(Color.black);
		L6.setBounds(390,150,125,20);
		panel2.add(L6);
		
		
		String place[]={"Bashundhara City Complex","Sony Square","Lion Shoppers World"};
		combo3 = new JComboBox(place);
        combo3.addActionListener(this);
        combo3.setBounds(540,150,125,20);
		
        panel2.add(combo3);		
	   //time
		 L7=new JLabel("Choose Time");
	   L7.setFont(new Font("Times New Roman",Font.ITALIC,18));
		L7.setForeground(Color.black);
		L7.setBounds(390,230,125,20);
	
		panel2.add(L7);
		
		
		String timming[]={"12:00 PM","3:00 PM","5:00 PM","8:00 PM"};
		combo4= new JComboBox(timming);
        combo4.addActionListener(this);
        combo4.setBounds(510,230,200,28);
        panel2.add(combo4);		
		
		//seat
		 L8=new JLabel("Seat ");
	   L8.setFont(new Font("Times New Roman",Font.ITALIC,18));
		L8.setForeground(Color.black);
		L8.setBounds(390,310,125,20);
		panel2.add(L8);
		
		
		String seat[]={"Regular","Premium","VIP"};
		combo5 = new JComboBox(seat);
        combo5.addActionListener(this);
        combo5.setBounds(510,310,200,28);
        panel2.add(combo5);		
		//number choosen
		 L9=new JLabel("No Of Seat");
	     L9.setFont(new Font("Times New Roman",Font.ITALIC,18));
		L9.setForeground(Color.black);
		L9.setBounds(35,310,125,20);
		panel2.add(L9);
		
		
		String seatno[]={"01","02","03","04","05","06"};
		combo6 = new JComboBox(seatno);
        combo6.addActionListener(this);
        combo6.setBounds(150,310,200,28);
        panel2.add(combo6);		
		
		//Total
		L10 = new JLabel("Total Charge");
		L10.setFont(new Font("Times New Roman",Font.BOLD,18));
		L10.setForeground(Color.black);
		L10.setBounds(240,385,125,20);
		panel2.add(L10);
		
		L11=new JLabel();
		L11.setFont(new Font("Times New Roman",Font.BOLD,19));
		L11.setOpaque(true);
		L11.setBackground(Color.white);
		L11.setForeground(Color.black);
		L11.setBounds(350,385,75,28);
		panel2.add(L11);
		
		
		
		// panel 3
		
		B3=new JButton("Back");
		B3.setFont(new Font ("Times New Roman",Font.BOLD,22));
		B3.setBounds(30,415,100,34);
		B3.setBackground(Color.ORANGE);
		B3.addActionListener(this);
		B3.setFocusable(false);
		panel3.add(B3);
		
		B4=new JButton("Confirm");
		B4.setFont(new Font ("Times New Roman",Font.BOLD,22));
		B4.setBounds(560,410,140,38);
		B4.setBackground(Color.red);
		B4.addActionListener(this);
		B4.setFocusable(false);
		panel3.add(B4);
		
		
		panel4 = new JPanel();
		panel4.setBounds(200,130,340,310);
		panel4.setBackground(new Color(255,0,172));
		panel4.setLayout(null);
		
		L9=new JLabel("Details of Ticket");
		L9.setFont(new Font("Times New Roman",Font.BOLD | Font.ITALIC,36));
		L9.setBounds(220,70,350,30);
		panel3.add(L9);
		
		//panel 4
		//movie name
		L12=new JLabel();
		L12.setFont(new Font("Times New Roman",Font.BOLD,17));
		L12.setBounds(10,20,350,20);
		panel4.add(L12);
		
		//theatre name
		
		L13=new JLabel();
		L13.setFont(new Font("Times New Roman",Font.BOLD,17));
		L13.setBounds(10,70,350,20);
		panel4.add(L13);
		
		//time
		L14=new JLabel();
		L14.setFont(new Font("Times New Roman",Font.BOLD,17));
		L14.setBounds(10,120,300,20);
		panel4.add(L14);
		// seat type
		L15=new JLabel();
		L15.setFont(new Font("Times New Roman",Font.BOLD,17));
		L15.setBounds(10,170,300,22);
		panel4.add(L15);
	//no seat
	L16=new JLabel();
		L16.setFont(new Font("Times New Roman",Font.BOLD,17));
		L16.setBounds(10,220,300,20);
		panel4.add(L16);
		//for date
		L17=new JLabel();
		L17.setFont(new Font("Times New Roman",Font.BOLD,17));
		L17.setBounds(10,270,300,20);
		panel4.add(L17);
		//price
		L18=new JLabel();
		L18.setFont(new Font("Times New Roman",Font.BOLD,17));
		L18.setBounds(10,320,300,20);
		panel4.add(L18);
		
		this.add(panel1);
		this.add(panel2);
		setVisible(true);
	  }
	  
	  public void actionPerformed(ActionEvent ae) {
		  
		  //price calculation [like ((600*(3+1)))]
		  if((combo5.getSelectedIndex()==0)) {
			  int A = 600;
			  int B = combo6.getSelectedIndex();
			  int sum = A*(B+1);
			  
			  L11.setText(" "+String.valueOf(sum)+"TK");
		  }
		  else if((combo5.getSelectedIndex()==1)) {
			  
			  int A = 900;
			  int B = combo6.getSelectedIndex();
			  int sum = A*(B+1);
			  
			  L11.setText(" "+String.valueOf(sum)+"TK");
		  }
		  else if((combo5.getSelectedIndex()==2)) {
			  int A = 1200;
			  int B = combo6.getSelectedIndex();
			  int sum = A*(B+1);
			  
			  L11.setText(" "+String.valueOf(sum)+"TK");
		  }
		  
		  //carry on in panel 2
		  if(ae.getSource()==B1) {
			  this.add(panel4);
			  this.add(panel3);
			  panel2.setVisible(false);
			  panel3.setVisible(true);
		  }
		  //back button in panel 3
		  else if(ae.getSource()==B3) {
			  panel2.setVisible(true);
			  panel3.setVisible(false);
			 
		  }
		 //back button for panel 2
		  else if(ae.getSource()==B2) {
			  Namesmovie na = new Namesmovie();
			  na.setVisible(true);
			  this.setVisible(false);
		  }
		  //confirm button in panel 4
		  else if(ae.getSource()==B4) {
			  Payment P2 = new Payment();
			  P2.setVisible(true);
			  this.setVisible(false);
		  }
		  else {
		  }
		 
		  
		  //ticket info data input
		  
		  L12.setText("Movie -      "+combo2.getSelectedItem());
		  
		  L13.setText("Theatre   -           "+combo3.getSelectedItem());
		  
		  L17.setText("Date  :        "+combo1.getSelectedItem());
		  
		  L15.setText("Seat -       "+combo5.getSelectedItem());
		  
		  L16.setText("NO of Seat -    "+combo6.getSelectedItem()); 
			
		L14.setText("Show Time -    "+combo4.getSelectedItem());
		
		 L17.setText("Ticket Price     "+L11.getText());
	  }
  }
	  
		 