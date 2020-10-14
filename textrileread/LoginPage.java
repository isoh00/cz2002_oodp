package textrileread;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class LoginPage {

public static String verifyLogin(String username, String password) 
	{
		String tempUsername;
		String tempPassword;
		Scanner x;
		try
		{
			x = new Scanner(new File("filename.txt"));
			x.useDelimiter("[,\n]");			
			while(x.hasNext())
			{
				tempUsername = x.next().trim();
				tempPassword = x.next().trim();
				if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
				{
					if(username.trim().contains("a"))
					return "a";
					else
						return "s";
				}
			}

		}
		catch(Exception e)
		{
			
		}

		return "z";

		
	}







}