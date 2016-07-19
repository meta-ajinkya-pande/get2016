package assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestPattern2 {
	Pattern2 p2;
	@Before
	public void setUp() throws Exception {
		p2 = new Pattern2();
	}

	@Test
	public void testSpaces() {
		assertEquals("", p2.spaces(0));
		assertEquals(" ", p2.spaces(1));
		assertEquals("  ", p2.spaces(2));
		assertEquals("   ", p2.spaces(3));
		assertEquals("    ", p2.spaces(4));
	}
	
	@Test
	public void testnumber() {
		assertEquals("12345", p2.numbers(0, 5));
		assertEquals("1234", p2.numbers(1, 5));
		assertEquals("123", p2.numbers(2, 5));
		assertEquals("12", p2.numbers(3, 5));
		assertEquals("1", p2.numbers(4, 5));
	}
	
	@Test
	public void testDrawPattern() {
		String[] expected = {"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(expected, p2.drawPattern(5));
	}
	
}
