package loi.dev.data.model;

public class Order {
	private int id;
	private String code;
	private String status;
	
	public Order(String code, String status) {
		super();
		this.code = code;
		this.status = status;
	}
	public Order(int id, String code, String status) {
		super();
		this.id = id;
		this.code = code;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
