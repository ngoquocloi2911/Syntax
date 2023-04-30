package loi.dev.data.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import loi.dev.data.dao.DatabaseDao;

public class Product {
	private int id;
	private String name;
	private String description;
	private double price;
	private int quality;
	private int categoryId;
	private Timestamp createdAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Product(int id, String name, String description, double price, int quality, int categoryId,
			Timestamp createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quality = quality;
		this.categoryId = categoryId;
		this.createdAt = createdAt;
	}

	public Product(String name, String description, double price, int quality, int categoryId, Timestamp createdAt) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quality = quality;
		this.categoryId = categoryId;
		this.createdAt = createdAt;
	}

	public Category category() {
		return DatabaseDao.getInstance().getCategoryDao().find(categoryId);
	}
	
	public List<Gallery> galleries(){
		return DatabaseDao.getInstance().getGalleryDao().findByProduct(id);
	}
	
	public List<Order> orders(){
		return DatabaseDao.getInstance().getOrderDao().findByOder(id);
	}

}
