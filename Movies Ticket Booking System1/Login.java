import java.lang.*;
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

public class Login extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5;
	   
	JTextField t1;
	   
	JButton b1,b2,backButton;
	   
	JPasswordField pa1;
	   
	JPanel P1,P2;

	JCheckBox c1;
	

    public Login ()
    {
        super(" log in ");
		this.setSize(750,500);
		setLocationRelativeTo(null);//Center in Frame
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    // two panel create one for image and one for log in 
        P1 = new JPanel();
        P1.setBounds(0,0,350,500);
        P1.setLayout(null);


		P2 = new JPanel();
        P2.setBounds(350,0,350,500);
        P2.setBackground(new Color(255,211,94));
        P2.setLayout(null);


    //lebels
        l1 = new JLabel(" Have an account?");
		l1.setFont(new Font("Times New Roman",Font.PLAIN,14));
		l1.setForeground(Color.black);
		l1.setBounds(530,13,150,15);
		P2.add(l1);

        l2 = new JLabel("Account log in");
		l2.setFont(new Font("Times New Roman",Font.PLAIN,24));
		l2.setForeground(Color.red);
		l2.setBounds(480,80,500,28);
		P2.add(l2);

      
    //names
	
        l3 = new JLabel("User name ");
        l3.setFont(new Font("Times New Roman",Font.PLAIN,17));
        l3.setForeground(Color.black);
        l3.setBounds(400,140,250,20);
        P2.add(l3);
    
        t1 = new JTextField();
		t1.setFont(new Font("Times New Roman",Font.PLAIN,19));
        t1.setBounds(400,170,270,27);
        P2.add(t1);
        


    //password
       l4 = new JLabel("Password ");
	   l4.setFont(new Font("Times New Roman",Font.PLAIN,18));
	   l4.setForeground(Color.black);
	   l4.setBounds(400,215,250,20);
	   P2.add(l4);
			
	   pa1 = new JPasswordField();
	   pa1.setEchoChar('*');
	   pa1.setFont(new Font("Times New Roman",Font.PLAIN,19));
	   pa1.setBounds(400,245,270,27);
	   P2.add(pa1);



    //button for registar add in panel2
	   b1 = new JButton("Register");
	   b1.setFont(new Font("Times New Roman",Font.BOLD,14));
	   b1.setForeground(Color.red);
	   b1.setBackground(new Color(240,240,240));
	   b1.setBorder(null);
	   b1.setBounds(670,9,55,20);
	   b1.addActionListener(this);
	  P2.add(b1);
//button for login add in ppanel2

	   b2 = new JButton("Login");
	   b2.setFont(new Font("Times New Roman",Font.BOLD,22));
	   b2.setForeground(Color.white);
	   b2.setBackground(new Color(102,140,208));
	   b2.setBounds(400,340,270,38);
	   b2.addActionListener(this); 
	  
	   P2.add(b2);
	   
	   
         backButton = new JButton("Back");
        backButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        backButton.setForeground(Color.red);
        backButton.setBackground(new Color(240, 240, 240));
        backButton.setBorder(null);
        backButton.setBounds(400, 380, 270, 20); // Positioned below the login button
        backButton.addActionListener(this);
        P2.add(backButton);

    //cheak password

       c1 = new JCheckBox("Show password");
	   c1.setFont(new Font("Times New Roman",Font.PLAIN,16));
	   c1.setForeground(Color.black);
	   c1.setBackground(new Color(240,240,240));
	   c1.setBounds(398,280,270,38);
	   c1.addActionListener(this); 
	  
	   P2.add(c1);






    //image for panel1
	   l5 = new JLabel(new ImageIcon(getClass().getResource("/Picture/LOGIN.jpg")));
	   l5.setBounds(0,0,350,500);
	   P1.add(l5);




       this.add(P1);
	   this.add(P2);
       setVisible(true);



    }


	public void actionPerformed(ActionEvent ae)
	{   
	
	/*String command = ae.getActionCommand();
	
         String s1 = t1.getText();
			String s2 = pa1.getText();
			
			User us = new User();*/

//register button
		if(ae.getSource()==b1)
		{
			Registration r = new Registration();
			this.setVisible(false);
		    r.setVisible(true);
		}


//checking if all info is provied or not
//login button
		else if(ae.getSource()==b2)
		{
		/*else if (b2.getText().equals(command))
			
		{
			
			/*String s1 = t1.getText();
			String s2 = pa1.getText();
			
			User us = new User(s1,s2);
			
			if(s1.isEmpty() || s2.isEmpty()){
				JOptionPane.showMessageDialog(this,"Invalid information");
			}
		else if (us.checkAccount(s1, s2)){
				
				JOptionPane.showMessageDialog(this,"Successfullooged in");
				
			       Namesmovie m = new Namesmovie();
								this.setVisible(false);
								m.setVisible(true);
			}
		
		else {
			JOptionPane.showMessageDialog(this,"Check username and password");
		}
		}*/
			if(t1.getText().length() <=0 || pa1.getText().length() <=0){
				JOptionPane.showMessageDialog(this,"Fill all information");

			}


		    else {

				try {
					String userNameS = "Name        :  "+t1.getText();
					String passwordS = "Password  :  "+pa1.getText();

					BufferedReader reader = new BufferedReader(new FileReader("data\\data.txt"));

					int totalLines = 0;
					while (reader.readLine() != null)
					totalLines++;
					reader.close();

					for (int i = 0; i <= totalLines; i++) {
						String line = Files.readAllLines(Paths.get("data\\data.txt")).get(i);

						if (line.equals(userNameS)) {
							String line2 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 1));

							if (line2.equals(passwordS)) {

								//JOptionPane.showMessageDialog(null, "Login Successful.");

								Namesmovie m = new Namesmovie();
								this.setVisible(false);
								m.setVisible(true);



							  String line3 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 2));
							  String line4 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 3));
							  String line5 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 4));

								BufferedWriter writer = new BufferedWriter(new FileWriter("data\\startpage data.txt"));
				            	writer.write("" + line);
				            	writer.write("\n" + line2);
				            	writer.write("\n" + line3);
				            	writer.write("\n" + line4);
				            	writer.write("\n" + line5);
					            writer.close();

								

								break;
							}
						}
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Wrong User Name or Password!");
				    }
		
		    }
     	}
		
       else if(ae.getSource()==backButton){
		   
		   frame1 f = new frame1();
		   this.setVisible(false);
		   f.setVisible(true);
	   }

	 // showing password
		else if(c1.isSelected()){
			pa1.setEchoChar((char)0);
		  }
		else{
			pa1.setEchoChar('*');

		}

	}
	public static void main(String [] args)
	{
		Login r = new Login();
		
	}
	  
}
//javac Login.java && java Login 