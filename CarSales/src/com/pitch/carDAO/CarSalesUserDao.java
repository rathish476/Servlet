package com.pitch.carDAO;

import java.sql.Connection;

public interface CarSalesUserDao {
	
	Connection getConnnection();
	boolean save() ;

}