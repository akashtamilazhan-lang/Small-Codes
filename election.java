import java.util.Scanner;
class election
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Namae:");
		String name=sc.nextLine();
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		System.out.println("Voter Id Available:");
		char id=sc.next().charAt(0);
		
		if (age>=18 && id=='Y'|| id=='y')
		{
			System.out.println("You are Eligible");
		}
		else if(age>=18 && id=='N'|| id=='n')
		{
			System.out.println("Please apply for vote id to vote");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		
	}
}
