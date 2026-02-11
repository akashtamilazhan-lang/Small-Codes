import java.util.Scanner;
class posnegzero
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		
		String ans=num==0 ? "Zero" : num>=0 ? num%2==0 ? "Positive even" : "Positive odd" : num%2==0 ? "Negitive even" : "Negative odd" ;
		System.out.println(ans);
	}
}
