package advance.dev;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		// Student in ra điểm trung bình
//		Student[] st = new Student[1];
//		input(st);
//		output(st);
		
		// Teacher
		Teacher[] teacher = new Teacher[1];
		input(teacher);
		output(teacher);
		
		
	}

	private static void output(Teacher[] teacher) {
		// TODO Auto-generated method stub
		for( Teacher te: teacher)
		{
		System.out.format("Mã giáo viên: %s -- hệ số lương: %.2f -- Lương: %f",
				te.maGV,
				te.hsl,
				te.tinhLuong())
				.println();
		}
		
	}

	private static void input(Teacher[] teacher) {
		// TODO Auto-generated method stub
//		khởi tạo hàm nhập
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<teacher.length;i++)
		{
			System.out.println("Nhập phần tử thứ :" +(i+1));
			
			
			System.out.println("Nhập name");
			String name = sc.nextLine();
			
			System.out.println("Nhập old:");
			int old = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Nhập số điện thoại:");
			String phone = sc.nextLine();
			
			System.out.println("Nhập mã giáo viên");
			String maGV = sc.nextLine();
			
			System.out.println("Nhập hệ số lương");
			Double hsl = sc.nextDouble();
			sc.nextLine();
			
//			thêm giá trị i vừa nhậm vào hàm khởi tạo
			teacher[i] = new Teacher(name, old, phone, maGV, hsl);
		}
		
		
	}

//	private static void output(Student[] st) {
//		// TODO Auto-generated method stub
//		for (Student student : st) {
//		System.out.format(" tên %s: -- tuổi %d: -- số đt: %s -- mã sinh viên:%s -- lớp: %s -- điểm toán %.2f -- "
//				+ "điểm lý: %.2f -- điểm Hóa: %.2f -- điểm Tb: %.2f ",
//				student.name,
//				student.old,
//				student.phone,
//				student.maSV,
//				student.lop,
//				student.getDiemToan(),
//				student.getDiemLy(),
//				student.getDiemHoa(),
//				student.diemTB())	
//		        .println();
//		      }
//		
//	}

//	private static void input(Student[] st) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		for(int i =0; i<st.length ;i++ )
//		{
//			System.out.println("Nhập phần tử thứ:" + (i+1));
//			
//			System.out.println("Nhập name");
//			String name = sc.nextLine();
//			
//			System.out.println("Nhập old:");
//			int old = sc.nextInt();
//			
//			sc.nextLine();
//			
//			System.out.println("Nhập số điện thoại:");
//			String phone = sc.nextLine();
//			
//
//			System.out.println("Nhập mã sinh viên:");
//			String maSV = sc.nextLine();
//			
//
//			System.out.println("Nhập lớp:");
//			String lop = sc.nextLine();
//			
//			
//			System.out.println("Nhập diemToan:");
//			Double diemToan = sc.nextDouble();
//			
//			sc.nextLine();
//			
//			System.out.println("Nhập điểm Lý:");
//			Double diemLy = sc.nextDouble();
//			
//			sc.nextLine();
//			
//			System.out.println("Nhập điểm Hóa:");
//			Double diemHoa = sc.nextDouble();
//			
//			sc.nextLine();
//			
//			st[i] = new Student(name, old, phone, diemToan, diemLy, diemHoa, name, phone);
//			
//			
//			
//		}
//	}

}
