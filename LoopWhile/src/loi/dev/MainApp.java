package loi.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		//11.1
		int i =1;
		
		int tong = 0;
		while (i<=100) {
			tong+=i;
			i++;
			
		}
		System.out.println("Tổng từ 1 đến 100 là: " + tong);
		
		
		// 11.2
		System.out.println("Nhập n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j =1;
		int sum =0;
		while(j<n)
		{
			if(j %3 == 0) {
				sum+=j;
				
			}
			j++;
		}
		System.out.println("Tổng các số chia hết cho 3 là : " +sum);
		
		
		
		
		//11.3
		System.out.println("Nhập m:");
		int m = sc.nextInt();
		int m1 =0 , m2 =1;
		if(m == 1)
		{
			System.out.println(m1);
		}else if( m== 2) {
			System.out.println(m1 + " " +m2);
		}else {
			System.out.print(m1 + " " +m2);
			int tempN;
			int k =3;
			while( k<=m)
			{
				tempN = m1 + m2;
				System.out.print(" " + tempN );
				m1 =m2;
				m2 = tempN;
				k++;
			}
		}
		
		//11.4
		int soDaoNguoc = 0,tam;
		System.out.println("Nhập o:");
		int o = sc.nextInt();
		// gán o vào soBanDau để so sánh
		 int soBandau = o;
		// khai báo 1 biến tạm
	
		// sử dụng vòng lặp while để đảo ngược o
		while(o!=0) {
			 tam = o %10;
			soDaoNguoc = soDaoNguoc *10 + tam;
			o /=10;
		}
		// so sánh số đảo ngược với số ban đầu
		// nếu bằng là đối xứng
		if(soDaoNguoc == soBandau )
		{
			System.out.format("%d  là số đảo ngược", soBandau).println();
		}else {
			System.out.format("%d là không phải là số đảo ngược", soBandau).println();
		}
		
		
		
		
	}
	

}
