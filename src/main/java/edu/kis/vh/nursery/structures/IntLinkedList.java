package edu.kis.vh.nursery.structures;

public class IntLinkedList implements StructuresInterface {

	private Node last;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return ERROR_VALUE;
		return last.value;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return ERROR_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
}
class Node {

	public final int value;
	public Node prev, next;

	public Node(int i) {
		value = i;
	}

}