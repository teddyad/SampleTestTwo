package basicTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import basic.BasicCalculator;

public class BasicCalculatorTest {
	
	private BasicCalculator result = new BasicCalculator();
		
	@Test
	public void add() {
		double value = result.calculate(25, "+", 25);
		assertEquals(value, 50);
	}
	
	@Test
	public void subtract() {
		double value = result.calculate(25, "-", 25);
		assertEquals(value, 0);
	}
	
	@Test
	public void multiply() {
		double value = result.calculate(25, "x", 25);
		assertEquals(625, value);
	}
	
	@Test
	public void divid() {
		double value = result.calculate(25, "/", 25);
		assertEquals(value, 1);
	}
}
