package com.aq.ashique;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterMe {

	static int sf = 0;
	public static int Save(SignupAction s) throws ClassNotFoundException,SQLException
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
		PreparedStatement preparedStatement = conn.prepareStatement("insert into users values(?,?)");
		preparedStatement.setString(1, s.getName());
		preparedStatement.setString(2, s.getPassword());
		sf = preparedStatement.executeUpdate();
		return sf;
	}
}
