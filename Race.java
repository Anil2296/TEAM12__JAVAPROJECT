import java.util.Scanner;
class Race
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		double a=x.nextDouble();
		double b=x.nextDouble();
		double c=x.nextDouble();
		double d=x.nextDouble();
		 double e=x.nextDouble();
		double avg=(a+b+c+d+e)/5;
		System.out.println("Enter the value of racer1: "+a);
		System.out.println("Enter the value of racer2: "+b);
		System.out.println("Enter the value of racer3: "+c);
		System.out.println("Enter the value of racer4: "+d);
		System.out.println("Enter the value of racer5: "+e);
		if(a>=avg){
			double f=a;
	   System.out.println(f);
}
  if(b>=avg){		
	double	g=b;
		System.out.println(g);
 }
 if(c>=avg){
    double h=c;
	  System.out.println(h);
 }
 if(d>=avg){
  double j=d;
	   System.out.println(j);
 }
 if(e>=avg){
	 double k=e;
		 System.out.println(k);
	 }
		System.out.println("The speed of the racers >= average speed"+avg  +":" +f +g +h +j +k);
		
	}
}