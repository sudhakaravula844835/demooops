import java.util.Scanner;
public class Even
{

public static void main(String[] args)
{
int num1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number:");
num1=sc.nextInt();
if((num1)%2==0)
{
System.out.println("number is even:");
}
else
{
System.out.println("number is odd:");
}
}
}