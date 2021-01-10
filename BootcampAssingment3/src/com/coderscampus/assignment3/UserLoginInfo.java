package com.coderscampus.assignment3;

public class UserLoginInfo {
	private String username;
	private String password;
	private String name;

	public UserLoginInfo(String[] v) {
		this.username = v[0];
		this.password = v[1];
		this.name = v[2];
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserLoginInfo [username=" + username + ", password=" + password + ", name=" + name + "]";
	}
}
