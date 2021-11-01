package stack;

import java.util.EmptyStackException;

public class TrainStack_3b<F> implements TrainStack_3c<F> {
    F value[];
    int top0fStack;

    public TrainStack_3b(int size) {
        value = (F[]) new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return top0fStack == 0;
    }

    @Override
    public F pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top0fStack--;
        return value[top0fStack];
    }

    @Override
    public void push(F item) {
        value[top0fStack] = item;
        top0fStack++;
    }

    @Override
    public F peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top0fStack--;
        F temp = value[top0fStack];
        top0fStack++;
        return temp;
    }

    @Override
    public int size() {
        return top0fStack;
    }

    @Override
    public String toString() {
        String fir = "";
        for (int i = 0; i < top0fStack; i++) {
            fir += value[i] + " ";
        }
        return fir;
    }
}