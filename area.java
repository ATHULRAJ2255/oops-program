import java.io.*;
import java.util.*;
class shapes{
public void areas(float r)
{
double area=Math.PI*r*r;
System.out.println("area of the circle is "+area);
}
public void areas(int a)
{
float area=a*a;
System.out.println("area of the square is "+area);
}
public void areas(int l,int b )
{
float area=l*b;
System.out.println("area of the rectangle is "+area);
}
}
class area{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
shapes sp=new shapes();
System.out.println("Enter the choice:  1.circle, 2.square, 3.rectangle" );
int n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("Enter the radius:");
float r=sc.nextFloat();
sp.areas(r);
break;
case 2:
System.out.println("Enter the side:");
int a=sc.nextInt();
sp.areas(a);
break;
case 3:
System.out.println("Enter the length:");
int l=sc.nextInt();
System.out.println("Enter the breadth:");
int b=sc.nextInt();
sp.areas(l,b);
break;
default:System.out.println("Invalid choice");
}
}
}






