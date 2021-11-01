package stack;

import java.util.Stack;

public class TrainStack_1 {
    public static void main(String[] args) {
        Stack f = new Stack();
        f.push("Java");
        f.push("Source");
        f.push("and");

        System.out.println("Next : " + f.peek());
        f.push("Support");
        System.out.println(f.pop());
        f.push(".");
        int count = f.search("Java");

        while (count != -1 && count > 1) {
            f.pop();
            count--;
        }

        System.out.println(f.pop());
        System.out.println(f.empty());
    }
}
