
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;
import javax.swing.border.*;


public class UserData extends JFrame
{
   /* private JPanel panel,panel2;
    private JTextField t1,t2;;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;    
    private ImageIcon img;
    private JLabel l1,l2,l3,l4,l5,l6,l7;
    private Color c1,c2,c3;
    private JComboBox comb1;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private Font f1;
   // private String[] column = { "Movies Name", "Password", "Place", "Time" };
    //private String[] rows = new String[5];
	private String file = "C:\Users\ebadi\Downloads\Movies Ticket Booking System1 (3)\Movies Ticket Booking System1 (2)\Movies Ticket Booking System1\data"
   private String[] columns = { "Username", "Password", "Email", "Phone" }
    
    public UserData()
    {
        super ("User Data");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f1 = new Font("Times New Roman", Font.PLAIN, 12);
        c1 = new Color (242, 140, 252);
        c2 = new Color (207,207,207);
        c3 = new Color (255,211,94);
        
        
        
        panel = new JPanel ();
        panel.setLayout (null);
        panel.setBounds (0, 0, 800, 75);
        panel.setBackground (c3);
        
        panel2 = new JPanel ();
        panel2.setLayout (null);
        panel2.setBounds (0, 75, 800, 425);
        panel2.setBackground (Color.WHITE);
        
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setFont(f1);
        table.setRowHeight(30);
       table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(170);
        table.getColumnModel().getColumn(1).setPreferredWidth(170);
        table.getColumnModel().getColumn(2).setPreferredWidth(170);
        table.getColumnModel().getColumn(3).setPreferredWidth(170);
        Border btb = BorderFactory.createLineBorder(Color.BLACK, 1);
        table.setBorder(btb);
/
        
        
        scroll = new JScrollPane(table);
        scroll.setBounds(53, 96, 680, 300); 
        panel2.add(scroll);
        table.setBackground(c2);
		
      //  String file = "./Data.txt";
        

        // To input data in the table
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] fields = line.split("\t"); // Split the line using tab as the delimiter
                if (fields.length == 4) 
                {
                  // Add the fields to the table
                  model.addRow(fields);
                }
            }
             reader.close();
        }
        catch (IOException ex) 
        {
            ex.printStackTrace(); // Print the stack trace if an error occurs
        }
        
        
         // Add delete button
        b1 = new JButton("Delete");
        b1.setBounds(540, 20, 100, 30);
        b1.setBackground(Color.WHITE);
        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                // Get the selected row index
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) 
                { // If a row is selected
                    // Remove the selected row from the table
                    model.removeRow(selectedRow);
                
                    try 
                    {
                        Files.write(Paths.get(file), "".getBytes());
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                        for (int i = 0; i < model.getRowCount(); i++) {
                            for (int j = 0; j < model.getColumnCount(); j++) {
                                writer.write((String) model.getValueAt(i, j));
                                if (j < model.getColumnCount() - 1) {
                                    writer.write("\t");
                                }
                            }
                            writer.newLine();
                        }
                        writer.close();
                    } 
                        catch (IOException ex) 
                    {
                        ex.printStackTrace();
                    }
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please select a row to delete!");
                }
            }
        });
        panel.add(b1);
        
        // Add update button
        b4 = new JButton("Update");
        b4.setBounds(660, 20, 100, 30);
        b4.setBackground(Color.WHITE);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the selected row index
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) { // If a row is selected
                    // Display a dialog or form to edit the information for that row
                    String username = (String) model.getValueAt(selectedRow, 0);
                    String password = (String) model.getValueAt(selectedRow, 1);
                    String email = (String) model.getValueAt(selectedRow, 2);
                    String phone = (String) model.getValueAt(selectedRow, 3);

                    // Create a dialog or form to edit user information
                    // For example:
                    JTextField usernameField = new JTextField(username);
                    JTextField passwordField = new JTextField(password);
                    JTextField emailField = new JTextField(email);
                    JTextField phoneField = new JTextField(phone);

                    JPanel panel = new JPanel(new GridLayout(4, 2));
                    panel.add(new JLabel("Moviesname:"));
                    panel.add(usernameField);
                    panel.add(new JLabel("Password:"));
                    panel.add(passwordField);
                    panel.add(new JLabel("Place:"));
                    panel.add(emailField);
                    panel.add(new JLabel("Time:"));
                    panel.add(phoneField);

                    int result = JOptionPane.showConfirmDialog(null, panel, "Update Movies all info",
                            JOptionPane.OK_CANCEL_OPTION);
                    if (result == JOptionPane.OK_OPTION) {
                        // Update the information in the table
                        model.setValueAt(usernameField.getText(), selectedRow, 0);
                        model.setValueAt(passwordField.getText(), selectedRow, 1);
                        model.setValueAt(emailField.getText(), selectedRow, 2);
                        model.setValueAt(phoneField.getText(), selectedRow, 3);

                        // Save the updated information to file if necessary
                        // You may need to write code here to save the updated information to a file
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Select a row to update!");
                }
            }
        });
        panel.add(b4);
        
        b2 = new JButton ("Add Movies");
        b2.setBackground (Color.WHITE);
        b2.setBounds(420, 20, 100, 30);
        b2.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                addUser au = new addUser ();
                au.setVisible (true);
                setVisible (false);
            }
            
        });
        panel.add(b2);
        
       
       
        
        this.add(panel);
        this.add(panel2);
        this.setVisible(true);
        this.setSize (800,500);
        this.setLocationRelativeTo(null);
    }*/
	
	  private JPanel panel, panel2;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private JButton bAdd, bDelete, bUpdate, bLogout;
    private Font f1;
    private String file = "./Data.txt"; // user data file path

    // Columns for registered user info
    private String[] columns = { "Username", "Password", "Email", "Phone" };

    public UserData() {
        super("User Data");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        f1 = new Font("Times New Roman", Font.PLAIN, 12);
        Color headerColor = new Color(255, 211, 94);
        Color tableColor = new Color(230, 230, 230);

        // Header panel
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 800, 75);
        panel.setBackground(headerColor);

        // Table panel
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 75, 800, 425);
        panel2.setBackground(Color.WHITE);

        // Table setup
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setFont(f1);
        table.setRowHeight(30);

        // Set column widths
        for (int i = 0; i < columns.length; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(170);
        }

        scroll = new JScrollPane(table);
        scroll.setBounds(50, 90, 680, 300);
        panel2.add(scroll);
        table.setBackground(tableColor);

        // Load data from file
        loadUserData();

        // Delete button
        bDelete = new JButton("Delete");
        bDelete.setBounds(540, 20, 100, 30);
        bDelete.setBackground(Color.WHITE);
        bDelete.addActionListener(e -> deleteUser());
        panel.add(bDelete);

        // Update button
        bUpdate = new JButton("Update");
        bUpdate.setBounds(660, 20, 100, 30);
        bUpdate.setBackground(Color.WHITE);
        bUpdate.addActionListener(e -> updateUser());
        panel.add(bUpdate);

        // Add button
        bAdd = new JButton("Add User");
        bAdd.setBounds(420, 20, 100, 30);
        bAdd.setBackground(Color.WHITE);
        bAdd.addActionListener(e -> {
            addUser au = new addUser();
            au.setVisible(true);
            setVisible(false);
        });
        panel.add(bAdd);

        this.add(panel);
        this.add(panel2);
        this.setVisible(true);
    }

    // Method to load users from file
    private void loadUserData() {
        try {
            File f = new File(file);
            if (!f.exists()) {
                f.getParentFile().mkdirs(); // Create folder if missing
                f.createNewFile();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\t");
                if (fields.length == 4) {
                    model.addRow(fields);
                }
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Method to delete selected user
    private void deleteUser() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
            saveUserData();
            JOptionPane.showMessageDialog(null, "User deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Select a user to delete!");
        }
    }

    // Method to update selected user
    private void updateUser() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            JTextField usernameField = new JTextField((String) model.getValueAt(selectedRow, 0));
            JTextField passwordField = new JTextField((String) model.getValueAt(selectedRow, 1));
            JTextField emailField = new JTextField((String) model.getValueAt(selectedRow, 2));
            JTextField phoneField = new JTextField((String) model.getValueAt(selectedRow, 3));

            JPanel panel = new JPanel(new GridLayout(4, 2));
            panel.add(new JLabel("Username:"));
            panel.add(usernameField);
            panel.add(new JLabel("Password:"));
            panel.add(passwordField);
            panel.add(new JLabel("Email:"));
            panel.add(emailField);
            panel.add(new JLabel("Phone:"));
            panel.add(phoneField);

            int result = JOptionPane.showConfirmDialog(null, panel, "Update User Info", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                model.setValueAt(usernameField.getText(), selectedRow, 0);
                model.setValueAt(passwordField.getText(), selectedRow, 1);
                model.setValueAt(emailField.getText(), selectedRow, 2);
                model.setValueAt(phoneField.getText(), selectedRow, 3);
                saveUserData();
                JOptionPane.showMessageDialog(null, "User updated successfully!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a user to update!");
        }
    }

    // Method to save users back to file
    private void saveUserData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.write((String) model.getValueAt(i, j));
                    if (j < model.getColumnCount() - 1) writer.write("\t");
                }
                writer.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
	public static void main(String[] args){
		UserData u = new UserData();
	}
}
