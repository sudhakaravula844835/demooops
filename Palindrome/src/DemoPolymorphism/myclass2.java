package DemoPolymorphism;
import java.util.*;
public class myclass2 {  
	String word;
	void accept(String word)
	{
		this.word=word;
	}
	boolean check()
	{
		StringBuffer sb=new StringBuffer();
		int len=word.length();
	 for ( int i = len - 1; i >= 0; i-- ) 
		 sb.append(word.charAt(i));
	 String s=new String(sb);
	 if (s.equals(word))
		 return true;
	 else 
		 return false;
	}
	public static void main(String [] args) {
		Palindrome pal=new Palindrome();
		System.out.println("Enter a word");
		Scanner scan =new Scanner (System.in);
		String word=scan.next();
		pal.accept(word);
		if (pal.check()==true)
			System.out.println("palindrome");
		else
			System.out.println("Not a Palindrome");
	}
	}
	



	   