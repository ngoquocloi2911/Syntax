package loi.dev.data.dao;

import java.util.List;

import loi.dev.data.model.Category;

public interface CategoryDAO {
	
	public boolean insert(Category category);
	public boolean update(Category category);
	public boolean delete(int id);
	public Category find(int id);
	public List<Category> findAll();

}
