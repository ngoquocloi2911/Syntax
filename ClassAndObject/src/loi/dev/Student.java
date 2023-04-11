package loi.dev;

public class Student {
	String name;
	int old;
	String address;
	String phone;
	double diemTB;
	
	public Student(String name, int old, String address, String phone, double diemTB) {
		super();
		this.name = name;
		this.old = old;
		this.address = address;
		this.phone = phone;
		this.diemTB = diemTB;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		if(this.old <0) old =0;
		this.old = old;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		if(this.diemTB >=0) 
		this.diemTB = diemTB;
	}
	
	
	
	
	
	
}
