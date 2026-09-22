package cs2321;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircularArrayQueueTest {

	CircularArrayQueue<String> queue;
	
	@Before
	public void setUp() throws Exception {
		queue = new CircularArrayQueue<>();

	}

	@Test
	public void testCircularArrayQueue() {
		
	}

	@Test
	public void testSize() {
		queue.enqueue("Alice");
		queue.enqueue("Billy");
		
		assertEquals(2, queue.size());
	}

	@Test
	public void testIsEmpty() {
		assertEquals(true, queue.isEmpty());
	}

	@Test
	public void testFirst() {
		queue.enqueue("Shawn");
		queue.enqueue("Shaq");
		queue.enqueue("Shelly");
		assertEquals("Shawn", queue.first());
	}

	@Test
	public void testDequeue() {
		queue.enqueue("Shawn");
		assertEquals("Shawn", queue.dequeue());
		assertTrue(queue.isEmpty());
	}

	@Test
	public void testEnqueue() {
		for (int i = 0; i < 20; i++) {
			queue.enqueue("");
		}
		assertEquals(20, queue.size());
	}

	// TODO : create more test cases as you see needed. 
	@Test
	public void testWrapAround() {
		for (int i = 0; i < 10; i++) {
			queue.enqueue("");
		}
		for (int i = 0; i < 5; i++) {
			queue.dequeue();
		}
		for (int i = 0; i < 10; i++) {
			queue.enqueue("");
		}
		assertEquals(15, queue.size());
	}
}
