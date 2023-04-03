package loi.dev;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		
		
		// khởi tạo mảng arr gồm 10 phần tử
		int arr[] = new int [10];
		
		// hàm nhập vào 1 mảng gồm 10 phần tử
		Scanner sc = new Scanner(System.in);
		for(int i=0; i< arr.length; i++)
		{
			System.out.println("Nhập vào phần tử thứ " +i+ " của mảng:");
			arr[i] =sc.nextInt();
			
		}
		double sum =0;	
		for(int i=0 ; i<arr.length; i++)
		{
			sum+=arr[i];
			
		}
		if(sum%2==0)
		{
			System.out.format("Tổng %.2f là tổng chẵn ",sum).println();
		}
		else {
			System.out.format("Tổng %.2f là tổng lẻ ",sum).println();
		}
		
		//  đếm số chẳn số lẻ
		int demChan=0,demLe=0;
		for(int i=0 ; i<arr.length; i++)
		{
			
			// số phần tử chẵn trong mảng
			if(arr[i]%2==0)
			{
				demChan++;
			}
			else
			{
				demLe++;
			}
			
		}
		System.out.format("Mảng có %d số chẵn và %d số lẻ ",demChan,demLe).println();
		
		
		
		
	}

}
