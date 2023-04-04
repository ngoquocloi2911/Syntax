package loi.dev;

import java.util.Random;

public class MainApp {
	public static void main(String[] args) {
		int min =1, max =4;
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			try {
				// thời gian chờ
				Thread.sleep(300);
			} catch (Exception e) {
				
			}
			int j = min+ random.nextInt( max +1 - min);
			System.out.println(i);
		}
		
	}

}
