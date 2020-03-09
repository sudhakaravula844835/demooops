package DemoPolymorphism;

public class myclass1 {
	public void test()
	{
	System.out.println("areyy babjiiiiii");
	}

}
class  program2 extends myclass1{
	  public void test()
	  {
		  System.out.println("executing test method od subclass");
	  }
}
  class myclass
  {
	public static void main(String[]args) {
		program2 p2= new program2();
		p2.test();
	}
}