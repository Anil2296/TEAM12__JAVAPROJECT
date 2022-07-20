import java.util.Scanner;
 class Matrixadd
{
public static void main(String args[])
{
    int row,col;
    Scanner in = new Scanner(System.in);
    System.out.println("enter the row");
    row=in.nextInt();

    System.out.println("enter the col");
    col=in.nextInt();

int arr1[][]= new int[row][col];
int arr2[][]= new int[row][col];
int arr3[][]= new int[row][col];

System.out.println("enter the matrix 1");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
arr1[i][j]=in.nextInt();
}
System.out.println();
}
System.out.println("enter the matrix 2");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
arr2[i][j]=in.nextInt();
}
System.out.println();
}
System.out.println("the subtraction of two matrices is ");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
arr3[i][j]=arr1[i][j] - arr2[i][j];
}
}
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.println(arr3[i][j]+" ");
}
System.out.println();
}
}
}


