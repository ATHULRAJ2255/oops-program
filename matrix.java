import java.io.*;
import java.util.*;
public class matrix{
public static void main(String args[]){
int r1,r2,c1,c2,i,j;
System.out.println("Enter the no of rows in first matrix");
Scanner obj=new Scanner(System.in);
r1=obj.nextInt();
System.out.println("Enter the no of columns in first matrix");
c1=obj.nextInt();
System.out.println("Enter the no of rows in second matrix");
r2=obj.nextInt();
System.out.println("Enter the no of coulmns in second matrix");
c2=obj.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c1];
System.out.println("Enter the elements in the first matrix");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
a[i][j]=obj.nextInt();
}
}
System.out.println("Enter the elements in the second matrix");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j]=obj.nextInt();
}
}
if((r1==r2)&&(c1==c2))
{
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("Sum of the matrix");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
System.out.print("\t"+c[i][j]);
}
System.out.print("\n");
}
}
else {
System.out.println("Addition is not possible");
}
}
}



