package loi.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import loi.dev.data.dao.ProductDAO;
import loi.dev.data.driver.MySQLDriver;
import loi.dev.data.model.Product;

public class ProductImpl implements ProductDAO {
	// gọi hàm kết nối csdl
	Connection con = MySQLDriver.getInstance().getConnection();

	@Override
	public boolean insert(Product product) {
		String sql = "INSERT INTO PRODUCTS VALUES(NULL, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, product.getName());
			stmt.setString(2, product.getDescription());
			stmt.setLong(3, product.getPrice());
			stmt.setInt(2, product.getQuality());
			
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Product product) {
		String sql = "UPDATE PRODUCTS SET name = ?, description = ?, price = ?, quality = ? WHERE id = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, product.getName());
			stmt.setString(2, product.getDescription());
			stmt.setLong(3, product.getPrice());
			stmt.setInt(3, product.getQuality());
			return stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM PRODUCTS WHERE ID = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			return stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Product find(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM PRODUCTS" ;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String description = rs.getString("description");
				Long price = rs.getLong("price");
				Integer quality = rs.getInt("quality");
				
				return new Product(name, description, price, quality);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> findALL() {
		// TODO Auto-generated method stub
		List<Product> proList = new ArrayList<>();
		String sql = "SELECT * FROM PRODUCTS" ;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String description = rs.getString("description");
				Long price = rs.getLong("price");
				Integer quality = rs.getInt("quality");
				
				
				proList.add(new Product(name, description, price, quality));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proList;
	}
	

}
