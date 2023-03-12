import static org.junit.Assert.*;

import org.junit.Test;

import model.Calculator;

public class TestCalculator {

	@Test
	public void testAddition() {
		assertEquals(15, Calculator.addition(10, 5), 0.01);
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(10, Calculator.subtraction(15, 5), 0.01);
	}

}
