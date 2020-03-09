package DemoAbstract;

abstract  class car {
	abstract void start(); 
	Sub classes
}
class Audi extends car{
	@override
	void start() {
		
	System.out.println("Sudi car");}}
class BMW extends car{
	@override
	void start() {
		System.out.println("BMW car");}}
class Drive{
	void drive (Car c) { c.start();}}
public class Ecmaple1{
	public static void main(String[] args) {
		Drive d=new Drive();
		d.drive(new Audi());
		d.drive((new BMW());}} 
	}
}