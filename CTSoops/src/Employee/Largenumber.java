package Employee;
import java.util.Scanner;
public class Largenumber 
{
		public static void main (String[] args)
	{
	int large[ ]=new int[5];
	Scanner s=new Scanner(System.in);
	for (int i=0;i<large.length;i++)
	{
		large[i]=s.nextInt();
	}
	int Largenumber=large[5];
	for(int j=0;j<large.length ;j++)
	{
		if(Largenumber<large[j])
		{
			Largenumber =large[j];
		}
	}
System.out.println("large num is"+large);
	}
	}

