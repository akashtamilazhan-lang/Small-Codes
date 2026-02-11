class AddDigits 
{
	public static void main(String[] args) 
	{
		int n=1233556;
		int sum=0;
		while(n>0)
		{
			int lastdigit=n%10;
			sum+=lastdigit;
			n/=10;
		}
		System.out.println("Sum=="+sum);
	}
}
