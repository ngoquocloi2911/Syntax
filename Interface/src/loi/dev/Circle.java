package loi.dev;

import java.util.Scanner;

public class Circle extends Shape implements IShape {
	double r;

	@Override
	public void input(Shape[] shapes) {
		
		Scanner sc = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
        	
            Circle c = new Circle();
            System.out.println("Nhập bán kính của hình tròn thứ " + (i + 1) + ":");
            c.r = sc.nextDouble();
            shapes[i] = c;
        }
		
	}

	@Override
	public void print(Shape[] shapes) {
		 for (Shape s : shapes) {
	            if (s instanceof Circle) {
	                Circle c = (Circle) s;
	                System.out.println("Hình tròn có bán kính = " + c.r +
	                    ", chu vi = " + c.chuVi() + ", diện tích = " + c.dienTich());
	            }
	        }
		
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		  return 2 * Math.PI * r;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		  return Math.PI * r * r;
	}
	

}
