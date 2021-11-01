package stack;

public class appCobaStack {

  public static void main(String[] args) {
    TrainStack stack = new TrainStack(10);
    stack.push(20);
    stack.push(40);
    stack.push(60);
    stack.push(80);
    stack.push(100);
    stack.push(120);
    stack.push(140);
    stack.push(160);
    stack.push(180);
    stack.push(200);

    while (!stack.isEmpty()) {
      long value = stack.pop();
      System.out.println(value);
    }
  }
}