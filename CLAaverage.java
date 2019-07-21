/* 
  This is a simple JAVA Program .
  Call this file "Example.java".
*/
class CLAaverage{
	//Your program begins with a call to main().
	public static void main(String args[]) {
		int sum=0,count=0;
		for(String i:args){
			 int x=Integer.parseInt(i);
			sum=sum+x;
			count++;
		}

	System.out.println("This is a simple Command Line Argument Java Program.");
	System.out.println("average of the entered number is " +sum/count);

	}
}