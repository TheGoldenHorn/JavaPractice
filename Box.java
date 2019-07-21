class Box{
	int w,h,l;
	void addTen (Box b){
	this.w=b.w+10;
	this.h=b.h+10;
	this.l=b.l+10;
	}
}
class Test{
	public static void main(String args[]){
	Box obj=new Box();
	obj.h =obj.w=obj.l=10;
	Box obj1=new Box();
	obj1.h=obj1.w=obj1.l=20;
	obj.addTen(obj1);
	System.out.println(obj.h);
	}
}