package assignment6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQueue {

	Queue<Integer> queue;
	@Before
	public void setUp() throws Exception {
		queue = new Queue<Integer>();
	}

	@Test
	public void testEnqueue() {
		queue.enqueue(20);
		queue.enqueue(16);
		queue.enqueue(35);
		
		assertEquals(true, queue.contains(20));
		assertEquals(true, queue.contains(16));
		assertEquals(true, queue.contains(35));
	}
	
	@Test
	public void testDequeue(){
		queue.enqueue(20);
		queue.enqueue(16);
		queue.enqueue(35);
		
		queue.dequeue();
		queue.dequeue();
		
		assertEquals(true, queue.contains(35));
		assertEquals(false, queue.contains(20));
		assertEquals(false, queue.contains(16));
		
	}
	
	@Test
	public void testIsEmpty(){
		assertEquals(true, queue.isEmpty());
	}
	
	@Test
	public void testSize(){
		queue.enqueue(20);
		queue.enqueue(16);
		queue.enqueue(35);
		
		assertEquals(3, queue.size());
	}
	
	@Test
	public void testGetFront(){
		queue.enqueue(20);
		queue.enqueue(16);
		queue.enqueue(35);
		
		assertEquals(20, (int)queue.getFront());
		queue.dequeue();
		assertEquals(16, (int)queue.getFront());
	}
}
