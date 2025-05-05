import java.util.*;
class mtable5 extends Thread
{
int n;
mtable5(int n)
{
this.n=n;
}
public void run()
{
for(int i=0;i<=n;i++)
{
System.out.println("5 x "+i+"="+(5*i));
}
}
}
class prime extends Thread
{
int n;

prime(int n)
{
this.n=n;
}
public void run()

{
int count=0,x=0,i=1;
System.out.println("Prime Numbers are :");
while(x!=n)
{
count=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
count++;
break;
}
}
if(count==0 && i!=1)
{
System.out.println(i+" ");
x++;
}
i++;
}
}
}
class thrd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int muln,primen;
System.out.println("Enter number n of multiplication:");
muln=sc.nextInt();
System.out.println("Enter number n of prime:");
primen=sc.nextInt();
mtable5 t1=new mtable5(muln);
prime t2=new prime(primen);
t1.start();
t2.start();
}
}


