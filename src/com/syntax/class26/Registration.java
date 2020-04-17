package com.syntax.class26;

public class Registration {
	private String email, userName, password;

	public void setEmail(String email) {
		if (email.endsWith("yahoo.com")) {
			this.email = email;
		} else {
			System.out.println("Email must be yahoo.com type");
		}
	}

	public void setName(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		} else {
			System.out.println("UserName must be more than 6 characters and  must not be empty");
		}
	}
	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if ((!password.contains(userName))) {
					this.password = password;
				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println(" Password must be more than 6");
			}
		} else {
			System.out.println("password  must not be empty");
		}
	}
	public String getEmail() {
		return email;
	}

	public String getName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
}
