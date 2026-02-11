import java.util.Scanner;
class Bank
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Account Holder Name:");
	    String name=sc.next();
		
		System.out.println("Account Number:");
	    long no=sc.nextLong();
		
		System.out.println("Age:");
	    byte age=sc.nextByte();
		
		System.out.println("Branch Code:");
	    short code=sc.nextShort();
		
		System.out.println("Current Balance:");
	    double bal=sc.nextDouble();
		
		System.out.println("Interest Rate:");
	    float interest=sc.nextFloat();
		
		System.out.println("Account Type:");
	    char type=sc.next().charAt(0);
		
		System.out.println("Is ATM Enabled:");
	    boolean isATMon=sc.nextBoolean();
		
		System.out.println("-----------------------");
		
		System.out.println("Account Holder Name:"+name);
		System.out.println("Account Number:"+no);
		System.out.println("Age:"+age);
		System.out.println("Branch Code:"+code);
		System.out.println("Current Balance:"+bal);
		System.out.println("Interest Rate:"+interest);
		System.out.println("Account Type:"+type);
		System.out.println("Is ATM Enabled:"+isATMon);
	}
}
