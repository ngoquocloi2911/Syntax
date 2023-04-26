package dev;

// Kế thừa phương thức từ lớp cha -- phải khởi tạo 2 phương của nó
public class Circle extends Shape {
	
	double r;

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2*Math.PI *r;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI *r*r;
	}

	public Circle(double r) {
		super();
		this.r = r;
	}
	
	

}
