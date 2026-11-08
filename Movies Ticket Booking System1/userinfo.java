import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.*;
import java.io.IOException;


public class userinfo extends JFrame implements ActionListener {
	
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1,b2,b3;
	JPanel panel1,panel2;
	String line1,line2,line3,line4,line5;
	
	
	public userinfo() {
		
		super("user info");
		this.setSize(750,510);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
        panel1 = new JPanel();
		panel1.setBounds(0,0,750,80);
		panel1.setBackground(new Color(148,5,5));
		panel1.setBorder(BorderFactory.createLineBorder(Color.white));
		panel1.setLayout(null);
		
		panel2 = new JPanel();
		panel2.setBounds(0,80,750,430);
		panel2.setBorder(BorderFactory.createLineBorder(Color.white));
		panel2.setLayout(null);
		
		l1 = new JLabel("Information of User");
		l1.setFont(new Font("Times New Roman",Font.ITALIC | Font.BOLD,38));
		l1.setForeground(Color.black);
		l1.setBounds(20,22,480,35);
		panel1.add(l1);
		
		
		
		b1 = new JButton("Sign Out");
		b1.setFont(new Font("Times New Roman",Font.BOLD,20));
		b1.setBackground(Color.green);
		b1.setBounds(600,20,110,35);
		b1.addActionListener(this);
		b1.setFocusable(false);
		panel1.add(b1);
		
		b2 = new JButton("Back");
		b2.setFont(new Font("Times New Roman",Font.BOLD,20));
		b2.setBackground(Color.green);
		b2.setBounds(40,420,100,35);
		b2.addActionListener(this);
		b2.setFocusable(false);
		panel2.add(b2);
		

		//name
		l2 = new JLabel();
		l2.setFont(new Font("Times New Roman",Font.ITALIC | Font.BOLD,38));
		l2.setForeground(Color.black);
		l2.setBounds(55,120,480,35);
		panel2.add(l2);
		//passwords
		l3 = new JLabel();
		l3.setFont(new Font("Times New Roman",Font.ITALIC | Font.BOLD,38));
		l3.setForeground(Color.black);
		l3.setBounds(55,170,480,35);
		panel2.add(l3);
		//mobile
		l4 = new JLabel();
		l4.setFont(new Font("Times New Roman",Font.ITALIC | Font.BOLD,38));
		l4.setForeground(Color.black);
		l4.setBounds(55,220,480,35);
		panel2.add(l4);
		
		// for email
		l5 = new JLabel();
		l5.setFont(new Font("Times New Roman",Font.ITALIC | Font.BOLD,38));
		l5.setForeground(Color.black);
		l5.setBounds(55,270,480,35);
		panel2.add(l5);
		// for gender
		l6 = new JLabel();
		l6.setFont(new Font("Times New Roman",Font.ITALIC | Font.BOLD,38));
		l6.setForeground(Color.black);
		l6.setBounds(55,320,480,35);
		panel2.add(l6);
		
		
		try{
			//file read from starpage data.txt
			BufferedReader reader = new BufferedReader(new FileReader("data\\startpage data.txt"));
			reader.close();
			line1 = Files.readAllLines(Paths.get("data\\startpage data.txt")).get(0);
			line2 = Files.readAllLines(Paths.get("data\\startpage data.txt")).get(1);
			line3 = Files.readAllLines(Paths.get("data\\startpage data.txt")).get(2);
			line4 = Files.readAllLines(Paths.get("data\\startpage data.txt")).get(3);
			line5 = Files.readAllLines(Paths.get("data\\startpage data.txt")).get(4);
			
			
			
			//input all data in label
			//name
			l2.setText(line1);
			//pass
			l3.setText(line2);
			//mobile
			l4.setText(line3);
			//email
			l5.setText(line4);
			//gender
			l6.setText(line5);
		}
		catch(IOException e) 
		{
		}
		
		this.add(panel1);
		this.add(panel2);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1){
			//for sign out
			Login l = new Login();
			this.setVisible(false);
			l.setVisible(true);
			
		}
		else if(ae.getSource()==b2) {
			//for back
			Namesmovie na = new Namesmovie();
			this.setVisible(false);
			na.setVisible(true);
		}
		else {
		}
		
		}
	
	
	public static void main(String [] args){
		
		userinfo u = new userinfo();
	}
}
		