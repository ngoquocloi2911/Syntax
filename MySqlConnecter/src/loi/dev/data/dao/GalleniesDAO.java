package loi.dev.data.dao;

import java.util.List;

import loi.dev.data.model.Galleni;

public interface GalleniesDAO {
	public boolean insert(Galleni galleni);
	public boolean update(Galleni galleni);
	public boolean delete(int id);
	public Galleni find(int id);
	public List<Galleni> findAll();

}
