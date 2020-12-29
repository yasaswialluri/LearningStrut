package com.cg;

import com.opensymphony.xwork2.Preparable;

public class Login implements Preparable {

	private String name;

	private String password;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void prepare() throws Exception {  
	    System.out.println("preparation logic");  
	}  
	  
	public String execute()
	{
		if(getName().equals("Alluri Yasaswi")&& getPassword().equals("yash123")) {
			System.out.println("LoggedIn");
			return "success";
		}
		else {
			System.out.println("InvalidLogin");
		}
		
		return "error";
	}
}
