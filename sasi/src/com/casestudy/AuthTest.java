package com.casestudy;
//(24-08-2025)
public class AuthTest {

	public static void main(String[] args) {
		Authenticator dbAuth =new DatabaseAuthenticator();
		boolean dbResult = dbAuth.authenticate("admin", "124");
		System.out.println("Database authentication:"+(dbResult?"success":"Failed"));
		Authenticator ldapAuth =new LDAPAuthenticator();
		boolean ldapResult = ldapAuth.authenticate("ldapUser", "ldapPass");
		System.out.println("LDAP Authenticator:"+(ldapResult?"success":"Failed"));
//		boolean wrongResult =dbAuth.authenticate("WrongUser", "WrongPass");
//		System.out.println("Database Authentication with wrong creds:"
//		+(wrongResult?"Sucess":"Failed"));
	}

}
