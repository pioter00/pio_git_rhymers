package edu.kis.vh.nursery.structures;

public class IntArrayStack implements StructuresInterface {

	private static final int NUMBERS_CAPACITY = 12;

	private final int[] numbers = new int[NUMBERS_CAPACITY];

	private int total = -1;


	/**
	 * Add value to stack
	 * @param in value
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Check if stack is empty
	 * @return true if stack is empty otherwise false
	 */
	public boolean callCheck() {
		return total == -1;
	}

	/**
	 * Check if stack is full
	 * @return true if stack is full otherwise false
	 */
	@Override
	public boolean isFull() {
		return total == NUMBERS_CAPACITY - 1;
	}

	/**
	 * Get value from the stack
	 * @return value
	 */
	public int peekaboo() {
		if (callCheck())
			return ERROR_VALUE;
		return numbers[total];
	}

	/**
	 * Remove value from the stack
	 * @return value
	 */
	public int countOut() {
		if (callCheck())
			return ERROR_VALUE;
		return numbers[total--];
	}

	@Override
	public void push(int i) {
		countIn(i);
	}

	@Override
	public boolean isEmpty() {
		return callCheck();
	}

	@Override
	public int top() {
		return peekaboo();
	}

	public int pop() {
		return countOut();
	}
}
