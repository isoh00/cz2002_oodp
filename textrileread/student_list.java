package textrileread;

public class student_list {
	private Student[] student_list;
	private int numofstudent;


student_list()
{
	student_list = new Student[100];
	numofstudent=100;
	for(int i =0; i<numofstudent; i++)
	{
		student_list[i] = new Student("abc","abc","abc","abc");
	}
}
}
