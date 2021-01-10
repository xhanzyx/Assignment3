package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class CreateUsersArray {

	public static void createUsersArray() {
		UserLoginInfo[] users = new UserLoginInfo[4];
		String userInfo = "data.txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(userInfo));
			String line = null;
			int i = 0;
			while ((line = br.readLine()) != null) {

				users[i] = new UserLoginInfo(line.split(","));
			
				i++;
			}
			for (int j = 0; j < users.length; j++) {
				System.out.println(users[j].toString());
			}
			UserLoginApplication.userLoginInfo = users;
		} catch (IOException e) {
			System.out.println("Something went wrong...");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Something went wrong...");
				e.printStackTrace();
			}
		}

	}

}
