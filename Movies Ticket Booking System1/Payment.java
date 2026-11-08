import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 public class Payment extends JFrame implements ActionListener {
	  
	  JPanel panel1,panel2;
	  
	  JButton B1,B2;
	 
	  JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9;
	  
	  JTextField Text1;
	  
	  JPasswordField pass;
	  
	  JCheckBox chk1;
	  
	  JRadioButton R1,R2,R3;
	  
	  
	  //constructor method
	  public Payment()
	  {
		  super("PAYMENT");
		  this.setSize(750,510);
		  setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//create panels with specific dimension background borders layouts
		
	    panel1=new JPanel();                      //panel for the header
		panel1.setBounds(0,0,750,50);
		panel1.setBackground(new Color(148,5,5));
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setLayout(null);
		
		panel2=new JPanel();                      //panel for the content
		panel2.setBounds(0,50,750,460);
		panel2.setBackground(new Color(232,111,95));
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.setLayout(null);
	
	  //for panel 1
	  
	  	
	L1 = new JLabel("CineWorld");                                //header label
		L1.setFont(new Font("MV Boli",Font.BOLD,36));
		L1.setForeground(new Color(255,242,0));
		L1.setBounds(20,6,180,35);
		panel1.add(L1);
		
		// panel 2
	  
		B1 = new JButton("Back ");                                //back button
		B1.setFont(new Font("Times New Roman",Font.PLAIN,22));    
		B1.setForeground(Color.black);
		B1.setBackground(new Color(255,230,153));
		B1.setBounds(40,410,90,35);
		B1.addActionListener(this);
		B1.setFocusable(false);
		panel2.add(B1);
		
		B2 = new JButton("Confirm ");                             //confirm button
		B2.setFont(new Font("Times New Roman",Font.PLAIN,24));
		B1.setForeground(Color.black);
		B1.setBackground(new Color(146,208,80));
		B2.setBounds(585,410,120,40);
		B2.addActionListener(this);
		B2.setFocusable(false);
		panel2.add(B2);
		
		//label 
		
		L3 = new JLabel("  Do Your Payment!");        //payment instruction label
		L3.setFont(new Font("MV Boli",Font.BOLD | Font.ITALIC,32));
		L3.setForeground(Color.black);
		L3.setBackground(new Color(95,197,224));
		L3.setOpaque(true);
		L3.setBounds(210,60,380,40);
		panel2.add(L3);
	
		L4=new JLabel("We Accepted");            // accepted payment method label
		L4.setFont(new Font("Times New Roman",Font.BOLD,20));
		
		L4.setOpaque(true);
		L4.setForeground(Color.black);
		L4.setBackground(new Color(173,137,39));
		L4.setBounds(50,140,110,30);
		panel2.add(L4);
		
		
		
		//for radiobutton
		//bkash payment method1
		
		R1 = new JRadioButton();
		R1.setBounds(180,150,20,20);
		R1.setBackground(new Color(218,227,243));
		R1.setFocusable(false);
		panel2.add(R1);
		
		//L5 for picture
		L5=new JLabel(new ImageIcon(getClass().getResource("/Picture/Bikashhh.jpg")));
		L5.setOpaque(true);
		L5.setBackground(Color.white);
		L5.setBounds(200,130,110,70);
		panel2.add(L5);
		
		
		//Upay payment method 2
		R2=new JRadioButton();                //radio button for payment method 2
		R2.setBounds(340,150,20,20);
		R2.setBackground(new Color(218,227,243));
		R2.setFocusable(false);
	    panel2.add(R2);
		
		//L7 for picture
		L6=new JLabel(new ImageIcon(getClass().getResource("/Picture/Upay.jpg")));
		L6.setOpaque(true);
		L6.setBackground(Color.black);
		L6.setBounds(365,130,110,70);
		panel2.add(L6);
		
		
		//nogod payment method 3
		R3=new JRadioButton();            //radio button for payment method3
		R3.setBounds(500,150,20,20);
		R3.setBackground(new Color(218,227,243));
		R3.setFocusable(false);
	    panel2.add(R3);
		//L8 for picture
		L7=new JLabel(new ImageIcon(getClass().getResource("/Picture/nogodd.jpg")));
		L7.setOpaque(true);
		L7.setBackground(Color.white);
		L7.setBounds(525,130,110,70);
		panel2.add(L7);
		
		
		ButtonGroup G = new ButtonGroup();
		G.add(R1);
		G.add(R2);
		G.add(R3);
		
		//Phone no label
		
		L8=new JLabel("Phone No :");
		L8.setFont(new Font("Times New Roman",Font.BOLD,21));
		L8.setOpaque(true);
		L8.setBackground(new Color(218,227,243));
		L8.setBounds(150,270,160,30);
		panel2.add(L8);
		
		Text1 = new JTextField();
		Text1.setFont(new Font("Times New Roman",Font.PLAIN,21));
		Text1.setBounds(320,275,220,28);
		Text1.setBounds(320,275,220,28);
		panel2.add(Text1);
		
		//password label
		
		L9=new JLabel("Password:");
		L9.setFont(new Font("Times New Roman",Font.BOLD,21));
		L9.setOpaque(true);
		L9.setBackground(Color.white);
		L9.setBounds(150,320,160,30);
		panel2.add(L9);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Times New Roman",Font.BOLD,21));
		pass.setEchoChar('*');
		pass.setBounds(320,325,220,28);
		panel2.add(pass);
		
		//chkbox to show/hide password
		
		chk1 = new JCheckBox("Show Password ");
		chk1.setFont(new Font("Times New Roman",Font.BOLD,16));
		chk1.setForeground(Color.black);
		chk1.setBackground(new Color(173,137,39));
		chk1.setBounds(315,355,270,38);
		chk1.addActionListener(this);
		panel2.add(chk1);
		
		
		
		this.add(panel1);
		this.add(panel2);
		setVisible(true);                   //make the  JFrame visible
		
	  }
	  
	  
	  //Actionlistener meethod
	  
	  public void actionPerformed(ActionEvent ae) {
		  if(ae.getSource()==B1) {
			  //back button action
			  Purchase PP = new Purchase();
			  this.setVisible(false);
			  PP.setVisible(true);
		  }
		  
		  else if(ae.getSource()==B2) {
			  //confirm button
			  
			  if(!(R1.isSelected() || R2.isSelected() || R3.isSelected()))
			  {
				  // if payment is nor select and textfield not filled
				  JOptionPane.showMessageDialog(this,"Please Select a Payment Method");
			  }
			  else if(Text1.getText().length() <=0 || pass.getText().length() <=0) {
				    //if phone no or password field are empty
				    JOptionPane.showMessageDialog(this,"Filled All");
			  }
			  else {   
			      //if all fields are filled,procced with payment
				  
				  JOptionPane.showMessageDialog(this,"Payment Done");
				  JOptionPane.showMessageDialog(this,"You can collect Ticket from ticket counter");
				  
				  Namesmovie na = new Namesmovie();
				  this.setVisible(false);
				  na.setVisible(true);
			  }
		  }
		  else if(chk1.isSelected()) {     // show /hide password checkbox action
			  pass.setEchoChar((char)0);
		  }
		  else{
			  pass.setEchoChar('*');
		  }
	  }
	  
 }
 
  