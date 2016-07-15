package assignment1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestPattern1 {
	Pattern1 p1;
	@Before
	public void setUp() throws Exception {
		p1 = new Pattern1();
	}

	@Test
	public void testSpaces() {
		assertEquals("    ", p1.spaces(1, 5));
		assertEquals(" ", p1.spaces(6, 5));
		assertEquals("   ", p1.spaces(2, 5));
		assertEquals("  ", p1.spaces(7, 5));
	}
	
	@Test
	public void testNumbers(){
		assertEquals("121", p1.numbers(2, 5));
		assertEquals("1234321", p1.numbers(6, 5));
		assertEquals("1234321", p1.numbers(4, 5));
	}
	
	@Test
	public void testDrawPattern(){
		String[] expected = {"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		assertArrayEquals(expected, p1.drawPattern(5));
	}
}
