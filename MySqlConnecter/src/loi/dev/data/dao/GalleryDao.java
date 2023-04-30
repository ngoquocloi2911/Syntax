package loi.dev.data.dao;

import java.util.List;

import loi.dev.data.model.Gallery;

public interface GalleryDao {
	public boolean insert(Gallery galleni);
	public boolean update(Gallery galleni);
	public boolean delete(int id);
	public Gallery find(int id);
	public List<Gallery> findAll();
	public List<Gallery> findByProduct(int id);
	

}
