package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
	private IntArrayStack intArrayStack = new IntArrayStack();
	private IntLinkedList list = new IntLinkedList();

	public DefaultCountingOutRhymer() {
	}

	public void countIn(int in) {
		list.push(in);
	}

	public boolean callCheck() {
		return list.isEmpty();
	}

	public boolean isFull() {
		return list.isFull();
	}

	public int peekaboo() {
		return list.top();
	}

	public int countOut() {
		return list.pop();
	}

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack){
		this.intArrayStack = intArrayStack;
	}
}
