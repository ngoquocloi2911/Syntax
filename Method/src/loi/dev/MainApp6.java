package loi.dev;

import java.util.Scanner;

public class MainApp6 {
	public static void main(String[] args) {
		
		double dau =1;
		int mu =3;
		double eps = 0.001;
		
		System.out.println("Nhập x:");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		if(x <-1 || x >1)
		{
			System.out.println("Vui lòng nhập đúng giá trị");
		}
		else 
		{
			double first = x;
			double second = first -dau*(Math.pow(x, mu)/ fact(mu));
			while(Math.abs(first-second)>eps)
			{
				dau = -dau;
				mu+=2;
				first = second;
				second = first -(Math.pow(x, mu)/ fact(mu));;
			}
			System.out.println(first);
		}
		
	}
	// hàm tính gai thừa
	
		static int fact(int n) {
			if(n==1) return 1;
			return n *fact(n-1);
		}

}
