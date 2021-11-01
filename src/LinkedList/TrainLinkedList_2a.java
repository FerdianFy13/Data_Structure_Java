package LinkedList;

public class TrainLinkedList_2a {
    public static void main(String[] args) {
        TrainLinkedList_2b fir = new TrainLinkedList_2b();

        fir.addHead("k", 16);
        fir.addHead("i", 15);
        fir.addHead("a", 13);

        fir.addTail("f", 13);
        fir.addTail("e", 14);
        fir.addTail("r", 15);

        System.out.println("Program Single Linked List Order By Ferdian Firmansyah!!!");
        fir.view();
        System.out.println("\nDeleted Last Node Item");
        fir.removeLast();
        fir.view();
    }
}
