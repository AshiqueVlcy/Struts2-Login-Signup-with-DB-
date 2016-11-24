package com.aq.ashique;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidateMe {

	static int sf = 0;
	public static int Save(LoginAction s) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/struts2", "root", "123");
			System.out.println("Connected");
		}catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Not Connected");
		}
		PreparedStatement preparedStatement = conn.prepareStatement("select * from users where email = ? and password = ?");
		preparedStatement.setString(1, s.getUsername());
		preparedStatement.setString(2, s.getPassword());
		ResultSet rs = preparedStatement.executeQuery();
		if(rs.next())
		{
			sf = 1;
			return sf;
		}
		else
		{
			sf = 0;
			return sf;
		}
	}
}

