package assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLargestDigitRecursion {
	LargestDigitRecursion ld ;
	@Before
	public void setUp() throws Exception {
		ld = new LargestDigitRecursion();
	}

	@Test
	public void test() {
		assertEquals(2, ld.largestDigit(2, 0));
		assertEquals(9, ld.largestDigit(1257369, 0));
		assertEquals(4, ld.largestDigit(444, 0));
	}

}
