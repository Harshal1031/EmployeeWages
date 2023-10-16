package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculateEmployeeWages {
	CalculateEmployeeWages cl=new CalculateEmployeeWages();
  @Test
  public void testToCalculateTheWageForTwentyDays() {
	  int fullDays=10;
	  int partTime=0;
	  int absent=10;
	  assertEquals(1600,cl.theWageForTwentyDays(fullDays,partTime,absent));
  }
  @Test
  public void testToCalculateTheWorkingHoursForTheGivenWages() {
	  int wages=2000;
	  assertEquals(100,cl.calculateTheWorkingHoursForTheGivenWages(wages));
  }
    



}
