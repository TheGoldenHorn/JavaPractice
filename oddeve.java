import java.util.Scanner;
public class oddeve{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n%2==0)
System.out.println("Number is Even");
else
System.out.println("Number is Odd");
}
}