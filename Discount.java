import java.util.Scanner;
class Discount 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the price:");
		double original_price=sc.nextDouble();
		double discount=0;
		if (original_price>=5000)
		{
			discount=(original_price*70)/100;
			System.out.println("50% Discount:"+discount);
		}
		
		else if(original_price>=3000)
		{
			discount=(original_price*30)/100;
			System.out.println("30% Discount:"+discount);
		}
		else if(original_price>=2000)
		{
			discount=(original_price*10)/100;
			System.out.println("10% Discount:"+discount);
		}
		else 
		{
			System.out.println("No discount your Bill:"+original_price);
		}
		
		
		
		
	}
}
