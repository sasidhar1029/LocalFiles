package com.sasi;

public class S23 {
      int employeeId;
      int projectsCompleted;
      int overTimeHours;
      double basicSalary;
      S23(int id,int projects,int overtime,double salary){
    	  this.employeeId =id;
    	  this.projectsCompleted =projects;
    	  this.overTimeHours = overtime;
    	  this.basicSalary = salary;
      }
      void calculatedBonus() {
    	  double bonus = (projectsCompleted>3 && overTimeHours>=10)?
    			  (0.10*basicSalary):(projectsCompleted>3 || overTimeHours>=10)?
    					  (0.05*basicSalary):0;
    	  double finalSalary = basicSalary+bonus;
    	  projectsCompleted++;
    	  System.out.println("employee details.......");
    	  System.out.println("employee id:"+employeeId);
    	  System.out.println("projects completed:"+projectsCompleted);
    	  System.out.println("final of salary of employeee:"+finalSalary);
      }
	public static void main(String[] args) {
		S23 s = new S23(102,4,9,60000);
		s.calculatedBonus();
	}

}
