import java.io.*;
import java.util.*;
class userException extends Exception
{
public  userException(String s)
{
super(s);
}
}
class Exp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String uname,pass;
try
{
System.out.println("Enter username:");
uname=sc.nextLine();
if(uname.equals(""))
{
throw new userException("No username...");
}
if(uname.length()<8)
{
throw new  userException("Greater than 8 characters...");
}
}
catch( userException e)
{
System.out.println("Username Error");
System.out.println(e.getMessage());
}
try
{
System.out.println("Enter password");
pass=sc.nextLine();
if(pass=="")
{
throw new userException("Invalid password!!");
}
if(pass.length()>8)
{
throw new userException("password should not be greater than 8 characters!!");
}
}
catch( userException es)
{
System.out.println("Password Error");
System.out.println(es.getMessage());
} 
}
}

