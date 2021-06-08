import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calsi = new Calculator();

	@Test
	void testDoAdd() {
		// Calculator calsi=new Calculator();
		int expected = 10;
		int actual = calsi.doAdd(calsi.firstValue, calsi.secondValue);
		assertEquals(expected, actual);
	}

	@Test
	void testDoSub() {
		// Calculator calsi=new Calculator();
		int expected = 6;
		int actual = calsi.doSub(calsi.firstValue, calsi.secondValue);
		assertEquals(expected, actual);

	}

	@Test
	void testDoMul() {
		// Calculator calsi=new Calculator();
		int expected = 16;
		int actual = calsi.doMul(calsi.firstValue, calsi.secondValue);
		assertEquals(expected, actual);
	}

	@Test
	void testDoDiv() {
		// Calculator calsi=new Calculator();
		int expected = 4;
		int actual = calsi.doDiv(calsi.firstValue, calsi.secondValue);
		assertEquals(expected, actual);
	}

}
