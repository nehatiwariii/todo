package com.example.WebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
public boolean authenticate(String username, String password) {

		boolean isValidUserName = username.equalsIgnoreCase("anjali");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");

		return isValidUserName && isValidPassword;
	}

}
