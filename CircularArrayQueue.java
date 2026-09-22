/**
 * 
 */
package cs2321;

import net.datastructures.Queue;

/**
 * @author ruihong-adm
 * @param <E>
 *
 */


public class CircularArrayQueue<E> implements Queue<E> {

	// Use an array to store the queue elements.
	// The array should be treated as circular (wrap around at the end).
	// 
	// Maintain:
	//  - an array of type E to store elements
	//  - an index for the front of the queue
	//  - an integer to track the current size of the queue or an index for the end of the queue. 
	//
	// The initial capacity of the array should be 16.
	// When the array becomes full, create a new array with double
	// the capacity and copy elements in correct queue order.

	E[] data;
	int front;
	int size;
	int capacity;
	
	public CircularArrayQueue() {
		// TODO: create a new queue with capacity 16. If full, then double the capacity. 
		capacity = 16;
		front = 0;
		size = 0;
		
		data = (E[]) new Object[capacity];

	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}


	@Override
	public E first() {
		return data[front];
	}

	@Override
	public E dequeue() {
		E temp = data[front];
		data[front] = null;
		front = (front + 1) % capacity;
		size--;
		return temp;
	}

	@Override
	public void enqueue(E e)  {
		if (size == capacity) {
			capacity = capacity * 2;
			E[] newData;
			newData = (E[]) new Object[capacity];
			
			for (int i = 0; i < size; i++) {
				newData[i] = data[(front + i) % (capacity / 2)];
			}
			front = 0;
			data = newData;
		}
		int avail = (front + size) % capacity;
		data[avail] = e;
		size++;
	}

	    
}
