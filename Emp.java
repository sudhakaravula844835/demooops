import java.util.Scanner;
public class Employee
{
int EmpId;  
String EmpName;
void accept()
{
Scanner s=new Scanner(System.in);
EmpId=s.nextInt();
EmpName=s.nextLine();
}
void display()
{
System.out.println("EmpId is "+EmpId);
System.out.println("EmpName is " +EmpName);
}
public static void main(String[] args)
{
Employee e=new Emplpoyee();
e.accept();
e.display();
}
}
