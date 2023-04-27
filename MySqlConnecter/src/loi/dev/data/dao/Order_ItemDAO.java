package loi.dev.data.dao;

import java.util.List;
import loi.dev.data.model.Order_Item;

public interface Order_ItemDAO {
	public boolean insert(Order_Item order_Item);
	public boolean update(Order_Item order_Item);
	public boolean delete(int id);
	public Order_Item find(int id);
	public List<Order_Item> findAll();

}
