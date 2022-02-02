package edu.kis.vh.nursery;

import edu.kis.vh.nursery.structures.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
				totalRejected++;
		else super.countIn(in);
	}

	public HanoiRhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
	}

	public HanoiRhymer() {
	}
}
