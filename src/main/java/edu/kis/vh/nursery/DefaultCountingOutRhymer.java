package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ERROR_VALUE = -1;

	private static final int NUMBERS_SIZE = 12;

	private final int[] numbers = new int[NUMBERS_SIZE];

	private int total = -1;

	/**
	 * Get current size of stack
	 * @return size
	 */
	public int getTotal() {
		return total;
	}

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
	public boolean isFull() {
		return total == NUMBERS_SIZE - 1;
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
}
