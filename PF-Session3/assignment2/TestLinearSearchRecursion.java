package assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLinearSearchRecursion {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		LinearSearchRecursion ls = new LinearSearchRecursion();
		int[]array = {2,5,8,9,10,55,77};
		int[]array1 = {2,5,8,9,10,55,77,11};
		assertEquals(0, ls.linearSearch(0, 88, array));
		assertEquals(1, ls.linearSearch(0, 77, array1));
	}

}
