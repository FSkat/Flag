package fah;

public class Circle {
	private double radius;
	
	public void setdata(double r){
		radius = r;
	}
	
	public void display(){
		System.out.println("Radius:"+radius);
		
	}
	
	public double getarea(){
		return 3.14159*radius*radius;
	}
}
