package com.coderscampus.assignment3;

public class GetUserInfoService {

	public UserLoginInfo userIsValid(String username, String password) {
		for (UserLoginInfo userLoginInfo : UserLoginApplication.userLoginInfo) {
			if (userLoginInfo.getUsername().equalsIgnoreCase(username)
					&& userLoginInfo.getPassword().equals(password)) {
				return userLoginInfo;
			}
		}
		return null;

	}

}
