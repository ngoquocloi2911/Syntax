package loi.dev;

import java.util.Scanner;

public class MainApp3 {
	public static void main(String[] args) {
		
		double dau =1;
		double mu =2;
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
			double first =-x;
			double second = first - (Math.pow(x, mu))/mu;
			while(Math.abs(first - second) >eps) {
				mu++;
				first =second;
				second = first - (Math.pow(x, mu))/mu;
			
		}
		System.out.println(first);
		}
	}

}
