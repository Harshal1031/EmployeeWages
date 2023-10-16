package employee;

public class CompanyEmpWage {
     String companyName;
 	 int employeeWagePerHour;
     int daysPerMonth ;
     int fulldayWorkingHours;
     int partTimeWorkingHours;
	public CompanyEmpWage(String companyName, int employeeWagePerHour, int daysPerMonth, int fulldayWorkingHours,
			int partTimeWorkingHours) {
		super();
		this.companyName = companyName;
		this.employeeWagePerHour = employeeWagePerHour;
		this.daysPerMonth = daysPerMonth;
		this.fulldayWorkingHours = fulldayWorkingHours;
		this.partTimeWorkingHours = partTimeWorkingHours;
	}



}
