package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

public class TrainStack_4b<F> implements TrainStack_4c<F> {
    private ArrayList<F> StackList = null;

    public TrainStack_4b() {
        StackList = new ArrayList<F>();
    }

    @Override
    public boolean isEmpty() {
        return StackList.size() == 0;
    }

    @Override
    public  F pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return  StackList.remove(StackList.size() - 1);
    }

    @Override
    public void push(F item) {
        StackList.add(item);
    }

    @Override
    public F peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return  StackList.remove(StackList.size() - 1);
    }

    @Override
    public int size() {
        return StackList.size();
    }

    public Iterator<F> iterator() {
        return StackList.iterator();
    }
}
