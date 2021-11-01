package stack;

public class TrainStack {

  private int maxSize;
  private long[] stackArray;
  private int top;

  public TrainStack(int Size) {
    this.maxSize = Size;
    this.stackArray = new long[maxSize];
    this.top = -1;
  }

  public void push(long f) {
    if (isFull()) {
      System.out.println("stack sudah penuh");
    } else {
      top++;
      stackArray[top] = f;
    }
  }

  public long pop() {
    if (isEmpty()) {
      System.out.println("stack sudah habis");
      return -1;
    } else {
      int old_top = top;
      top--;
      return stackArray[old_top];
    }
  }

  public long peek() {
    return stackArray[top];
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == (maxSize));
  }
}
