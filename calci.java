import java.util.*;

class calci 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void add()
	{
		System.out.println("Addition");
		System.out.println("--------");
		System.out.println("Enter Number 1==>");
		int a=sc.nextInt();
		System.out.println("Enter Number 2==>");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Addition==>"+sum);
	}
	
	public static void sub()
	{
		System.out.println("Subtraction");
		System.out.println("--------");
		System.out.println("Enter Number 1==>");
		int a=sc.nextInt();
		System.out.println("Enter Number 2==>");
		int b=sc.nextInt();
		int sub=a-b;
		System.out.println("Subtraction==>"+sub);
	}
	
	public static void mul()
	{
		System.out.println("Multiple");
		System.out.println("--------");
		System.out.println("Enter Number 1==>");
		int a=sc.nextInt();
		System.out.println("Enter Number 2==>");
		int b=sc.nextInt();
		int mul=a*b;
		System.out.println("Multiple==>"+mul);
	}
	
	public static void div()
	{
		System.out.println("Division");
		System.out.println("--------");
		System.out.println("Enter Number 1==>");
		int a=sc.nextInt();
		System.out.println("Enter Number 2==>");
		int b=sc.nextInt();
		int div=a/b;
		System.out.println("Division==>"+div);
	}
	
	public static void mod()
	{
		System.out.println("Modules");
		System.out.println("--------");
		System.out.println("Enter Number 1==>");
		int a=sc.nextInt();
		System.out.println("Enter Number 2==>");
		int b=sc.nextInt();
		int mod=a%b;
		System.out.println("Modules==>"+mod);
	}
	
	public static void squ()
	{
		System.out.println("Square");
		System.out.println("--------");
		System.out.println("Enter Number ==>");
		int a=sc.nextInt();
	    int squ=a*a;
		System.out.println("Square==>"+squ);
	}
	
	public static void cub()
	{
		System.out.println("Cube");
		System.out.println("--------");
		System.out.println("Enter Number ==>");
		int a=sc.nextInt();
		int cub=a*a*a;
		System.out.println("Cube==>"+cub);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int op;
		do{
			System.out.println("1)Addition\n2)Subtraction\n3)Multiple\n4)Division\n5)Modules\n6)Square\n7)Cube\n0)Exit");
			System.out.println("---------------");
			System.out.println("Enter Option==>");
			System.out.println("---------------");
			op=sc.nextInt();
			
			System.out.println();
			
			switch(op)
			{
				case 1:add();
				break;
				case 2:sub();
				break;
				case 3:mul();
				break;
				case 4:div();
				break;
				case 5:mod();
				break;
				case 6:squ();
				break;
				case 7:cub();
				break;
				case 0:System.out.println("Bye Bye da Buffaloo");
				break;
				
				default:System.out.println("Wrong option");
			}
		}while(op!=0);
				
		
	}
}
