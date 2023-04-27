package loi.dev.data.dao;

import java.util.List;

import loi.dev.data.model.User;


public interface UserDAO {
	public boolean insert(User user);
	public boolean update(User user);
	public boolean delete(int email);
	public User find(String email);
	public List<User> findAll();
	

}
