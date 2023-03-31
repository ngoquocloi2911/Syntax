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
		System.out.println(String.format("%s - %s - %d - %s - %s - %2f", line,line2,i,line3,line5,d));
		
		// Thông tin công nhân
		System.out.println("Nhập tên công nhân");
		String line4 = sc.nextLine();
		System.out.println("Nhập địa chỉ");
		String line6 = sc.nextLine();
		System.out.println("Nhập số điện thoại");
		int i2 = sc.nextInt();
		System.out.println("Nhập hệ số lương");
		int i3 = sc.nextInt();
		
		System.out.println("Thông tin công nhân");
		System.out.println(String.format("%s - %s - %d - %d ", line4,line6,i2,i3));
		
		// Thông tin một chiếc xe
		
		System.out.println("Nhập tên xe");
		String line7 = sc.nextLine();
		System.out.println("Nhập hãng");
		String line8 = sc.nextLine();
		System.out.println("Nhập giá");
		long l = sc.nextLong();
		System.out.println("Nhập màu sơn");
		String line9 = sc.nextLine();
		
		System.out.println("Thông tin xe");
		System.out.println(String.format("%s - %s - %l - %s ", line7,line8,l,line9));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
