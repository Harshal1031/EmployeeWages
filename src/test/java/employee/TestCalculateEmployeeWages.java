package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculateEmployeeWages {
	CalculateEmployeeWages cl=new CalculateEmployeeWages();

	@Test
	public void testIfHoursPerMonthIsLessThan100() {
		assertTrue(cl.calculateWagehours());
 	}

}
