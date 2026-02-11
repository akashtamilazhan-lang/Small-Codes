import java.util.Scanner;
class Count
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		long num=sc.nextLong();
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count is::"+count);
		
	}
}
