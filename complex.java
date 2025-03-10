class complex1{
int r;
int c;
complex1(int real,int com){
r=real;
c=com;
}
void display(){
System.out.println(r+"+"+c+"i");
}
static void add(int r1,int r2,int r3,int c1,int c2,int c3){
int re=r1+r2+r3;
int co=c1+c2+c3;
System.out.println("sum="+re+"+"+co+"i");
}
}

class complex{
public static void main(String args[]){
complex1 first=new complex1(5,9);
complex1 second=new complex1(4,7);
complex1 third=new complex1(6,7);
first.display();
second.display();
third.display();
complex1.add(first.r,second.r,third.r,first.c,second.c,third.c);
}
}

