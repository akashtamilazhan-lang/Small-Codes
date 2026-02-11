class OddEvenNum 
{
	public static void main(String[] args) 
	{
		int n=1233556;
		int sum=0;
		int count=0;
		while(n>0)
		{
			int lastdigit=n%10;
			
		    if(n%2==0)
			{
			  count++;
			  sum+=lastdigit;
			
			}
			n=n/10;
		}
		System.out.println("Sum is:"+sum);
		System.out.println("Count is:"+count);
	}
}
