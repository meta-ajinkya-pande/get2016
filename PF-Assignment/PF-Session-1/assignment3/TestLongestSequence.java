package assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLongestSequence {

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
		int [] input = {1,2,3,1,2,3,4,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7};
		int [] expecteds = {1,2,3,4,5,6,7,8,9};
		LongestSequence ls = new LongestSequence();
		assertArrayEquals(expecteds, ls.longestSequence(input));
	}

}
