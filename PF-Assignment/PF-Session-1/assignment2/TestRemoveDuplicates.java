package assignment2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRemoveDuplicates {

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
		int[] expecteds = {1,2,3,4}; 
		int[] input = {1,1,2,2,3,1,4};
		RemoveDuplicates rm = new RemoveDuplicates();
		assertArrayEquals(expecteds, rm.removeDuplicate(input));
	}

}
