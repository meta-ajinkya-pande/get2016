package assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGcdRecursion {
	GcdRecursion gcds;
	@Before
	public void setUp() throws Exception {
		gcds = new GcdRecursion();
	}

	@Test
	public void test() {
		assertEquals(1, gcds.gcd(100, 3));
		assertEquals(6, gcds.gcd(12, 18));
		assertEquals(1, gcds.gcd(2, 1));
	}

}
