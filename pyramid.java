//'*' upright pyramid
/* *
   **
   ***
   ****
   *****    */
public class pyramid{                           //defining class named "pyramid"
	public static void main(String[] args) {   //defining main function
	for (int i=0;i<=4;i++) {                  //number of lines in pyramid; here 5
			for (int j=0;j<=i ;j++) {        // number of stars per line
				System.out.print("*");
				//System.out.print("hello");
			}
			System.out.println();         //goto next line
		}	
	}
}