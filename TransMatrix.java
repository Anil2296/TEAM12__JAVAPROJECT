import java.util.Scanner;
class TransMatrix
{
public static void main(String args[])
{
int row, col,i,j;
Scanner in = new Scanner(System.in);
 
System.out.println("Enter the number of rows");
row = in.nextInt();
 
System.out.println("Enter the number columns");
col = in.nextInt();
 
int mat1[][] = new int[row][col];
int mat2[][] = new int[row][col];

System.out.println("Enter the elements of matrix");
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
{
mat1[i][j] = in.nextInt();
}
 System.out.println();
}
if(row==col)
{
	System.out.println("the row and cols are equal so excuted");
	for ( i= 0 ; i < row ; i++ )
	{
	for ( j= 0 ; j < col ;j++ )
	{
	mat2[j][i]=mat1[i][j]; 
	}
	 System.out.println();
	}

} 
else
{
	System.out.println("the row and cols are  not equal so  this loop excuted");
	for ( i= 0 ; i < col ; i++ )
	{
	for ( j= 0 ; j < row ;j++ )
	{
	mat2[j][i]=mat1[i][j]; 
	}
 	System.out.println();
	}
	}
System.out.println("Transepose of matrice:");
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
{
System.out.print(mat2[i][j]+" ");
}
System.out.println();
}
}
}

