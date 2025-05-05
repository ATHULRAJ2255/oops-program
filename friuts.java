import java.util.*;
class friuts
{
public static void main(String args[])
{
ArrayList<String>fruits=new
ArrayList<String>();
fruits.add("Orange");
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");
fruits.add("Strawberry");
fruits.add("Pomegranate");
fruits.add(3,"Avocado");
System.out.println("ORIGINAL LIST");
System.out.println("--------------");
for(String str:fruits)
{
System.out.println(str+" ");
}
fruits.remove("Avocado");
fruits.remove(2);
System.out.println("REMOVED LIST");
System.out.println("--------------");
for(String str:fruits)
{
System.out.println(str+" ");
}
fruits.set(3,"Guava");
System.out.println("UPDATED LIST");
System.out.println("--------------");
for(String str:fruits)
{
System.out.println(str+" ");
}
Collections.sort(fruits);
System.out.println("SORTED LIST");
System.out.println("--------------");
for(String str:fruits)
{
System.out.println(str+" ");
}
System.out.println("CHECKING LIST");
System.out.println("--------------");
System.out.println("Apple is in list:"+fruits.contains("Apple"));
System.out.println("Lemon is in list:"+fruits.contains("Lemon"));
System.out.println("Size of Array is:"+fruits.size());
System.out.println("Object at second position is:"+fruits.get(2));
fruits.clear();
System.out.println("Final list is"+fruits);
}
}
