//Create a class named PatientAppointment with six fields:
//	
//hospitalName, doctorName, patientName, openTime, closeTime, and 
//appointmentCount. All fields should be appropriate data types
//(String for names and times, int for count).
//
//Inside the class, define two methods:
//
//A method named patientDetails() which sets values to all six fields using method parameters.
//
//A method named show() which prints the values of all the fields in a readable format.
//
//In the main method, create an object of the PatientAppointment class, 
//call the patientDetails() method with sample data to initialize the fields, 
//and then call the show() method to display the patient’s appointment details.
package com.sasi;

public class S20 {

      String hospitalName;
      String doctorName;
      String patientName;
      String openTime;
      String closeTime;
      int appointmentCount;
      void patientDetails( String hospitalName, String doctorName, String patientName,String openTime,
    		  String closeTime, int appointmentCount) {
    	  System.out.println("Hospital name:"+hospitalName);
    	  System.out.println("doctor name:"+doctorName);
    	  System.out.println("patient name:"+patientName);
    	  System.out.println("open time:"+openTime);
    	  System.out.println("close time:"+closeTime);
    	  System.out.println("appointmnet count:"+appointmentCount);
    	  System.out.println("*****************************");
      }
      void show() {
    	  System.out.println("Hospital name:"+hospitalName);
    	  System.out.println("doctor name:"+doctorName);
    	  System.out.println("patient name:"+patientName);
    	  System.out.println("open time:"+openTime);
    	  System.out.println("close time:"+closeTime);
    	  System.out.println("appointmnet count:"+appointmentCount);
      }
	public static void main(String[] args) {
		S20 s = new S20();
		s.patientDetails("gandhi hospital","satti babu","sasidhar reddy","10Am","8Pm",2);
		s.show();
		
	}

}
