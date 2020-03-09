package Pack1;
import Pack2.ParentClass;
import Pack3.ChildClass;

public class MainClass {
	public static void main(String[] args)
	{
		Pack2.ParentClass p=new ParentClass();
		p.math1();
		Pack3.ChildClass c=new ChildClass();
		c.math1();
				
	}
	
	

}
