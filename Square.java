import java.util.Scanner;
class Square 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(true)
					System.out.print("* ");
				else
					System.out.print("  ");
				}
				System.out.println();
			}
		
	}
}
