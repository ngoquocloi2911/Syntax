package loi.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// bài 12.1
		
		int sum =0;
		
		for(int i = 0; i <= 100; i++)
		{
			sum+= i;
			i++;
		}
		System.out.format("Tổng là %d",sum).println();
		
		
		// bài 12.2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 sum = 0;
		
		for(int i =0; i<=n ; i++)
		{
			if(n%3 ==0)
			{
				sum+=i;
			}
			i++;
			
		}
		
		System.out.format("Tổng là %d",sum).println();
		
		// bài 12.3
		
		int  firt =1,second =2, next,i;
		
		System.out.println("Nhập vào số lớn nhất:");
		int y = sc.nextInt();
		
		for( i = 1; i<=y; i++)
		{
			if(i ==1)
			{
				next=i;
			}
			else
			{
				next = firt + second;
				firt = second;
				second = next;
			}
			System.out.format("%d", next).println();
			
		}
		
		// Bài 12.4
		
		
		
		
		
	}

}
