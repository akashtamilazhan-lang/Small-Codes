import java.util.Scanner;
class Student
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Student Name:");
	    String name=sc.next();
		
		System.out.println("Student Age:");
	    byte age=sc.nextByte();
		
		System.out.println("Student Year:");
	    short year=sc.nextShort();
		
		System.out.println("Student Roll Number:");
	    int rollno=sc.nextInt();
		
		System.out.println("Student Phone Number:");
	    long phno=sc.nextLong();
		
		System.out.println("Student Percentage:");
	    float per=sc.nextFloat();
		
		System.out.println("Student Average Marks:");
	    double avg=sc.nextDouble();
		
		System.out.println("Student Grade:");
	    char grade=sc.next().charAt(0);
		
		System.out.println("Student is Result:");
	    boolean isPass=sc.nextBoolean();
		
		System.out.println("-----------------------");
		
		System.out.println("Student Name is "+name);
		System.out.println("Student Age is "+age);
		System.out.println("Student Year is "+year);
		System.out.println("Student Roll Number is "+rollno);
		System.out.println("Student Phone Number is "+phno);
		System.out.println("Student Percentage is "+per);
		System.out.println("Student Average Marks is "+avg);
		System.out.println("Student Grade is "+grade);
		System.out.println("Student is Pass "+isPass);
	}
}
