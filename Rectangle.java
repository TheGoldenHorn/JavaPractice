class Rectangle{
int l;
int w;
int area()
{ int arect=l*w;
return arect;
}

public static void main(String args[]){

Rectangle rect1,rect2;
rect1=new Rectangle();
rect2=new Rectangle();
rect1.l=10;
rect1.w=20;
rect2.l=30;
rect2.w=40;
int rect1area=rect1.area();
int rect2area=rect2.area();
System.out.println("Area is "+rect1area);
System.out.println("Area is "+rect2area);
}
}
