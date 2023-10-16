 package employee;

import java.util.Random;

public class CalculateEmployeeWages extends CompanyEmpWage {
	

	public CalculateEmployeeWages(String companyName, int employeeWagePerHour, int daysPerMonth,
			int fulldayWorkingHours, int partTimeWorkingHours) {
		super(companyName, employeeWagePerHour, daysPerMonth, fulldayWorkingHours, partTimeWorkingHours);
	}
	//check Present or Absent
	 public int checkEmployee() {
		 Random rn=new Random();
		 int check=rn.nextInt(3);
		 return check;
	 }
	 public int calculateWage(int check) {
		 if(check==0) {
			 System.out.println("Present");
			 return employeeWagePerHour*fulldayWorkingHours;
		 }else if(check==1) {
			 System.out.println("Part Time");
			 return employeeWagePerHour*partTimeWorkingHours;
		 }else {
			 System.out.println("Absent");
			 return 0;
		 }
	 
  
	
}

  public void CalculateEmployeeWages() {
          int totalWage=0;
          int wage;
    	 int hours;
          int totalHours=0;

          for(int i=0;i<=daysPerMonth;i++) {
        	  wage=0;
        	  hours=0;
          int check=this.checkEmployee();
         this.calculateWage(check);
          switch(check) {
          case 0:
              System.out.println("Day "+i+" Present");
			wage = employeeWagePerHour * fulldayWorkingHours;
              System.out.println("Employee Wage is : " + wage);
              hours=fulldayWorkingHours;
              break;
          case 1:
              System.out.println("Day "+i+" Part Time");
              wage = employeeWagePerHour * partTimeWorkingHours;
              System.out.println("Employee Wage is : " + wage);
              hours=partTimeWorkingHours;
              break;
          case 2:
              System.out.println("Day "+i);
              break;
          }
        	  
          totalWage=totalWage+wage;
          totalHours=totalHours+hours;
          }
          System.out.println();
          if(totalHours>100) {
        	  totalHours=100;
        	  totalWage=100*employeeWagePerHour;
          }
          System.out.println("Total Wage for 20 Days for "+companyName +" is :: "+totalWage);
          System.out.println("Total Working Hours in 20 Days for "+companyName +" is :: "+totalHours);
         
	}
public int theWageForTwentyDays(int fullDays, int partTime, int absent) {
	
 	return (fullDays*employeeWagePerHour*fulldayWorkingHours)+(partTime*employeeWagePerHour*partTimeWorkingHours);
}
public int calculateTheWorkingHoursForTheGivenWages(int wages) {
	return wages/employeeWagePerHour;
}

}
