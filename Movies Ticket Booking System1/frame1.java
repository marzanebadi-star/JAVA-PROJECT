import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class frame1 extends JFrame implements ActionListener{

    JButton b1 ,b2;
	JPanel p1,p2;
	JLabel l5;
    
	
	public frame1()
	{
		
		super("admin/user button");
		this.setSize(750,500);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panel 
		//this for image
		p1 = new JPanel();
        p1.setBounds(0,0,350,500);
        p1.setLayout(null);

       //this for buttons
		p2 = new JPanel();
        p2.setBounds(350,0,350,500);
        p2.setBackground(new Color(255,211,94));
        p2.setLayout(null);
		
		
		b1 = new JButton("Admin Login");
		b1.setForeground(Color.red);
	    b1.setBackground(new Color(240,240,240));
	    b1.setBorder(null);
		b1.setBounds(400,140,250,20);
		b1.addActionListener(this);
		p2.add(b1);
		
		
		b2 = new JButton("User Login");
		b2.setForeground(Color.red);
	    b2.setBackground(new Color(240,240,240));
	    b2.setBorder(null);
		b2.setBounds(400,215,250,20);
		b2.addActionListener(this);
		p2.add(b2);
		
		//panel 1 for image
		l5 = new JLabel(new ImageIcon(getClass().getResource("/Picture/frame1.jpg")));
	   l5.setBounds(0,0,350,500);
	   p1.add(l5);

		this.add(p1);
		this.add(p2);
		setVisible(true);
		
	}
	public void actionPerformed (ActionEvent ae){
		
		if(ae.getSource() == b2){
			
			Login l = new Login();
			this.setVisible(false);
			l.setVisible(true);
		}
		else if(ae.getSource() == b1){
			Admin a = new Admin();
			this.setVisible(false);
			a.setVisible(true);
		}
		else{
		}
	}
	public static void main(String [] args){
		
		frame1 f = new frame1();
	}
}
//javac frame1.java && java frame1