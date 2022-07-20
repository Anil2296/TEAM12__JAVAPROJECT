class Fibo
{
	public static void main(String args[])
	{
		int a=0,e=1,c=0,i,x=55;
                 System.out.print(a+" "+e);
		while(c<=x)
		{
			c=a+e;
			System.out.print(" "+c);
			a=e;
			e=c;
		}
		
	}
}
