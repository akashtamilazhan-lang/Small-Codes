import java.util.*;
class calculator 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.Addition\n2.Subtraction\nMultiplication\nDivision");
		System.out.println("Enter the Choice:");
		int c=sc.nextInt();
	
		switch(c)
		{
			case 1:System.out.println("Welcome to Addition");
			       System.out.println("Enter number 1:");
				   double num1=sc.nextDouble();
				   System.out.println("Enter number 2:");
				   double num2=sc.nextDouble();
				   System.out.println("Result:"+(num1+num2));
			       break;
			case 2:System.out.println("Welcome to Subtraction");
			       System.out.println("Enter number 1:");
				   double num3=sc.nextDouble();
				   System.out.println("Enter number 2:");
				   double num4=sc.nextDouble();
				   System.out.println("Result:"+(num3-num4));
			       break;
			case 3:System.out.println("Welcome to Multiplication");
			       System.out.println("Enter number 1:");
				   double num5=sc.nextDouble();
				   System.out.println("Enter number 2:");
				   double num6=sc.nextDouble();
				   System.out.println("Result:"+(num5*num6));
			       break;
			case 4:System.out.println("Welcome to Division");
			       System.out.println("Enter number 1:");
				   double num7=sc.nextDouble();
				   System.out.println("Enter number 2:");
				   double num8=sc.nextDouble();
				   System.out.println("Result:"+(num7/num8));
			       break;
			default:System.out.println("Invalid Choice");
		}
	}
}
