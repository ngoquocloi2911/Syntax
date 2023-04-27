package loi.dev.data.model;

public class Product {
	private int id;
	private String name;
	private String description;
	private long price;
	private int quality;
	
	public Product(String name, String description, long price, int quality) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quality = quality;
	}

	public Product(int id, String name, String description, long price, int quality) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quality = quality;
	}

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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	
}
