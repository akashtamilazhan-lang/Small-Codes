import java.util.*;
class reverserom 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		
		
		while(n>0)
		{
			int ld=n%10;
			rev=rev*10+ld;
			n=n/10;	
		}
		System.out.println(rev);
		if(temp==rev)
			System.out.println("Reverse Number");
		else
			System.out.println("Not Reverse Number");
	}
}
