import java.io.*;
import java.util.*;
class Person{
String name;
String gender;
String address;
int age;
Person(String name,String gender,String address,int age){
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class Employee extends Person{
int empid;
String companyname;
String qualification;
int salary;
Employee(String name,String gender,String address,int age,int empid,String companyname,String qualification,int salary){
super(name,gender,address,age);
this.empid=empid;
this.companyname=companyname;
this.qualification=qualification;
this.salary=salary;
}
}
class Teacher extends Employee{
String subject;
String department;
int teacherid;
Teacher(String name,String gender,String address,int age,int empid,String companyname,String qualification,int salary,String subject,String department,int teacherid){
super(name,gender,address,age,empid,companyname,qualification,salary);
this.subject=subject;
this.department=department;
this.teacherid=teacherid;
}
void display(){
System.out.println("Teacher Details");
System.out.println("Name:"+name);
System.out.println("Gender:"+gender);
System.out.println("Address:"+address);
System.out.println("Age:"+age);
System.out.println("Empid:"+empid);
System.out.println("Companyname:"+companyname);
System.out.println("Qalification:"+qualification);
System.out.println("Salary:"+salary);
System.out.println("Subject:"+subject);
System.out.println("Department:"+department);
System.out.println("Teacherid:"+teacherid);
}
}
class prgm7{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n:");
int n=sc.nextInt();
Teacher[] te=new Teacher[n];
for(int i=0;i<n;i++){
System.out.println("Enter" +(i+1)+"Teachers details:");
System.out.println("Name:");
String name=sc.next();
System.out.println("Gender:");
String gender=sc.next();
System.out.println("Address:");
String address=sc.next();
System.out.println("age:");
int age=sc.nextInt();
System.out.println("Empid:");
int empid=sc.nextInt();
System.out.println("Companyname:");
String companyname=sc.next();
System.out.println("Qualification:");
String qualification=sc.next();
System.out.println("Salary:");
int salary=sc.nextInt();
System.out.println("Subject:");
String subject=sc.next();
System.out.println("Department:");
String department=sc.next();
System.out.println("Teacherid:");
int teacherid=sc.nextInt();
te[i]=new Teacher(name,gender,address,age,empid,companyname,qualification,salary,subject,department,teacherid);
}
for(int i=0;i<n;i++){
te[i].display();
}
}
}
