package com.aq.ashique;
import java.sql.SQLException;
import com.opensymphony.xwork2.ActionSupport;
public class SignupAction extends ActionSupport{
	public String Name,Password;
	public String execute() throws ClassNotFoundException,SQLException 
	{
		int i = RegisterMe.Save(this);
		if(i>0)
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public String getPassword()
	{
		return Password;
	}
	public void setEmail(String pass)
	{
		Password = pass;
	}

}
