class MaxDigit
{
	public static void main(String[] args) 
	{
		int n=7165434;
		int max=Integer.MIN_VALUE;
		
		while(n>0)
		{
			int lastdigit=n%10;
			max=Math.max(lastdigit,max);
			n=n/10;
		}
		System.out.println("Maximum:"+max);
	}
}
