package loi.dev;

import java.util.Scanner;

public class MainApp14 {
	public static void main(String[] args) {
		
		int mu =2;
		double eps = 0.001;
		
		System.out.println("Nhập x:");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		double first = x;
		double second = first +Math.pow(x, mu)/ fact(mu);
		while(Math.abs(first - second) > eps)
		{
			mu+=2;
			first = second;
			second = first +Math.pow(x, mu)/ fact(mu);
		}
		System.out.println(first);

	}
	
	// hàm tính gai thừa
	
		static int fact(int n) {
			if(n==1) return 1;
			return n *fact(n-1);
		}
	}


