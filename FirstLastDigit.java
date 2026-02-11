class FirstLastDigit
{
	public static void main(String[] args) 
	{
		int n=81272;
		int lastdigit=n%10;
		n=n/10;
		int sum=0;

		while(n>9)
		{
			
			int ld=n%10;
			sum=sum+ld;
			n=n/10;
			
		}
		
			System.out.println("Sum====>"+sum);
		}
}