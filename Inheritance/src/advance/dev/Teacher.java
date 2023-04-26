package advance.dev;

public class Teacher extends Person {
	
	String maGV;
	double hsl;
	double luongCB = 4500000;

	public Teacher(String name, int old, String phone) {
		super(name, old, phone);
		// TODO Auto-generated constructor stub
		
	}

	

	public Teacher(String name, int old, String phone, String maGV, Double hsl) {
		super(name, old, phone);
		this.maGV = maGV;
		this.hsl = hsl;
	}

	public String getMaGV() {
		return maGV;
	}

	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}

	public double getHsl() {
		return hsl;
	}

	public void setHsl(Double hsl) {
		this.hsl = hsl;
	}
	
	public double tinhLuong()
	{
		return hsl*luongCB;
	}
	
	

}
