package stack;

public class TrainStack_3a {
    public static void main(String[] args) {
        TrainStack_3b<String> fer = new TrainStack_3b<String>(10);
        fer.push("Pink");
        fer.push("Purple");
        fer.push("Red");

        System.out.println("Program Array Stack Order By Ferdian Firmansyah!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Push Stack : " + fer.toString());
        System.out.println("Size Stack : " + fer.size());
        fer.pop();
        System.out.println("Pop Stack : " + fer.toString());
        System.out.println("Peek Stack : " + fer.peek());
        System.out.println("Size Stack : " + fer.size());
    }
}