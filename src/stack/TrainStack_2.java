package stack;

import java.util.Iterator;
import java.util.Stack;

public class TrainStack_2 {
    public static void main(String[] args) {
        Stack<String> fer = new Stack<String>();
        fer.push("a");
        fer.push("c");
        fer.push("e");
        fer.push("d");

        Iterator fir = fer.iterator();
        System.out.println("Size Before Pop() : " + fer.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        while (fir.hasNext()) {
            String Value = (String) fir.next();
            System.out.println("Iterator value : " + Value);
        }

        // get and remove last elemen from stack
        String value = (String) fer.pop();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Value : " + value);
        System.out.println("Size after pop() : " + fer.size());
        String values = (String) fer.peek();
        System.out.println("Peek Stack : " + values);
        long count = (long) fer.stream().count();
        System.out.println("Count Stack : " + count);
        System.out.println("\nOrder By Ferdian Firmansyah");
    }
}