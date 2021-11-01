package stack;

public interface TrainStack_3c<F> {
    abstract boolean isEmpty();
    abstract F peek();
    abstract F pop();
    abstract void push(F item);
    abstract int size();
}