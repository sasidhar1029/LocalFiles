package com.console_based_projects;

public class HomeLoan extends Loan {


	public double getROI() {
		 double roi =10.5;
		return roi;
	}
	public int method2(int i) {
		return 400*i;
	}
    String method1() {
		return"home loan";
	}

	public static void main(String[] args) {
		System.out.println("Welcome Home loan Banking!");
		

		HomeLoan h = new HomeLoan();

		if (h.getSalInfo() >= 600000.00 && h.getCibilScore() >= 700) {
			System.out.println("congrats! you are eligible for Home loan");
			System.out.println("ROI:"+h.getROI());
			System.out.println("we are looking for your address details here:");
			String address =h.getAddreddDetails();
			
			System.out.println("As per your information you address details:"+address);
			
		}

	}
	  void HomeLoanDocumentInfo() {
	    	 System.out.println("Home loan verification has successfully complted");
	     }

	
}
