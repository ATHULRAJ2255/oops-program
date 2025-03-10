 class program{
int pcode;
String pname;
double price;
void data(int a,String b,double c){
pcode=a;
pname=b;
price=c;
}
void display(){
System.out.println(pname+"\t"+pcode+"\t"+price+"\t");
}
static void lowestprice(double p1,double p2,double p3){
if(p1<=p2&&p1<=p3)
{
System.out.println("product one is lowest");
}
else if(p2<=p1&&p2<=p3){
System.out.println("product two is lowest");
}
else{
System.out.println("product three is lowest");
}
}
}
class program1{
public static void main(String args[]){
program obj1=new program();
program obj2=new program();
program obj3=new program();
obj1.data(101,"a",30.45);
obj2.data(102,"b",40.5);
obj3.data(103,"C",50.05); 
obj1.display();
obj2.display();
obj3.display();
program.lowestprice(obj1.price,obj2.price,obj3.price);
}
}

