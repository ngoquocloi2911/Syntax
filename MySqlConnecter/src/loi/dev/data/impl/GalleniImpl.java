package loi.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import loi.dev.data.dao.GalleniesDAO;
import loi.dev.data.driver.MySQLDriver;
import loi.dev.data.model.Category;
import loi.dev.data.model.Galleni;

public class GalleniImpl implements GalleniesDAO {
	Connection con = MySQLDriver.getInstance().getConnection();

	public GalleniImpl(int id, String url) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean insert(loi.dev.data.model.Galleni gallenies) {
		String sql = "INSERT INTO GALLENIES VALUES(NULL, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, gallenies.getUrl());
			
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(loi.dev.data.model.Galleni gallenies) {
		// TODO Auto-generated method stub
		String sql = "UPDATE GALLENIES SET url = ? WHERE id = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, gallenies.getUrl());
			stmt.setInt(3, gallenies.getId());
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
		String sql = "DELETE FROM GALLENIES WHERE ID = ?";
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
	public Galleni find(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM GALLENIES" ;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String url = rs.getString("url");
				
				return new Galleni(id, url);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<loi.dev.data.model.Galleni> findAll() {
		// TODO Auto-generated method stub
		List<Galleni> gallenis = new ArrayList<>();
		String sql = "SELECT * FROM GALLENIES" ;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String url = rs.getString("url");
				
				gallenis.add(new Galleni(id, url));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gallenis;
	}

}
