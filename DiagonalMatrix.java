import java.util.Scanner;
class DiagonalMatrix
{
public static void main(String args[])
{
int row, col,i,j, sum=0;
Scanner in = new Scanner(System.in);
 
System.out.println("Enter the number of rows");
row = in.nextInt();
 
System.out.println("Enter the number columns");
col = in.nextInt();
 
int mat1[][] = new int[row][col];
System.out.println("Enter the elements of matrix");
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
{
mat1[i][j] = in.nextInt();
}
 System.out.println();
}
for ( i= 0 ; i < row ; i++ )
{
for ( j= 0 ; j < col ;j++ )
{
if(i==j)
sum+=mat1[i][j];
}
}
System.out.print("the sum of diagnol elements of matrix is : "+sum);
}
}

