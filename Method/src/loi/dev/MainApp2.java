package loi.dev;

import java.util.Scanner;

public class MainApp2 {
	public static void main(String[] args) {
		double dau =1;
		
		double mu =1;
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
			double first =1;
			double second = first -  dau*((((mu+1) *(mu+2))/2)*(Math.pow(x, mu)));
			while(Math.abs(first - second) >eps) {
				dau = -dau;
				mu++;
				first =second;
				second = first -  dau*(((mu+1 *mu+2)/2)*(Math.pow(x, mu)));
			
		}
		System.out.println(first);
	}
	}

}
