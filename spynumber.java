import java.util.Scanner;
class spynumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int sum=0;
		int mul=1;
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		while(n>0)
		{
			int ld=n%10;
			sum=sum+ld;
			mul=mul*ld;
			n=n/10;
		}
		System.out.println("SUM===>"+sum);
	    System.out.println("MULTIPLICTION====>"+mul);
	
	    if(sum==mul)
			System.out.println("IT IS SPY NUMBER");
		else
			System.out.println("IT IS NOT A SPY NUMBER");
	}
}
