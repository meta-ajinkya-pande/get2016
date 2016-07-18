package assignment5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraySortedTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] input1 ={1,2,3,4,5};
		int[] input2={5,4,3,2,1};
		int[] input3={1,2,5,4,3};
		ArraySorted as = new ArraySorted();
		assertEquals(1, as.isSorted(input1));
		assertEquals(2, as.isSorted(input2));
		assertEquals(0, as.isSorted(input3));
	}

}
