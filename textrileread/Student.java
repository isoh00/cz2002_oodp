package textrileread;

public class Student {
	private String name;
	private String password;
	private String gender;
	private String mnum; // mnum = matriculation number
	
Student(String name, String password, String gender, String mnum) { // Constructor
		
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.mnum = mnum;
	}
Student() { // Constructor
		
		this.name = "abc";
		this.password = "password";
		this.gender = "m";
		this.mnum = "test";
	}	
}
