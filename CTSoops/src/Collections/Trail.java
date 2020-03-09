package Collections;
import java.util.*;
public class Trail {
	ArrayList<String> word= new ArrayList();
	String[] s=new String[3];
	void convert()
	{
		word.add("zzz");
		word.add("xxxx");
		word.add("vvv");
		s=word.toArray(s);
		
	}
	void sort()
	{
		Arrays.sort(s);
		for(Object st:s)
			System.out.println(st);
		
	}
public static void main(String [] args)
{
	Trail obj=new Trail();
	obj.convert();
	obj.sort();
}
}
