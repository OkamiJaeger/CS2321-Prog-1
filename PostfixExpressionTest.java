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
public class PostfixExpressionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link cs2321.PostfixExpression#evaluate(java.lang.String)}.
	 */
	@Test
	public void testEvaluate() {
		// Tests the first example from the assignment instructions
        assertEquals(65, PostfixExpression.evaluate("13 5 *"));
        
        // Tests the second complex example from the assignment instructions
        assertEquals(94, PostfixExpression.evaluate("4 20 5 + * 6 -"));
	}

}
