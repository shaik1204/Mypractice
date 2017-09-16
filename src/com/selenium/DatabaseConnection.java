package com.selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class DatabaseConnection {
	@Test()
	public void database() throws ClassNotFoundException, SQLException,ClassNotFoundException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection cnn = DriverManager.getConnection("jdbc:oracle://localhost:LMIPL-099", "system","rasool");

		Statement stm = cnn.createStatement();

		ResultSet rs = stm.executeQuery("Select * from emp");

		while (rs.next()) {
			String strname = rs.getNString(0);
			String email = rs.getString(0);
			System.out.println(strname + "" + email);
		}

	}

}
