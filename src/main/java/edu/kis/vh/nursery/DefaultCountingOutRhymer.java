package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ERRORVALUE = -1;

	private static final int NUMBERSSIZE = 12;

	private final int[] NUMBERS = new int[NUMBERSSIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == ERRORVALUE;
	}
	public boolean isFull() {
		return total == NUMBERSSIZE - 1;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return ERRORVALUE;
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return ERRORVALUE;
		return NUMBERS[total--];
	}
}
