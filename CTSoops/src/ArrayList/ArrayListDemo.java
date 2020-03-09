package ArrayList;
import java.util.ArrayList;

import Collections.Collections;

import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args)
	{
		List<Integer> arraylistA= new ArrayList<Integer>();
		ArrayList<String> arraylistB = new ArrayList<String>();				
				for (int i=0;i<5;i++)
				{
					arraylistA.add(i);			
				}
		System.out.println(arraylistA);
		arraylistB.add("beggginer");
		arraylistB.add("java");
		arraylistB.add("tutorial");
		arraylistB.add(".");
		arraylistB.add(3,"com");
		arraylistB.add("java");
		arraylistB.add("site");
		System.out.println("Second Element is"+arraylistB.get(2));
		arraylistB.remove("java");
		System.out.println("ArrayListB.add"+arraylistB);
		Iterator<Integer> i1= arraylistA.iterator();
		System.out.println("ArrayList arraylistA-->");
		while (i1.hasNext())
		{
			System.out.println(i1.next()+ "  ");		
		}
		
		System.out.println("ArrayList attaylistA -->");
		for(int j=0; j<arraylistA.size();j++)
		{
			System.out.println(arraylistA.get(j)+"  ");
			System.out.println();
			System.out.println("Sorted ArrayList srrraylistA-->");
			Collections.sort(arraylistA);
			System.out.println(arraylistA);
			System.out.println();
			ListIterator<String>i2= arraylistB.listIterator();
			System.out.println("ArrayList arraylistB -->");
			while(i2.hasNext())
			{
			System.out.println(i2.next() +"  ");
			}
			System.out.println();
			System.out.println("Reversed List");
			while(i2.hasPrevious())
			System.out.println(i2.previous()+" ");
			int index = arraylistB.indexOf("java");
			System.out.println("'java' was found"+ "at :"+index);
			int lastIndex = arraylistB.lastIndexOf("Java");
			System.out.println("'Java' was found"+"at:"+lastIndex +"from the last");
			System.out.println();
			System.out.println();
			Integer a[]={11,12,13,14,15};
			List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(a));
			System.out.println("arrList"+arrlist.get(0));

			}
			}
	}
