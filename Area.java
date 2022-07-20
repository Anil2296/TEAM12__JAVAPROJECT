import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the base of triangle: ");
                 double b=n.nextDouble();
		System.out.print("Enter the height of triangle: ");
		double h=n.nextDouble();
		 double area =(b*h)/2;
		System.out.println("Area of Triangle is: "+(float)area);
		
	}
}