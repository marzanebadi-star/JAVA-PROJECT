
import java.lang.*;
import java.util.*;
import java.io.*;

public class User
{
	private String Username;
	FileWriter fwrite;
	private String UserPass, Email, Phone;
	File file;
	Scanner sc;
	
	public User()
	{
		this.Username = " ";
	}
	
	public User (String Username, String UserPass, String Email, String Phone)
	{
		this.Username = Username;
		this.UserPass = UserPass;
		this.Email = Email;
		this.Phone = Phone;
	}
	public User (String Username, String UserPass)
	{
		this.Username = Username;
		this.UserPass = UserPass;
		
	}
	public void setUsername (String Username) {this.Username = Username;}
	public void setUserpass (String UserPass) {this.UserPass = UserPass;}
	public String getUsername  () {return Username;}
	public String getUserpass () {return UserPass;}
	public String getEmail () {return Email;}
	public String getPhone() {return Phone;}
	public void addAccount()
	{
		try 
		{
			file = new File("./Data.txt");
			file.createNewFile();
			
			fwrite = new FileWriter (file, true);
			fwrite.write (getUsername() + "\t");
			fwrite.write (getUserpass() + "\t");
			fwrite.write (getEmail() + "\t");
			fwrite.write (getPhone() + "\n");
			fwrite.flush();
			fwrite.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	
	
}