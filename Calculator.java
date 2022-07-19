import java.util.Scanner;
class Calculator {
   
     void add(int x,int y)
      {
        int z;
       z= x+y;
      System.out.println("addition of two numbers is =" +z );
      }
     
      void sub(int x,int y)
     {
       int z;
       z= x-y;
      System.out.println("subtraction of two numbers is =" +z );
      }

      void mul(int x,int y)
       {
       int z;
       z= x*y;
      System.out.println("multiplication of two numbers is =" +z );
      }
      
      void div(int x,int y)
     {
      float z;
       z= x/y;
      System.out.println("division of two numbers is =" +z );
      }

public static void main(String[] args) {

 int x,y;
       Scanner sc= new Scanner(System.in);
       System.out.println("enter values of x=");
       x= sc.nextInt();
       System.out.println("enter value of y= ");
       y= sc.nextInt();
  Calculator c= new Calculator();
  c.add(x,y);
  c.sub(x,y);
  c.mul(x,y);
  c.div(x,y);
  }

}    