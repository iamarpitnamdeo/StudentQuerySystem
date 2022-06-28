package model;

import java.sql.ResultSet;

import Database.DBConnect;

public class RegModel {
	private String Name;
	private String Email;
	private String Password;
	private String Mobile;
	private String Branch;
	private String UserType;
	public String getEmail() {
		return Email;
	}
	public String getName() {
		return Name;
	}
	public	void setName(String name) {
		Name = name;
	}

	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	
	public void InsertReg()throws Exception
	{
		DBConnect x=new DBConnect();
		x.queryExecuter("insert into reg values('"+getName()+"','"+getEmail()+"','"+getPassword()+"','"+getMobile()
		+"','"+getBranch()+"','"+getUserType()+"')");
		
	}
	public void checkuser()throws Exception
	{
		DBConnect x=new DBConnect();
		ResultSet rs=x.queryReturner("select * from reg where email='"
		+getEmail()+"' and password='"+getPassword()+"'");
		if(rs.next())
		{
			setName(rs.getString(1));
			setMobile(rs.getString(4));
			setBranch(rs.getString(5));
			setUserType(rs.getString(6));
		}
		
	}

}