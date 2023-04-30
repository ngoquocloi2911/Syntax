package loi.dev.data.model;

public class OrderItem {
	private int id;
	private int quanlity;
	private double price;
	private int orderId;
	private int productID;
	
	public OrderItem(int quanlity, double price, int orderId, int productID) {
		super();
		this.quanlity = quanlity;
		this.price = price;
		this.orderId = orderId;
		this.productID = productID;
	}
	public OrderItem(int id, int quanlity, double price, int orderId, int productID) {
		super();
		this.id = id;
		this.quanlity = quanlity;
		this.price = price;
		this.orderId = orderId;
		this.productID = productID;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	
	
	
}
