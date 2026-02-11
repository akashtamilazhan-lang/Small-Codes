class LastDigits 
{
	public static void main(String[] args) 
	{
		int n=12345;
		System.out.println("The number is "+n);
		while(n>0)
		{
			int lastdigit=n%10;
			System.out.print(lastdigit);
			n/=10;
			
		}
	}
}
