package Demoinhertence;

public class App {
	public static void main(String[] args)
	{
		machine mach1= new machine();
		mach1.start();
		mach1.stop();
		
		car car1=new car();
		 
		car1.start();
		car1.wipewindshield();
		car1.showInfo();
		car1.stop();
	}

	

}
