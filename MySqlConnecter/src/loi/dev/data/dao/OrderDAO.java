package loi.dev.data.dao;

import java.util.List;

import loi.dev.data.model.Galleni;
import loi.dev.data.model.Order;

public interface OrderDAO {
	public boolean insert(Order order);
	public boolean update(Order order);
	public boolean delete(int id);
	public Order find(int id);
	public List<Order> findAll();
}
