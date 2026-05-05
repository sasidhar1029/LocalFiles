package com.casestudy;
//(24-08-2025)
public class DatabaseAuthenticator implements Authenticator {
	private final String dbUser ="admin";
	private final String DbPassword="1234";


	@Override
	public boolean authenticate(String user, String password) {
		
		return user.equals(dbUser)&&password.equals(DbPassword);
	}

}
