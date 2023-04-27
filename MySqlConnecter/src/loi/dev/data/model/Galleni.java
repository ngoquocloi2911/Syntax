package loi.dev.data.model;

public class Galleni {
	private int id;
	private String url;
	
	public Galleni(String url) {
		super();
		this.url = url;
	}
	public Galleni(int id, String url) {
		super();
		this.id = id;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	
}
