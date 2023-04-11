package advance.dev;

public class Teacher extends Person {
	
	String maGV;
	int hsl;

	public Teacher(String name, int old, String phone) {
		super(name, old, phone);
		// TODO Auto-generated constructor stub
		
	}

	public Teacher(String name, int old, String phone, String maGV, int hsl) {
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

	public int getHsl() {
		return hsl;
	}

	public void setHsl(int hsl) {
		this.hsl = hsl;
	}
	
	

}
