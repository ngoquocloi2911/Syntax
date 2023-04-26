package loi.dev;

public class Student {
	
	private String id;
	private String fullName;
	private String email;
	private String address;
	private String phoneNumber;
	private float fee;
	
//	hàm tạo mặc định để khi truyển đối tượng không truyền tham số
	public Student() {
		super();
	}

public Student(String id, String fullName, String email, String address, String phoneNumber, float fee) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.email = email;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.fee = fee;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public float getFee() {
	return fee;
}

public void setFee(float fee) {
	this.fee = fee;
}

// Thông tin đầy đủ của một đối tượng
@Override
public String toString() {
	return "Student [id=" + id + ", fullName=" + fullName + ", email=" + email + ", address=" + address
			+ ", phoneNumber=" + phoneNumber + ", fee=" + fee + "]";
}
	
//Method không cần phải trả về
	void study (String subject) {
		System.out.println(this.fullName + " is studying" + subject);
	}
	
	void doXam (String subject) {
		System.out.println(this.fullName + " doing" + subject + "exam");
	}
	
	void payFee () {
		System.out.println(  " Free of " + this.fullName + " is " + this.fee);
	}
	
	
	void doHomework (String subject) {
		System.out.println(this.fullName + " is doing" + subject + "homework");
	}
	
	
	
	
	
	

	
	
	
	
	
	

}
