package assignment6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJoinArray {

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
		int[] ar1 = {1,3,5,7,10};
		int[] ar2 = {2,4,6,8,9};
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		JoinArray jn = new JoinArray();
		assertArrayEquals(expected, jn.joinTwoArray(ar1, ar2));
	}

}
