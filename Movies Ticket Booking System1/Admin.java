
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends JFrame implements ActionListener
{
	private JPanel panel, panel2;
	private JTextField t1,t2;;
	private JButton b1,b2,b3,backButton;	
	private ImageIcon img;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private Color c1,c2,c3;
	private JPasswordField p1;
	
	public Admin()
	{
		super ("Adminlogin");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1 = new Color (255,211,94);
		c2 = new Color (88,19,94);
		c3 = new Color (255,186,78);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds (0, 0, 350, 500);
		panel2.setBackground (Color.WHITE);
		
		panel = new JPanel();
		panel.setLayout (null);
		panel.setBounds (350, 0, 350, 500);
		panel.setBackground (Color.WHITE);
		
		l1 = new JLabel ("Usersname: ");
		l1.setBounds (20,150,80, 30);
		
		panel.add(l1);
		
		t1 = new JTextField();
		t1.setBounds (140,150,200,25);
		
		panel.add(t1);
		
		l2 = new JLabel ("Password: ");
		l2.setBounds (20,210,80, 30);
		
		panel.add(l2);
		
		p1 = new JPasswordField ();
		p1.setBounds (140, 210, 200, 25);
		panel.add(p1);
		
		l3 = new JLabel ("Admin login!");
		l3.setBackground(c2);
		l3.setBounds (125, 50, 380, 100);
		l3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		panel.add(l3);
		
		b1 = new JButton ("Login");
		b1.setBounds (150, 260, 100, 35);
		b1.setFont (new Font ("Times New Roman" , Font.BOLD, 16));
		b1.setForeground(Color.black);
		b1.setBackground (c3);
		b1.addActionListener(this);
		panel.add(b1);
		
		
		 backButton = new JButton("Back");
        backButton.setBounds(150, 310, 100, 35);
        backButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
        backButton.setForeground(Color.black);
        backButton.setBackground(c3);
        backButton.addActionListener(this);
        panel.add(backButton);
        
		l5 = new JLabel(new ImageIcon(getClass().getResource("/Picture/adminlogin.jpg")));
	   l5.setBounds(0,0,350,500);
	   panel2.add(l5);

		
		
		this.add(panel);
		this.add(panel2);
		this.setVisible(true);
		this.setSize (750,500);
		this.setLocationRelativeTo(null);
	}
	
	public void actionPerformed (ActionEvent ae)
	{
		/*if (ae.getSource() == b2)
		{
			Page1 p1 = new Page1();
			p1.setVisible (true);
			this.setVisible (false);
		}*/
		
		
		if(ae.getSource()==backButton){
			frame1 f = new frame1();
			f.setVisible(true);
			setVisible(false);
		}
		else if (ae.getSource() == b1)
		{
			if (t1.getText().equals("admin") && p1.getText().equals("admin"))
			{
			    UserData ud = new UserData();
			    ud.setVisible (true);
			    this.setVisible (false);
			}
			else
			{
				JOptionPane.showMessageDialog (this, "Invalid information");
			}
		}
	}
	public static void main(String [] args){
	Admin a = new Admin(); }
}