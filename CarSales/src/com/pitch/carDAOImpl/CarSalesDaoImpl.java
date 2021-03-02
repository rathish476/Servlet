package com.pitch.carDAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pitch.carDAO.CarSalesUserDao;



public class CarSalesDaoImpl  implements CarSalesUserDao{

	@Override
	public boolean save() {
		
		try {
		Connection connection = getConnnection();
		
		String sqlQuery = "insert into pitch.userdb (name, emailid, Contact Number, password,re-password) " + 
				"values(? , ? , ? , ?, ? );";
		
		
		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
		
		
		}catch (Exception e) {
			e.getStackTrace();
		}
		
		return false;
	}

	public Connection getConnnection() {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pitch", "root", "rathish@06TA");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conn;
	}

	
}