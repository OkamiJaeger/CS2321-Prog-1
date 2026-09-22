/**
 * 
 */
package cs2321;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ruihong
 *
 */
public class JosephusTest {

	/**
	 * @throws java.lang.Exception
	 */

	/**
	 * Test method for {@link cs2321.Josephus#order(java.lang.String[], int)}.
	 */
	
	@Test
	public void testOrder() {
		Josephus game = new Josephus();
		String[] players = {"A", "B", "C", "D", "E", "F", "G"};
		int k = 3;
		String[] expectedOrder = {"C", "F", "B", "G", "E", "A", "D"};
		
		String[] actualOrder = game.order(players, k);
		
		assertArrayEquals(expectedOrder, actualOrder);
	}

}
