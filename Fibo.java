class Fibo
{
	public static void main(String args[])
	{

		int d=0,b=1,c=0,i,x=55;
                 System.out.print(d+" "+b);
		while(c<=x)
		{
			c=d+b;
			System.out.print(" "+c);
			d=b;
			b=c;

		}
		
	}
}
