import java.util.*;
class ATM 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.Check Balance\n2.Deposit\n3.widthdrawl\n4.Change PIN");
		System.out.println("Select any option:");
		int option=sc.nextInt();
		
		int pin=1010;
		double balance=100;
		long phno=1234567890l;
		switch(option)
		{
			case 1:
				System.out.println("Welcome Akash");
				System.out.println("Your balance:"+balance+" RS ");
			    break;
			case 2:
				System.out.println("your deposit:");
			    double deposit=sc.nextDouble(); 
				System.out.println("Enter PIN Number");
				int userpin1=sc.nextInt();
				if(userpin1==pin)
			{
				balance=balance+deposit;
				System.out.println("Deposit Done successfully");
				System.out.println("Available Balance:"+balance);
			}
			else
			{
				System.out.println("Wrong PIN");
			}
				break;
		    case 3:
				System.out.println("Enter the Withdrawl Amount");
				double withdrawl=sc.nextDouble();
				System.out.println("Enter PIN Number");
				int userpin=sc.nextInt();
				if(pin==userpin)
			{
				if(withdrawl<=balance)
			{
					balance-=withdrawl;
					System.out.println("Withdrawn Successfully");
					System.out.println("Avialable Balance:"+balance);
			}
			else
				{
				System.out.println("Insufficient Balance");
			    }
			}
			else
			{
				System.out.println("Wrong Pin");
			}
			break;
			case 4:
				System.out.println("Change PIN");
			    System.out.println("Enter registered phone number:");
				long userphno=sc.nextLong();
				if(phno==userphno)
			{
				int otp=(int)(Math.random()*9000)+1000;
				System.out.println("OPT:"+otp);
				System.out.println("Enter OPT:");
				int userotp=sc.nextInt();
				if(otp==userotp)
				{
					 System.out.println("Enter OPT:");
					 System.out.println("Enter Your New PIN:");
				      int newpin=sc.nextInt();
				      pin=newpin;
				     System.out.println("your PIN changed");
				     System.out.println("pincode is :"+pin);
				}
				else
				{
					System.out.println("Wrong OTP");
				}
					
			}
			else
			{
				System.out.println("Incorrect registered phone number");
			}
			    break;
			default:
				System.out.println("Wrong Option");
		}
		
	}
}