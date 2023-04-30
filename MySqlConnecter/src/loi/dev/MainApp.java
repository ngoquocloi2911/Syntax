package loi.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import loi.dev.data.dao.CategoryDao;
import loi.dev.data.dao.Database;
import loi.dev.data.dao.DatabaseDao;
import loi.dev.data.dao.ProductDao;
import loi.dev.data.driver.MySQLDriver;
import loi.dev.data.impl.CategoryImpl;
import loi.dev.data.impl.ProductImpl;
import loi.dev.data.model.Category;
import loi.dev.data.model.Product;
import loi.dev.util.Faker;

public class MainApp {
	
    
	public static void main(String[] args) {
		DatabaseDao.init(new Database());
		
		CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
		for(int i = 1 ; i < 100; i++) {
			Category category = new Category(Faker.name(10), Faker.url());
			categoryDao.insert(category);
		}
		
	}

	

}
