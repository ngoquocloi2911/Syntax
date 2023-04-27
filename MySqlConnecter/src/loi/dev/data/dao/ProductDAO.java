package loi.dev.data.dao;

import java.util.List;

import loi.dev.data.model.Product;

public interface ProductDAO {

	public boolean insert(Product product);
	public boolean update(Product product);
	public boolean delete(int id);
	public Product find(int id);
	public List<Product> findALL();
}
