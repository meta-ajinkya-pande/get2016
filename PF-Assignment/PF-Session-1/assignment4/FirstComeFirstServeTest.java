package assignment4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstComeFirstServeTest {

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
		FirstComeFirstServe o_fcfs = new FirstComeFirstServe();
		int[] arivaltime = {1,5,9,25};
		int[] jobsize = {12,7,2,5};
		int[][] expected = {{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		int[][] output = o_fcfs.fcfs(arivaltime, jobsize);
		isArrayEquals(expected,output);
	}

	private void isArrayEquals(int[][] expected, int[][] output) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++){
			assertArrayEquals(expected[i], output[i]);
		}
	}

}
