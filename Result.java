import java.util.Scanner; //Import Java scanner utility
class Math
{
	void sum(int x,int y)
	{
	int s=x+y;
	System.out.println("Sum of two numbers x and y is "+s);
	}
	void sum(int x,int y,int z)
	{
	int s=x+y+z;
	System.out.println("Sum of the three numbers x,y,z is "+s);
	}
}

class Result
{
	public static void main(String args[])
	{
	System.out.print("Input the value of x: ");    
    Scanner x2 = new Scanner(System.in); //Take INPUT from the user
    
    System.out.print("Input the value of y: ");
    Scanner y2 = new Scanner(System.in); //Take INPUT from the user
   
    System.out.print("Input the value of z: ");
    Scanner z2 = new Scanner(System.in); //Take INPUT from the user
    
    int xx = x2.nextInt();
    int yy = y2.nextInt();
    int zz = z2.nextInt();
    
    System.out.println("X is "+xx);
    System.out.println("Y is "+yy);
    System.out.println("Z is "+zz);
	
	Math addition = new Math();
	
	addition.sum(xx,yy,zz);
	addition.sum(xx,yy);

	}
}