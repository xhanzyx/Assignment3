package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static GetUserInfoService getUserInfoService = new GetUserInfoService();
	public static UserLoginInfo[] userLoginInfo = new UserLoginInfo[4];

	public static void main(String[] args) {
//Instantiating scanner 
		Scanner scanner = new Scanner(System.in);
//calling createUserArray method from CreateUserArray class
		CreateUsersArray.createUsersArray();
//asking user for username and password
		boolean userValidation = false;
		int loginAttemptsCount = 0;
		while (!userValidation && loginAttemptsCount < 5) {
			System.out.println("Please enter email-address: ");
			String username = scanner.nextLine();
			System.out.println("Please enter password: ");
			String password = scanner.nextLine();
			UserLoginInfo userIsValid = getUserInfoService.userIsValid(username, password);
			if (userIsValid != null) {
				System.out.println("Welcome: " + userIsValid.getName());
				userValidation = true;
			} else {
				System.out.println("Try again, invalid username or password!");
				loginAttemptsCount++;
			}
			if (loginAttemptsCount >= 5) {
				System.out.println("One too many failed attempts... You are now locked out!");

			}

		}
		scanner.close();

	}
}
