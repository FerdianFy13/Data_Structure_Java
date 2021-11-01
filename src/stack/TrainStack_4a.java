package stack;

import java.util.Iterator;

public class TrainStack_4a {
    public static void main(String[] args) {
        TrainStack_4b<String> fer = new TrainStack_4b<String>();
        fer.push("Pink");
        fer.push("Purple");
        fer.push("Red");

        System.out.println("Program Array List Stack Order By Ferdian Firmansyah!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Size stack : " + fer.size());

        fer.pop();
        System.out.println("Peek stack : " + fer.peek());
        System.out.println("Size stack : " + fer.size());

        Iterator fir = fer.iterator();
        while (fir.hasNext()) {
            System.out.println("Iterator Value : " + fir.next());
        }
    }
}