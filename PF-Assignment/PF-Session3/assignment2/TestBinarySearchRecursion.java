package assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinarySearchRecursion {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BinarySearchRecursion bs =new BinarySearchRecursion();
		int[] array ={2,5,8,9,10,11,55,77};
		assertEquals(0, bs.binarySearch(array, 88, 0, array.length-1));
		assertEquals(1, bs.binarySearch(array, 77, 0, array.length-1));
	}

}
