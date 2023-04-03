package loi.dev;

import java.util.Scanner;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n");
		int n = sc.nextInt();
		
		// 10.1
		switch (n) {
		case 0: {
			
			System.out.format("%d là số nguyên dương", n).println();
			break;
				}
		default:
		{
			// kiểm tra xem là âm hay dương
			int a = n/Math.abs(n);
			switch (a) 
			{
			case 1: 
			{
				
				System.out.format("%d là số nguyên dương", n).println();
				break;
			}
			case -1:
			{
				System.out.format("%d là số nguyên âm", n).println();
				break;
			}
			
			}
			
			
		}
		
		//10.2
		System.out.println("Nhập m");
		int m = sc.nextInt();
		switch (m) {
		case 0: {
			
			System.out.format("%d không chia hết cho cả 3 và 5", m);
			break;
		}
		default:
			int b = m%3;
			switch (b) {
			case 0: {
				
				System.out.format("%d chia hết cho cả 3 ", m).println();
			}
			default:
				int c = m%5;
				switch (c) {
				case 0: {
					
					System.out.format("%d chia hết cho 5 ", m).println();
					break;
					
				}
				default:
					System.out.format("%d  không chia hết cho cả 5 và 3 ", m).println();
				}
				
			}
		}
		
		
		//10.3
		System.out.println("Nhập vào một tháng");
		int x = sc.nextInt();
		
		switch (x) {
		case 1,3,5,7,8,10,12: {
			
			System.out.format("tháng %d có 31 ngày",x).println();
			break;
		}
		case 2: {
			System.out.format("tháng %d có 28 ngày",x).println();
		}
		case 4,6,9,11: {
			System.out.format("tháng %d có 30 ngày",x).println();
		}
		default:
			System.out.format("tháng %d nhập vào không đúng, vui lòng nhập lại",x).println();
		}
		
	}

	}
}
