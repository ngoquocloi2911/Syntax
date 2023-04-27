package loi.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import loi.dev.data.dao.CategoryDAO;
import loi.dev.data.dao.ProductDAO;
import loi.dev.data.driver.MySQLDriver;
import loi.dev.data.impl.CategoryImpl;
import loi.dev.data.impl.ProductImpl;
import loi.dev.data.model.Product;

public class MainApp {
	
    
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Connection con = MySQLDriver.getInstance().getConnection();
//
//		CategoryDAO categoryDAO = new CategoryImpl();
//		categoryDAO.delete(3);
		ProductDAO productDAO = new ProductImpl();
		productDAO.delete(0);

	}

	private static void delete(Connection con) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM CATEGORIES WHERE ID = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, 1);
			
//			stmt.execute();
			System.out.println(stmt.execute());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void update(Connection con) {
		// TODO Auto-generated method stub
		String sql = "UPDATE CATEGORIES SET name = ?, thumbnail = ? WHERE id = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,"Ao bull");
			stmt.setString(2,"abcxyz");
			stmt.setInt(3,2);
			
			stmt.execute();
//			System.out.println(stmt.execute());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void read(Connection con) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM CATEGORIES" ;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String thumbnail = rs.getString("thumbnail");
				System.out.format("%d - %s - %s", id, name, thumbnail).println();
			}
//			System.out.println(stmt.execute());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void create(Connection con) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CATEGORIES VALUES(NULL, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "Ao phong");
			stmt.setString(2, "https://google.com/asdf");
			
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
