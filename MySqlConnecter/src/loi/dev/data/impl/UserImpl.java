package loi.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import loi.dev.data.dao.UserDAO;
import loi.dev.data.driver.MySQLDriver;
import loi.dev.data.model.Category;
import loi.dev.data.model.Order;
import loi.dev.data.model.User;

public class UserImpl implements UserDAO {
	Connection con = MySQLDriver.getInstance().getConnection();

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO USERS VALUES(?, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getEmail());
			stmt.setString(2, user.getPassword());
			stmt.setString(2, user.getRole());
			
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		String sql = "UPDATE USERS SET password = ?, role = ? WHERE email = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getPassword());
			stmt.setString(2, user.getRole());
			stmt.setString(3, user.getEmail());
			return stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int email) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM USERS WHERE email = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, email);
			
			return stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User find(String email) {
		String sql = "SELECT * FROM USERS" ;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String password = rs.getString("password");
				String role = rs.getString("role");
				
				return new User(email, password, role);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		String sql = "SELECT * FROM Users" ;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String email = rs.getString("email");
				String password = rs.getString("password");
				String role = rs.getString("role");
				
				users.add(new User(email, password, role));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
	

}
