class Bitwise{
	public static void main(String args[]){
		int a=25, b=13, c=0;
		
		
		System.out.println("a & b = " +(a&b));

		
		System.out.println("a ^ b = " +(a^b));

		
		System.out.println("a | b = " +(a|b));


		System.out.println("a << 2 = " +(a<<2));

		c= a>>2;
		System.out.println("a >> 2 = " +c);

		c= ~a;
		System.out.println("~a = " +c);
	}
}