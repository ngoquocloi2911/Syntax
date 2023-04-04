package loi.dev;

import java.util.Scanner;

public class MainApp9 {
	public static void main(String[] args) {
		
		double dau =1;
		int mu =2;
		double eps = 0.001;
		int i = 1;
		
		System.out.println("Nhập x:");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		double first = 1;
		double second = first - dau*(Math.pow(x, mu)/ fact(i+2));
		while(Math.abs(first - second) > eps)
			{
				mu+=2;
				i+=2;
				first = second;
				second = first - dau*(Math.pow(x, mu)/ fact(i+2));
			}
			System.out.println(first);
			
		
	}

	// hàm tính gai thừa
			
	static int fact(int n) {
		if(n==1) return 1;
		return n *fact(n-1);
	}
}
