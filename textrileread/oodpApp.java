package textrileread;
import java.util.Scanner;

public class oodpApp {
	public static void main(String args[])
	{
		student_list student_list = new student_list();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String userName = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();	
	if((LoginPage.verifyLogin(userName,password)) == "s")
	{
		System.out.println("");
		System.out.println("Student login successful");
		System.out.println("Welcome student " + userName);
		System.out.println("(1) Add Course");
		System.out.println("(2) Drop Course");
		System.out.println("(3) Display registered Course");
		System.out.println("(4) Check vacancies available");
		System.out.println("(5) Change Index number of course");
		System.out.println("(6) Swap index Number with another student");
		System.out.println("(7) Exit");
		
		System.out.print("Enter the number of your choice: ");
		choice = sc.nextInt();
		
		while(choice != 7)
		{
			switch(choice)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:		
				break;
			}
			System.out.println();
			System.out.print("Enter the number of your choice: ");
			choice = sc.nextInt();
			
		}
		
	}
	else if((LoginPage.verifyLogin(userName,password)) == "a")
	{
		System.out.println("");
		System.out.println("Admin login successful");
		System.out.println("Welcome admin " + userName);
		System.out.println("(1) Edit student access period");
		System.out.println("(2) Add a student");
		System.out.println("(3) Add a new course");
		System.out.println("(4) Update a course");
		System.out.println("(5) Check avilable slot for a index");
		System.out.println("(6) Print student list by index number");
		System.out.println("(7) Print Student list by course");
		System.out.println("(8) Exit");
		
		System.out.print("Enter the number of your choice: ");
		choice = sc.nextInt();
		
		while(choice != 8)
		{
			switch(choice)
			{
			case 1:
				break;
			case 2:
				String buffer = sc.nextLine();
				System.out.println("Enter name");
				String newName = sc.nextLine();
				System.out.println("Enter Password");
				String newPassword = sc.nextLine();
				System.out.println("Enter Gender");
				String newGender = sc.nextLine();
				System.out.println("Enter matriculation number ");
				String newMnum = sc.nextLine();
				adding_students.add_students(newName, newPassword, newGender, newMnum);
				
		
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:		
				break;
			case 7:		
				break;
			}
			System.out.println();
			System.out.print("Enter the number of your choice: ");
			choice = sc.nextInt();
			
		}
	}
	else
	{
		return;
	}
	
}
}