package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ERROR_VALUE = -1;

	private static final int NUMBERS_SIZE = 12;

	private final int[] numbers = new int[NUMBERS_SIZE];

	private int total = -1;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == ERROR_VALUE;
	}
	public boolean isFull() {
		return total == NUMBERS_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERROR_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR_VALUE;
		return numbers[total--];
	}
}
