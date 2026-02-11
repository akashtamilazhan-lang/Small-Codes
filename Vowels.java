import java.util.Scanner;
class Vowels 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		if (ch== 'a'|| ch=='e'||ch=='i' ||ch=='o' ||ch=='u')
		{
			System.out.println("It is Vowels");
		}
		else if (ch== 'A'|| ch=='E'||ch=='I' ||ch=='O' ||ch=='U')
		{
			System.out.println("It is Vowels");
		}
		else
		{
			System.out.println("It is Consonant");
		}
	}
}
