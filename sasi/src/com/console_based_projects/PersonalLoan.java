package com.console_based_projects;

public class PersonalLoan extends Loan{

	public static void main(String[] args) {
		PersonalLoan p = new PersonalLoan();
		System.out.println("**************");
		p.getROI();
		System.out.println("welcome to Vcube personal loan banking ");

		double salary = p.getSalInfo();
		int cibil = p.getCibilScore();

		if (salary >= 700000.00 && cibil >= 750) {
			System.out.println("congrats! your are eglibile for personal loan");
			System.out.println("your loan ROI is:" + p.getROI());
			System.out.println("We are Looking for your address details Enter the details here:");

			String address = p.getAddreddDetails();
			System.out.println("As per your information you address details:" + address);
			p.personalLoanDocumentInfo();
		} else {
			System.out.println("sorry!! try again later");
		}

	}
     void personalLoanDocumentInfo() {
    	 System.out.println("Personal loan verification has successfully complted");
     }
	
}
