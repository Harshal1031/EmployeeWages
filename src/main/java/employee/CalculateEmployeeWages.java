package employee;

import java.util.Random;

public class CalculateEmployeeWages {
	
	static int Employee_Wage_Per_Hour=20;
    static int HOURS_PER_MONTH = 100;
    static int DAYS_PER_MONTH = 20;
    static int FULLDAY_WORKING_HOUR=8;
    static int PARTTIME_WORKING_HOUR=4;


	//check Present or Absent
	 public int checkEmployee() {
		 Random rn=new Random();
		 int check=rn.nextInt(3);
		 return check;
	 }
	 public void calculateWage(int check) {
		 if(check==0) {
			 System.out.println("Present");
		 }else if(check==1) {
			 System.out.println("Part Time");

		 }else {
			 System.out.println("Absent");
		 }
	 
  
	
}

  public static void main(String[] args) {
          CalculateEmployeeWages cw=new CalculateEmployeeWages();
          int totalWage=0;
          int wage;
    	 int hours;
          int totalHours=0;

          for(int i=0;i<=20;i++) {
        	  wage=0;
        	  hours=0;
          int check=cw.checkEmployee();
         cw.calculateWage(check);
          switch(check) {
          case 0:
              System.out.println("Day "+i+" Present");
			wage = Employee_Wage_Per_Hour * FULLDAY_WORKING_HOUR;
              System.out.println("Employee Wage is : " + wage);
              hours=FULLDAY_WORKING_HOUR;
              break;
          case 1:
              System.out.println("Day "+i+" Part Time");
              wage = Employee_Wage_Per_Hour * PARTTIME_WORKING_HOUR;
              System.out.println("Employee Wage is : " + wage);
              hours=PARTTIME_WORKING_HOUR;
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
        	  totalWage=100*Employee_Wage_Per_Hour;
          }
          System.out.println("Total Wage for 20 Days:"+totalWage);
          System.out.println("Total Working Hours in 20 Days:"+totalHours);
         
	}

}
