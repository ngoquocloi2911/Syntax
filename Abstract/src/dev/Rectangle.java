package dev;

//Kế thừa phương thức từ lớp cha -- phải khởi tạo 2 phương của nó theo công thức riêng của hình chữ nhật
public class Rectangle extends Shape {
	double a,b;

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return (a+b)*2;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return a*b;
	}

	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	

}
