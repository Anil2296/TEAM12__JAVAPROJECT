import java.util.Scanner;
class Even
{
	public static void main(String args[])
	{
		Scanner h=new Scanner(System.in);
		System.out.print("Enter a number: ");
		long x=h.nextLong();
		if(x%2==0)
		{
			System.out.println(x+" is even");
		}
		else
		{
			System.out.println(x+" is odd");
		}
	}
}