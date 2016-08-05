package assignment6;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class TestLinkListRecursion {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		LinkedList<Integer> listExpected = new LinkedList<Integer>();
		listExpected.add(11);
		listExpected.add(13);
		listExpected.add(18);
		listExpected.add(20);
		listExpected.add(45);
		
		LinkListRecursion<Integer> inputList = new LinkListRecursion<Integer>();
		inputList.add(45);
		inputList.add(18);
		inputList.add(20);
		inputList.add(11);
		inputList.add(13);
		
		assertEquals(listExpected, inputList.getList());
	}

}
