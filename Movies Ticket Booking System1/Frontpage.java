import javax.swing.*;

//import org.w3c.dom.events.MouseEvent;
import java.awt.*;
import java.awt.event.*;


 public class Frontpage extends JFrame implements ActionListener {
	 
	 JLabel label1;
	 JButton button1,button2;
	 JPanel panel;
	 ImageIcon I1;
	 
	 public Frontpage() 
	 {
		 super("Front page");
		 this.setSize(750,500);
		 setLocationRelativeTo(null);
		 setResizable(false);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 
		 //panel
		 
		 panel = new JPanel();
		 panel.setBounds(0,0,750,500);
		 panel.setLayout(null);
		 
		 //Button
		 
		 button1 = new JButton("BACK");
		 button1.setFont(new Font("Times New Roman",Font.BOLD,23));
		 button1.setForeground(Color.white);
		 button1.setBackground(Color.black);
		 button1.setBorder(null);
		 button1.setBounds(25,420,88,40);
		 button1.addActionListener(this);
		 button1.setFocusable(false);
		 button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 panel.add(button1);
		 
		 
		 button2 = new JButton("LET'S STARTED");
		 button2.setFont(new Font("Times New Roman",Font.BOLD,23));
		 button2.setForeground(Color.white);
		 button2.setBackground(new Color(97,71,30));
		 button2.setBounds(120,420,220,40);
		 button2.addActionListener(this);
		 button2.setFocusable(false);
		 button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 panel.add(button2);
		 
		 
		 //picture
		 
		 label1 = new JLabel(new ImageIcon(getClass().getResource("/Picture/HOMEE.jpg")));
		 label1.setBounds(0,0,750,500);
		 panel.add(label1);
		 
		 this.add(panel);
		 setVisible(true);
	 }
	 
	 
	 public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource() == button1) 
		 {
			 this.dispose();
		 }
		 
		 else if(ae.getSource()==button2)
		 {
			 frame1 f = new frame1();
			 this.setVisible(false);
			 f.setVisible(true);
		 }
		 else {
		 }
	 }
 
 public static void main (String [] args) {
	 
	 Frontpage f1 = new Frontpage();
    }
 }