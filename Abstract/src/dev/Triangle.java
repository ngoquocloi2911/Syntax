package dev;

// tương tự các hình còn lại
public class Triangle extends Shape {
	
	private double a;
	private double b;
	private double c;
	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi()/2;
		return Math.sqrt(p*(p-a) *(p-b) * (p-c)) ;
	}
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	

}
