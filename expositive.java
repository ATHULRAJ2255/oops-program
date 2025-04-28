
import java.io.*;
import java.util.*;
class NegativenumberException extends Exception
{
public  NegativenumberException(String a)
{
super(a);
}
}
class expositive
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("Enter numbers to be calculated:");
n=sc.nextInt();
int[]numbers=new int[n];
try
{
System.out.println("Enter"+"\t"+n+"\t"+"numbers:");
for(i=0;i<n;i++)
{
int number=sc.nextInt();
numbers[i]=number;
if( number<=0)
{
throw new NegativenumberException("negative number...");
}
}
int sum=0;
for(i=0;i<n;i++)
{
sum+=numbers[i];
}
float average=(float)sum/n;
System.out.println("Average of the number is"+average);
}
catch( NegativenumberException p)
{
System.out.println("Please enter positive number");
System.out.println(p.getMessage());
}
}
}
