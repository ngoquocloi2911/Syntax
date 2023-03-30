package loi.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// Hàm nhập 
		Scanner sc = new Scanner(System.in);
		
		// Thông tin sinh viên
		System.out.println("Nhập tên sinh viên");
		String line = sc.nextLine();
		System.out.println("Nhập mã sinh viên");
		String line2 = sc.nextLine();
		System.out.println("Nhập cmnd");
		int i = sc.nextInt();
		System.out.println("Nhập tên lớp");
		String line3 = sc.nextLine();
		System.out.println("Nhập tên trường");
		String line5 = sc.nextLine();
		System.out.println("Nhập DbT");
		double d = sc.nextDouble();
		
		System.out.println("Thông tin sinh viên");
		System.out.println(String.format("%s - %s - %d - %s - %s - %2.f", line,line2,i,line3,line5,d));
		
		
		
		
		
		
		
		
		
	}

}
