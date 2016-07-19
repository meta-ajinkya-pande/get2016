package assignment1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestRemainderRecusion {
	RemainderRecursion rc;
	@Before
	public void setUp() throws Exception {
		rc = new RemainderRecursion();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRemainderwithexception() {
		assertEquals("",rc.rem(2, 0));
	}
	@Test
	public void testRemainder(){
		assertEquals(0, rc.rem(2, 1));
		assertEquals(1, rc.rem(100, 3));
	}
}
