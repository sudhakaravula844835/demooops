package Employee;
import java.util.Scanner;
public class Employye
{
int EmpId;  
String EmpName;
void accept(int EmpId1, String EmpName1)
{
	EmpId=EmpId1;
	EmpName=EmpName1;
	
}
void display()
{
System.out.println("EmpName is  "+EmpName+"  EmpId is "+EmpId);
}
public static void main(String[] args)
{
Employye e=new Employye();
e.accept(844835,"sudhakar");
e.display();
}
}

