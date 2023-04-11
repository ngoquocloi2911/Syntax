package advance.dev;

public class Student extends Person {
	
	private Double diemToan,diemLy,diemHoa;
	 String maSV, lop;

	 public Student(String name, int old, String phone) {
		 super(name, old, phone);
		 // TODO Auto-generated constructor stub
	 }

	public Student(String name, int old, String phone, Double diemToan, Double diemLy, Double diemHoa, String maSV,
			String lop) {
		super(name, old, phone);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSV = maSV;
		this.lop = lop;
	}

	public Double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(Double diemToan) {
		this.diemToan = diemToan;
	}

	public Double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(Double diemLy) {
		this.diemLy = diemLy;
	}

	public Double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(Double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	
	public double diemTB()
	{
		return (diemLy+diemHoa+diemToan)/3;
	}


	

}
