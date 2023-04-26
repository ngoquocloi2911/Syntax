package loi.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = getStudentInfo();
		
		System.out.println(students[0].toString());
		students[0].doHomework("C language programming");
		students[0].payFee();
		students[0].doXam("abc");
		
		students[1] = getStudentInfo();
		students[1].study("Home work");
		

	}
	
	public static Student getStudentInfo() {
		Student s = null;
		String id, fullName, address, email, phoneNumber;
		float fee;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhập ID:");
		id = sc.nextLine();
		System.out.println(" Nhập tên đầy đủ:");
		fullName = sc.nextLine();
		System.out.println(" Nhập địa chỉ:");
		address = sc.nextLine();
		System.out.println(" Nhập email:");
		email = sc.nextLine();
		System.out.println(" Nhập số điện thoại:");
		phoneNumber = sc.nextLine();
		System.out.println(" Nhập fee:");
		fee = sc.nextFloat();
		
		s = new Student(id, fullName, email, address, phoneNumber, fee);
		
		return s;
		
	}

}
