package loi.dev.data.model;

public class Order_Item {
	private int id;
	private int quanlity;
	private long price;
	
	public Order_Item(int quanlity, long price) {
		super();
		this.quanlity = quanlity;
		this.price = price;
	}
	public Order_Item(int id, int quanlity, long price) {
		super();
		this.id = id;
		this.quanlity = quanlity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuanlity() {
		return quanlity;
	}
	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
}
