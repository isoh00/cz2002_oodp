package textrileread;
import java.io.File;  
import java.io.IOException; 
import java.io.FileWriter;   
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class adding_students {

	  
public static void add_students(String name, String password, String gender, String Mnum )
{
	try {
        FileWriter myWriter = new FileWriter("student_list.txt", true);
        myWriter.write(name+","+password+","+gender+","+Mnum+"\n");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        FileWriter myWriter2 = new FileWriter("filename.txt",true);
        myWriter2.write(Mnum+","+password+"\n");
        myWriter2.close();
      } 
	catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
}
}
