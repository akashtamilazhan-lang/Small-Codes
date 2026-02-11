class MinDigit
{
	public static void main(String[] args) 
	{
		int n=7165434;
		int min=Integer.MAX_VALUE;
		
		while(n>0)
		{
			int lastdigit=n%10;
			min=Math.min(lastdigit,min);
			n=n/10;
		}
		System.out.println("Minimum:"+min);
	}
}
