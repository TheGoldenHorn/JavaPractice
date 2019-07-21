/* 
  This is a simple JAVA Program .
  Call this file "Example.java".
*/
class CLAsum{
	//Your program begins with a call to main().
	public static void main(String args[]) {
		int sum=0;
		for(String i:args){
			 int x=Integer.parseInt(i);
			sum=sum+x;
		}

	System.out.println("This is a simple Command Line Argument Java Program.");
	System.out.println("sum of the entered number is " +sum);
	}
}