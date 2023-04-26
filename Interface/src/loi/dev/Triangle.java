package loi.dev;

import java.util.Scanner;

public class Triangle extends Shape implements IShape {
	
	double a,b,c;

	@Override
	public void input(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
            Triangle t = new Triangle();
            System.out.println("Nhập cạnh a của tam giác thứ " + (i + 1) + ":");
            t.a = sc.nextDouble();
            System.out.println("Nhập cạnh b của tam giác thứ " + (i + 1) + ":");
            t.b = sc.nextDouble();
            System.out.println("Nhập cạnh c của tam giác thứ " + (i + 1) + ":");
            t.c = sc.nextDouble();
            shapes[i] = t;
        }
	}

	@Override
	public void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		for (Shape s : shapes) {
            if (s instanceof Triangle) {
                Triangle t = (Triangle) s;
                System.out.println("Tam giác có cạnh a = " + t.a + ", b = " + t.b + ", c = " + t.c +
                    ", chu vi = " + t.chuVi() + ", diện tích = " + t.dienTich());
            }
        }
    }
		
	

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return a + b + c;
	}

	@Override
	double dienTich() {
		 double p = chuVi() / 2;
		 
	     return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
