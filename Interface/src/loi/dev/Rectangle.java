package loi.dev;

import java.util.Scanner;

public class Rectangle extends Shape implements IShape {
	double a,b;

	@Override
	public void input(Shape[] shapes) {
		 Scanner sc = new Scanner(System.in);
	        for (int i = 0; i < shapes.length; i++) {
	            Rectangle r = new Rectangle();
	            System.out.println("Nhập bán kính của hình tròn thứ " + (i + 1) + ":");
	            r.a = sc.nextDouble();
	            r.b = sc.nextDouble();
	            shapes[i] = r;
	        }
		
	}

	@Override
	public void print(Shape[] shapes) {
		 for (Shape s : shapes) {
	            if (s instanceof Rectangle) {
	            	Rectangle r = (Rectangle) s;
	                System.out.println("Hình tròn có chiều dài = " + r.a +
	                		"Hình tròn có chiều rộng = " + r.b +
	                    ", chu vi = " + r.chuVi() + ", diện tích = " + r.dienTich());
	            }
	        }
		
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return (a+b)*2;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return a*b;
	}
	

}
