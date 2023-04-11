package loi.dev;

import java.util.Scanner;

public class MainApp4 {
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
			
			
			
		}
		
		double c= Math.pow(3, 3);
		System.out.println(c);
		
	}
	
	static int fact(int n) {
		if(n==1) return 1;
		return n *fact(n-1);
	}
	
	}

}
