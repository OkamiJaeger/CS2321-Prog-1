package cs2321;

public class Josephus{
	/**
	 * All persons sit in a circle. When we go around the circle, initially starting
	 * from the first person, then the second person, then the third... 
	 * we count 1,2,3,.., k-1. The next person, that is the k-th person is out. 
	 * Then we restart the counting from the next person, go around, the k-th person 
	 * is out. Keep going the same way, when there is only one person left, she/he 
	 * is the winner. 
	 *  
	 * @parameter persons  an array of string which contains all player names.
	 * @parameter k  an integer specifying the k-th person will be kicked out of the game
	 * @return return a array in the order when the players were out of the game. 
	 *         The last one in the array is the winner.  
	 */
	public String[] order(String[] persons, int k ) {
		CircularArrayQueue<String> queue = new CircularArrayQueue<>();
		String[] result = new String[persons.length];
		
		// Lines Everyone up
		for (String person : persons) {
			queue.enqueue(person);
		}
		
		int resultIndex = 0;
		
		// Runs until the queue is empty
		while (!queue.isEmpty()) {
			// Puts the person just before k back to the end of the line
			for (int i = 0; i < k - 1; i++) {
				queue.enqueue(queue.dequeue());
			}
			
			// Removes k
			result[resultIndex] = queue.dequeue();
			resultIndex++;
		}		
		return result;
	}	
}
