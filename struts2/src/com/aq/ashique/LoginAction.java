package com.aq.ashique;
import java.sql.SQLException;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport{
	public String username,password;
	public String execute() throws ClassNotFoundException,SQLException 
	{
		int i = ValidateMe.Save(this);
		if(i == 1)
		{
			return "success";
		}
		else
		{
			addActionError(getText("error.login"));
			return "error";
		}
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String name)
	{
		username = name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setEmail(String pass)
	{
		password = pass;
	}

}
