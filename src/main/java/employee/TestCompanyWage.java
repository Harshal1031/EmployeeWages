package employee;

public class TestCompanyWage {

	public static void main(String[] args) {
		CalculateEmployeeWages cw=new CalculateEmployeeWages("Harshal", 30, 20, 8, 4);
		cw.CalculateEmployeeWages();
		CalculateEmployeeWages cw2=new CalculateEmployeeWages("Shubham", 40, 26, 8, 4);
		cw2.CalculateEmployeeWages();

	}

}
