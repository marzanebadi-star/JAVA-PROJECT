
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class addUser extends JFrame implements ActionListener
{
	private JPanel panel,panel2;	
	private JButton b1,b2,b3,b4,b5,b6,b7;
	private ImageIcon img, pet, faiza,ifti;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	private Color c1,c2,c3;
	private JComboBox comb1,comb2;
	private JTextField t1,t2,t3,t4;
	private Font f1;
	

	
	
	public addUser()
	{
		super ("All Users");
		
		
		
		this.setSize (800,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1 = new Font("Times New Roman", Font.PLAIN, 13);
		c1 = new Color (200, 191, 231);
		c2 = new Color (173,177,255);
		
		
		
		panel = new JPanel ();
		panel.setLayout (null);
		panel.setBounds (0, 0, 800, 75);
		panel.setBackground (Color.RED);
		
		panel2 = new JPanel ();
		panel2.setLayout (null);
		panel2.setBounds (0, 75, 800, 600);
		panel2.setBackground (new Color(255,211,94) );
		
		b2 = new JButton ("Back");
		b2.setBackground (Color.WHITE);
		b2.setBounds(540, 20, 100, 30);
		b2.addActionListener (new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				UserData ua = new UserData();
			    ua.setVisible (true);
			    setVisible (false);
			}
			
		});
		panel.add(b2);
		
		b3 = new JButton("Log out");
		b3.setBackground (Color.WHITE);
		b3.setBounds(660, 20, 100, 30);
		b3.addActionListener (new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				Admin a = new Admin();
				a.setVisible(true);
				setVisible(false);
			}
			
		});
		panel.add(b3);
		
		l1 = new JLabel ("UserName: ");
		l1.setBounds (20, 100, 100, 20);
		l1.setFont (f1);
		panel2.add(l1);
		
		t1 = new JTextField ();
		t1.setBounds (130, 100, 200, 25);
		panel2.add(t1);
		
		l2 = new JLabel ("Password: ");
		l2.setBounds (20, 150, 100, 25);
		l2.setFont (f1);
		panel2.add(l2);
		
		t2 = new JTextField ();
		t2.setBounds (130, 150, 200, 25);
		panel2.add(t2);
		
		l3 = new JLabel ("Phone: ");
		l3.setBounds (20, 200, 100, 25);
		l3.setFont (f1);
		panel2.add(l3);
		
		t3 = new JTextField ();
		t3.setBounds (130, 200, 200, 25);
		panel2.add(t3);
		
		l4 = new JLabel ("Email: ");
		l4.setBounds (20, 250, 100, 25);
		l4.setFont (f1);
		panel2.add(l4);
		
		t4 = new JTextField ();
		t4.setBounds (130, 250, 200, 25);
		panel2.add(t4);
		
		b5 = new JButton ("Add User ");
		b5.setBounds (130, 320, 100, 30);
		b5.setFont (new Font ("Times New Roman" , Font.BOLD, 14));
		b5.setForeground(Color.BLACK);
		b5.setBackground (Color.RED);
		b5.addActionListener(this);
		panel2.add(b5);
		
		
		this.add(panel);
		this.add(panel2);
		this.setVisible (true);
		
		
	}
	
	public void actionPerformed (ActionEvent ae)
	{
		if (ae.getSource() == b5)
		
		{
			String s1 = t1.getText();
			String s2 = t2.getText();
			String s3 = t3.getText();
			String s4 = t4.getText();
			
			
			if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty())
			{
				JOptionPane.showMessageDialog (this, "Invalid information");
			}
							
			else
			{
				User us = new User (s1,s2,s3,s4);
				us.addAccount();
				JOptionPane.showMessageDialog (this, "Successfully add movies ");
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");
				t4.setText(" ");
			}
		}
	}
	public static void main(String [] args){
		addUser u = new addUser();
	}
}
