package com.casestudy;
//(24-08-2025)
public class LDAPAuthenticator implements Authenticator {
    
	private final String ldapUser ="ldapUser";
	private final String ldapPassword ="ldapPass";
	
	@Override
	public boolean authenticate(String user, String password) {
		
		return user.equals(ldapUser) && password.equals(ldapPassword);
	}

}
