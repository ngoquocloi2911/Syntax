package dev;

import java.util.Iterator;
import java.util.Scanner;




public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		khởi tạo một mảng hình gồm 10 phần tử
		Shape shapes [] = new Shape[10];
		
		//  gọi hàm Nhập giá trị cho mảng  gồm nhiều hình shapes
		input(shapes);
		
		// In ra thông tin ra các giá trị vừa nhập
		System.out.println("Các hình vừa nhập");
		print(shapes);
		
		// Hình có diện tích lớn nhất
		System.out.println("Shape với diện tích lớn nhất: " + timHinhCoDienTichLonNhat(shapes)
		.getClass().getSimpleName());
		
		// Diện tích lớn nhất trong các hình tròn
		System.out.println("Hình tròn với diện tích lớn nhất: " + dienTichLonNhatHinhTron(shapes));
		
		// Diện tích lớn nhất trong các hình tam giác
		System.out.println("Hình tam giác với diện tích lớn nhất: " + dienTichLonNhatHinhTamGiac(shapes));
		
		// Diện tích lớn nhất trong các hình chữ nhật
		System.out.println("Hình chữ nhật với diện tích lớn nhất: " + dienTichLonNhatHinhChuNhat(shapes));
        
	}

	private static double dienTichLonNhatHinhChuNhat(Shape[] shapes) {
		// TODO Auto-generated method stub
		double maxDienTich = 0;
		for( Shape shape : shapes)
		{
			if(shape instanceof Rectangle)
			{
				double dienTich = ((Rectangle) shape).dienTich();
				if(dienTich > maxDienTich)
				{
					maxDienTich = dienTich;
				}
			}
		}
		return maxDienTich;
	}

	private static double dienTichLonNhatHinhTamGiac(Shape[] shapes) {
		double maxDienTich = 0;
		for( Shape shape : shapes)
		{
			if(shape instanceof Triangle)
			{
				double dienTich = ((Triangle) shape).dienTich();
				if(dienTich > maxDienTich)
				{
					maxDienTich = dienTich;
				}
			}
		}
		return maxDienTich;
	}

	private static double dienTichLonNhatHinhTron(Shape[] shapes) {
	    double maxDienTich = 0;
	    for (Shape shape : shapes) {
	    	
	        if (shape instanceof Circle) {
	            double dienTich = ((Circle) shape).dienTich();
	            if (dienTich > maxDienTich) {
	                maxDienTich = dienTich;
	            }
	        }
	    }
	    return maxDienTich;
	}

	private static Object timHinhCoDienTichLonNhat(Shape[] shapes) {
		
		
		Shape hinhLonNhat = null;
		double dienTichLonNhat = 0;
		for(Shape shape : shapes)
		{
			double dienTich = shape.dienTich();
			if(dienTich > dienTichLonNhat) 
			{
				dienTichLonNhat = dienTich;
				hinhLonNhat = shape;
			}
		}
		
		return hinhLonNhat;
	}

	

	private static void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		System.out.println("Nhập shapes: ");
		for (Shape shape : shapes) {
			System.out.println("Shape: " + shape.getClass().getSimpleName() 
										 + ", Diện tích: " + shape.dienTich()
										 + ", Chu Vi: " + shape.chuVi());
			
		}
		
	}

	private static void input(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	  
		for (int i = 0; i < 3; i++) {
			System.out.println( "Nhập thông tin hình tròn" + (i+1) + ":");
			System.out.println("Nhập radius: ");
			double r = sc.nextDouble();
			shapes[i] = new Circle(r);
			
		}
		

		for (int i = 3; i < 6; i++) {
			System.out.println( "Nhập thông tin hình chữ nhật" + (i-2) + ":");
			System.out.println("Nhập chiều dài: ");
			double a = sc.nextDouble();
			System.out.println("Nhập chiều rộng: ");
			double b = sc.nextDouble();
			shapes[i] = new Rectangle(a, b);
		
		}
		
		for (int i = 6; i < 10; i++) {
			System.out.println( "Nhập thông tin hình tam giác" + (i-5) + ":");
			System.out.println("Nhập cạnh a: ");
			double a = sc.nextDouble();
			System.out.println("Nhập cạnh b: ");
			double b = sc.nextDouble();
			System.out.println("Nhập cạnh c: ");
			double c = sc.nextDouble();
			shapes[i] = new Triangle(a, b, c);
		
		}
		
		
		       
		
	}

	

	
	
	
	
	

}
