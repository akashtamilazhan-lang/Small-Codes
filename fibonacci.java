class fibonacci 
{
	public static void main(String[] args) 
	{
		int n=5;
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.print("Fibonacci Series of "+n+" is "+c);
	}
}
