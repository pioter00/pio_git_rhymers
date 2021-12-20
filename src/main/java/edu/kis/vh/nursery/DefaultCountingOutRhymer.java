package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int fullCheck = 11;

	private static final int minusJeden = -1;

	private static final int numCount = 12;

	private int[] numbers = new int[numCount];

	public int total = minusJeden;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == minusJeden;
	}
	public boolean isFull() {
		return total == fullCheck;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return minusJeden;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return minusJeden;
		return numbers[total--];
	}
}
