package constructor;

public class constructor 
{
	
		int age;
		String Name;	
		constructor()
		{
			this.age=55;
			this.Name="sudhakar";
		}
		 constructor(int a,String n) {
			
			this.age=a;
			this.Name=n;
		}
public static void main(String[] args)
{
constructor obj1 = new constructor();	
constructor obj2 = new constructor(23,"jhgvhjvbb");
System.out.println(obj1.Name+" " +obj1.age);
System.out.println(obj2.Name+" " +obj2.age);
}
}

