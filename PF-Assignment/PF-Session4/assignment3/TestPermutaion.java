package assignment3;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestPermutaion {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		List<String> expected = new ArrayList<String>(Arrays.asList("ABCD",
				"ABDC", "ACBD", "ACDB", "BACD", "BADC", "BCAD", "BCDA", "BDCA",
				"BDAC", "CBDA", "CBAD", "CDBA", "CDAB", "CADB", "CABD", "DCAB",
				"DCBA", "DACB", "DABC", "DBAC", "DBCA", "ADBC", "ADCB"));
		assertEquals(expected, new Permutaion().getInput("ABCD"));
	}
}
