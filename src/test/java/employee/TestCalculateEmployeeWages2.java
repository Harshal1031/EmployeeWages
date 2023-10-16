package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculateEmployeeWages2 {

    @Test
    public void testCalculateWageForFullTime() {
        CalculateEmployeeWages cw = new CalculateEmployeeWages("ITC", 30, 20, 8, 4);
        int expected = 30 * 8; 
        int actual = cw.calculateWage(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateWageForPartTime() {
        CalculateEmployeeWages cw = new CalculateEmployeeWages("Apple", 30, 20, 8, 4);
        int expected = 30 * 4; 
        int actual = cw.calculateWage(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateWageForAbsent() {
        CalculateEmployeeWages cw = new CalculateEmployeeWages("Nokia", 30, 20, 8, 4);
        int expected = 0; 
        int actual = cw.calculateWage(2);
        assertEquals(expected, actual);
    }

}
