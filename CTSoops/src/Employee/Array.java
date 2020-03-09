package Employee;
import java.util.Scanner;
public class Array {
	public static void main (String[] args)
{
int a[ ]=new int[10];
Scanner s=new Scanner(System.in);
for (int i=0;i<a.length;i++)
{
	a[i]=s.nextInt();
	System.out.println(a[i]);
}

}
}

