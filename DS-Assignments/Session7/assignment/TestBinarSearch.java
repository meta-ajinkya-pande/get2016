package assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestBinarSearch {
	
	private Binarysearch bs ;
	
	@Before
	public void setUp() throws Exception {
		bs = new Binarysearch();
	}

	@Test
	public void test() {
		int[] inputArray = {20,21,21,21,23,23,25,26,26,28};
		assertEquals(1, bs.search(inputArray, 21));
		assertEquals(4, bs.search(inputArray, 23));
		assertEquals(9, bs.search(inputArray, 28));
		// -1 for not present in array
		assertEquals(-1, bs.search(inputArray, 29));
	}

}
