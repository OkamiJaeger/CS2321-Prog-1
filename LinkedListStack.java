package cs2321;

import net.datastructures.Stack;

public class LinkedListStack<E> implements Stack<E> {

    // Use a singly linked list to implement the stack.
    // The TOP of the stack will be represented by the HEAD of the linked list.
    // All stack operations (push, pop, top) should run in O(1) time.

    // Create a private inner Node class here.
    // Each node should store:
    //  - an element of type E
    //  - a reference to the next node in the list

    // Declare an instance variable to reference the top (head) node of the stack.
    // Declare an instance variable to keep track of the current size of the stack.
	
	private static class Node<E> {
		private E element;
		private Node<E> next;
		
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
	}
	
	private Node<E> head = null;
	private int size = 0;
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void push(E e) {
		Node<E> newNode = new Node<>(e, head);
		
		head = newNode;
		
		size++;	
	}

	@Override
	public E top() {
		if (!isEmpty()) {
			return head.element;
		}
		else {
			return null;
		}
	}

	@Override
	public E pop() {
		if (!isEmpty()) {
			E p = head.element;
			head = head.next;
			size--;
			return p;
		}
		else {
			return null;
		}
	}
}
