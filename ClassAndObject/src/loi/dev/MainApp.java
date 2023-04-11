package loi.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		khởi tạo 3 sv
//		Khai báo 1 mảng 3 phần tử
		Student students[] = new Student[2];
		input(students); 
		print(students);
		
		
	}
	
	private static void print(Student[] students) {
		// TODO Auto-generated method 
		// lấy student trong 1 mảng stdudent của mình
		for(Student student : students)
		{
			System.out.format("Name: %s - old: %d - Adress: %s - Phone: %s - diemTb: %.2f",
					student.name,
					student.old,
					student.address,
					student.phone,
					student.diemTB
					)
			.println();
		}
		
		
	}

	private static void input(Student[] students) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < students.length; i++)
			
		{
//			Khởi tạo đối tượng
			
			System.out.println("Nhập phần thử thứ " +(i +1));
			System.out.println("Name:");
			String name = sc.nextLine();
			
			System.out.println("old:");
			int old = sc.nextInt();
//			Sau số là phải xuống dòng( vì mặc định của int là trên cùng 1 dòng
			sc.nextLine();
			
			System.out.println("address:");
			String address = sc.nextLine();
			
			System.out.println("phone:");
			String phone = sc.nextLine();
			
			System.out.println("diemTB:");
			// Sau số là phải next không là hắn gắn liền
			double diemTB = sc.nextDouble();
			sc.nextLine();
//			Sử dụng hàm khởi tạo chỉ cần gọi về chứ không cần phải khởi tạo 1 hàm rỗng nữa
			
			students[i] = new Student(name, old, address, phone, diemTB);
			
			
			
		
			
			
		}
		
	}

	
	 

}
