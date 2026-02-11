import java.util.*;
class IcicAtm
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int option;
		double balance=100000;
		double amount=0;
		int pin=1610;
		long phno=1234567890l;
		int userpin;
		long userphno;
		int otp;
		int userotp;
		int newpin;
		
		do{
			System.out.println("WELCOME TO ICICI BANK");
			System.out.println("1.Display Balance\n2.Deposit\n3.Withdrawl\n4.Change PIN\n5.Exit");
			System.out.println("Enter the Option");
			option=sc.nextInt();
			
			switch(option)
			{
			case 1:System.out.println("Your Balance");
			       System.out.println(balance);
			       break;
		     
			case 2:System.out.println("Deposit..");
			       System.out.println("Enter the deposit Amount");
				   amount=sc.nextDouble();
				   System.out.println("Enter your PIN");
				   userpin=sc.nextInt();
				   if(pin==userpin)
			           {
					     balance=amount+balance;
					     System.out.println("Deposit Successfull....");
			           }else
				          System.out.println("Wrong PIN");
				  break;
			
			case 3:System.out.println("Withdrawl");
			       System.out.println("Enter Your PIN");
				   userpin=sc.nextInt();
				   if(pin==userpin)
				{
					   System.out.println("Enter the Withdrawl Amount");
					   amount=sc.nextDouble();
					   balance=balance-amount;
					   System.out.println("Amount withdrawl");
				}else
					System.out.println("Wrong PIN");
				break;
				
			case 4:
				System.out.println("Change PIN");
			    System.out.println("Enter your Register Phone Number:");
				userphno=sc.nextLong();
				if(userphno==phno)
				{
					otp=(int)(Math.random()*9000)+1000;
					System.out.println(otp);
					System.out.println("Enter the OTP");
					userotp=sc.nextInt();
					if(otp==userotp)
					{
						System.out.println("Enter Old PIN");
						userpin=sc.nextInt();
						if(pin==userpin)
						{
							System.out.println("Enter New PIN");
							newpin=sc.nextInt();
							
							newpin=pin;
							System.out.println("PIN Changed Successfull....");
						}else
							System.out.println("Wrong PIN");
					}else
						System.out.println("Wrong OTP");
				}else
					System.out.println("Wrong Phone Number");
				
			break;
			
			case 5:
				System.out.println("Bye bye.......");
			break;
			
			default:System.out.println("Wrong Option");
			}
			
		}while(option!=5);
			
			
		
	}
}
