class circle{
	final static double pi=3.14;
	static double r=10;
	static void area(){
		double a=pi*r*r;
		System.out.println("Areas is "+a);

	}
	public static void main(String args[]){
		area();
		r=15;
		area();
	}
}