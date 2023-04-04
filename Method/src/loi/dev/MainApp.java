package loi.dev;

public class MainApp {

	public static void main(String[] args) {
		double x =3;
		int mu =1;
		// sai số
		double eps = 0.001;
		double first = 1;
		double second =first + Math.pow(x, mu)/ fact(mu);
		while(Math.abs(first - second) >eps) {
			mu++;
			first = second;
			second = first + Math.pow(x, mu)/ fact(mu);
		}
		System.out.println(first);
		
		// TODO Auto-generated method stub
		
		
		
	}
	
	// hàm có kiểu dữ trả về  nên nhớ cùng kiểu dữ iệu
	
	// hàm tính gai thừa
			
	static int fact(int n) {
		if(n==1) return 1;
		return n *fact(n-1);
	}
			
			
	// ham không có kiểu trả về
			


}
