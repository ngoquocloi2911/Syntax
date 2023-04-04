package loi.dev;

import java.util.Scanner;

public class MainApp11 {
	public static void main(String[] args) {

		int dau =1;
		int mu =1;
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
			double second = first - dau*(Math.pow(x, mu)/mu);
			while(Math.abs(first - second) > eps)
			{
				mu++;
				dau = -dau;
				first = second;
				second = first - dau*(Math.pow(x, mu)/mu);
			}
			System.out.println(first);
		}
	}

}
