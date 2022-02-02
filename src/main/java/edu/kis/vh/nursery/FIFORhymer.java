package edu.kis.vh.nursery;

import edu.kis.vh.nursery.structures.IntArrayStack;
import edu.kis.vh.nursery.structures.IntLinkedList;
import edu.kis.vh.nursery.structures.StructuresInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final StructuresInterface temp;

	public FIFORhymer() {
		temp = new IntLinkedList();
	}
	public FIFORhymer(IntArrayStack intArrayStack) {
		temp = intArrayStack;
	}
	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());
		int ret = temp.pop();
		while (!temp.isEmpty())
			countIn(temp.pop());
		return ret;
	}
}