package edu.kis.vh.nursery;

import edu.kis.vh.nursery.structures.IntArrayStack;
import edu.kis.vh.nursery.structures.IntLinkedList;
import edu.kis.vh.nursery.structures.StructuresInterface;

public class DefaultCountingOutRhymer {
	private final StructuresInterface stack;

	public DefaultCountingOutRhymer() {
		stack = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack){
		this.stack = intArrayStack;
	}

	public void countIn(int in) {
		stack.push(in);
	}

	public boolean callCheck() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.top();
	}

	public int countOut() {
		return stack.pop();
	}
}
