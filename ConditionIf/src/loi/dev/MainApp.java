package loi.dev;

import java.util.Scanner;

public class MainApp {
	// 9.1
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhập số nguyên");
		long l = sc.nextLong();
		
		if(l >0) {
			System.out.println("Đây là số nguyên dương");
			System.out.println(String.format("%d", l));
		} else if(l==0)
		{
			System.out.println("Đây là số 0");
		}
		else {
			System.out.println("Đây là số nguyên âm");
			System.out.println(String.format("%f", l));
		}
		
		
		// 9.2 Viế t chương trình nhập và o tháng trong năm. In ra số ngà y của tháng đó
		
		if( l % 3 ==0 && l % 5 ==0)
		{
			System.out.format("%d chia hết cho 3 và 5", l).println();
		}
		else {
			System.out.format("%d không chia hết cho 3 và 5", l).println();
		}
		
		System.out.println("Nhập vào một tháng bất kỳ");
		l = sc.nextLong();
		if(l ==1 || l ==3 || l ==5 || l ==7 || l ==8 || l ==10 || l ==12)
		{
			System.out.format(" tháng %d có 31 ngày", l).println();
		}
		else if (l ==2) {
			System.out.format(" tháng %d có 28 ngày", l).println();
		}
		else {
			System.out.format(" tháng %d có 30 ngày", l).println();
		}
		
		//9.4 Viế t chương trì nh giả i phương trì nh bậ c 2
		
		double a, b, c, delta;
		double x,x1,x2;
		
		
		
		System.out.println("Giải phương trình bậc 2");
		System.out.println("Nhập a");
		 a = sc.nextDouble();
		System.out.println("Nhập b");
		 b = sc.nextDouble();
		System.out.println("Nhập c");
		 c = sc.nextDouble();
		 delta = b*b - (4*a*c);
		 if(a==0) {
			 x = -c/b;
			 System.out.format("phương trình bậc nhất có nghiệm: %.2f ", x).println();
		 
		 }
		 else {
		 
		 if(delta>0)
		 {
			 x1 = -b + ((Math.sqrt(delta))/2*a);
			 x2 = -b - ((Math.sqrt(delta))/2*a);
			 System.out.format("phương trình có 2 nghiệm %f %.2f", x1,x2).println();
		 }
		 else if(delta== 0)
		 {
			 x = -b/2*a;
			 System.out.format("phương trình có nghiệm kép x1 = x2 = %.2f ", x).println();
		 }
		 else {
			 System.out.println("Phương trình có vô số nghiệm");
		 }
		 }
		 
		 // 9.5 
		 if((a + b > c) && (a + c > b) && (b + c > a)) {
			 System.out.format("%.2f %.2f %.2f là 3 cạnh của 1 tam giác", a,b,c);
		 }
		 else
		 {
			 System.out.format("%.2f %.2f %.2f không phải là 3 cạnh của một tam giác", a,b,c);
		 }
		
		
		
		
		
		
	}

}
