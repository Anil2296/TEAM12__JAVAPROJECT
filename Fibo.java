class Fibo
{
	public static void main(String args[])
	{
		int a=0,b=1,c=0,i,x=55;
                 System.out.print(a+" "+b);
		while(c<=x)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}
}