package edu.kis.vh.nursery.structures;

public interface StructuresInterface {
    int ERROR_VALUE = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
