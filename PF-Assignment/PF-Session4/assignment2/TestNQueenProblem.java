package assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNQueenProblem {

	NQueenProblem queen = new NQueenProblem();
	int[] expected1 = {0, 1, 0, 0};
	int[] expected2 = {0, 0, 0, 1};
	int[] expected3 = {1, 0, 0, 0};
	int[] expected4 = {0, 0, 1, 0};
	
	int[][] actual = new int[4][4];

	@Before
	public void setUp() throws Exception {
		
		actual = queen.queensProblem(actual, 0, 0, 4, 4);
	}

	@Test
	public void testQueens1() {
		assertArrayEquals(expected1, actual[0]);
	}
	
	@Test
	public void testQueens2() {
		assertArrayEquals(expected2, actual[1]);
	}
	
	@Test
	public void testQueens3() {
		assertArrayEquals(expected3, actual[2]);
	}
	
	@Test
	public void testQueens4() {
		assertArrayEquals(expected4, actual[3]);
	}
}
