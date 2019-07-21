//'*' inverted pyramid
/* ****
   ***
   **
   *    */
public class invertedPyramid{                           //defining class named "pyramid"
	public static void main(String[] args) {           //defining and calling main function
	for (int i=1;i<=4;i++) {                          //number of lines in pyramid; here 4
			for (int j=5;j>= i+1 ;j--) {              // number of stars per line
				System.out.print("* ");
			}
			System.out.println();                 //goto next line
		}	
	}
}