import java.io.*;
import java.util.*;
public class symmetric{
public static void main(String args[]){
int flag=0;
int r,c,i,j;
System.out.println("Enter the no of rows in first matrix");
Scanner obj=new Scanner(System.in);
r=obj.nextInt();
System.out.println("Enter the no of columns in first matrix");
c=obj.nextInt();
if(r==c)
{
int a[][]=new int[r][c];
System.out.println("Enter the elements in the  matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=obj.nextInt();
}
}
System.out.println("elements in the  matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print("\t"+a[i][j]);
}
System.out.print("\n");
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]!=a[j][i])
{
flag=1;
break;
}
}}
if(flag==1){
System.out.println("matrix is not symmetric");
}

else{
System.out.print("matrix is symmetric");
}
}
else
{
System.out.println("row and column are not equal");
}
}
}

