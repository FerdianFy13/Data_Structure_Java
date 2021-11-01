package stack;

import java.util.Scanner;

public class TrainStack_5a {
    public static void main(String[] args) {
        TrainStack_5b stack = new TrainStack_5b();
        String infix;
        Scanner fer = new Scanner(System.in);

        // (a + b) / (c - d) * e ^ f)
        // (A + B) / (C - D) * E ^ F)
        System.out.println("Infix Expression : ");
        infix = fer.nextLine();
        stack.SetInfixExp(infix);
        System.out.println("PostFix Expression : " + stack.ToPostFix());
    }
}
