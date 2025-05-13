import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class fileoddoreven
 {
 public static void main(String[] args) throws IOException
 {
FileInputStream source=new FileInputStream("number.txt");
FileOutputStream dodd=new FileOutputStream("odd.txt");
FileOutputStream deven=new FileOutputStream("even.txt");
int i;
while((i=source.read())!=-1)
{
if(i%2==0)
{ deven.write(i);
}
else
{
dodd.write(i);
}
}
System.out.println("copied");
source.close();
deven.close();
dodd.close();
}
}
