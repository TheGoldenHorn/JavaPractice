class average{
	static void total(int...val){
		int sum=0, count=0;
		for(int x:val){
			sum=sum+x;
			count++;
		}
		int avg=sum/count;
		System.out.println("The average of "+count+" numbers is "+avg+"  ");
	}
	public static void main(String args[]){
		total(1,2,3,4);
		total(3,6,7,4,4);
		total(4,7,5);
		total(5,78,1,9,56,987);
		total(3,6);
	
	}
}