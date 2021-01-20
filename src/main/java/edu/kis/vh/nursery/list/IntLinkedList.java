package edu.kis.vh.nursery.list;

/**
 * Class of linked list
 */
public class IntLinkedList {

	private Node last;
	private static final int MINUSONE = -1;

	/**
	 * Class's constructor
	 */
	public IntLinkedList(){}

	/**
	 * Method that adds a new element to the list
	 * @param i a new number
	 */
	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	/**
	 * Method that checks is the list empty
	 * @return true if is empty
	 */
	public boolean isEmpty() {
		return getLast() == null;
	}

	/**
	 * Method that checks is list full
	 * @return false if it's not full
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Method gets top value from the list
	 * @return value from the list
	 */
	public int top() {
		if (isEmpty())
			return MINUSONE;
		return getLast().getValue();
	}

	/**
	 * Method gets the last value and remove it from the list
	 * @return value from the list
	 */
	public int pop() {
		if (isEmpty())
			return MINUSONE;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	/**
	 * Method gets node from the list
	 * @return node from the list
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * Method set the node
	 * @param last node to be set
	 */
	public void setLast(Node last) {
		this.last = last;
	}

	/**
	 * Inner class of the node
	 */
	private class Node {

		private final int value;
		private Node prev, next;

		/**
		 * Constructor
		 * @param i value to set
		 */
		public Node(int i) {
			value = i;
		}

		/**
		 * Method returns value
		 * @return value
		 */
		public int getValue() {
			return value;
		}

		/**
		 * Method sets value
		 */
		public Node getPrev() {
			return prev;
		}

		/**
		 * Method sets prev node
		 * @param prev prev node
		 */
		public void setPrev(Node prev) {
			this.prev = prev;
		}

		/**
		 * Method returns node
		 * @return node
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * Method sets next node
		 * @param next next node
		 */
		public void setNext(Node next) {
			this.next = next;
		}
	}
}


