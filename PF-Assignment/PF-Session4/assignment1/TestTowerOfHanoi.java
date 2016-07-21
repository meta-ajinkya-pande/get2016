package assignment1;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestTowerOfHanoi {
	TowerOfHanoi toh;

	@Before
	public void setUp() throws Exception {
		toh = new TowerOfHanoi();
	}

	@Test
	public void test() {
		List<String> expecteds1 = new ArrayList<String>(Arrays.asList(
				"Move Disk 1 from A to C", "Move Disk 2 from A to B",
				"Move Disk 1 from C to B", "Move Disk 3 from A to C",
				"Move Disk 1 from B to A", "Move Disk 2 from B to C",
				"Move Disk 1 from A to C"));
		List<String> expecteds2 = new ArrayList<String>(
				Arrays.asList("Move Disk 1 from A to C"));
		List<String> expecteds3 = new ArrayList<String>(Arrays.asList(
				"Move Disk 1 from A to B", "Move Disk 2 from A to C",
				"Move Disk 1 from B to C"));
		assertEquals(expecteds2, toh.tower(1));
		assertEquals(expecteds1, toh.tower(3));
		assertEquals(expecteds3, toh.tower(2));
	}
}
