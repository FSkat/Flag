package fah;

public class Rectangle {
	
	private int height;
	private int width;
	private Circle circle;
	
	public void setdata(Circle c, int h, int w)
	{
		height=h;
		width=w;
		circle=c;
		
	}
	
	public void display(){
		circle.display();
		System.out.println("Rectangle height="+height+",width="+width);
	}
	
	public int getarea(){
		return height*width;
	}
	
	public static void main(String[] args){
		
		Circle c=new Circle();
		c.setdata(8.5);
		Rectangle r=new Rectangle();
		r.setdata(c,  10,  15);
		
		r.display();
	}
}
