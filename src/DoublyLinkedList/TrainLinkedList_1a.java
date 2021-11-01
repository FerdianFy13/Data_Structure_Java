package DoublyLinkedList;

public class TrainLinkedList_1a {
    public static void main(String[] args) {
        TrainLinkedList_1b fer = new TrainLinkedList_1b();

        // enter data in the program double linked list
        fer.insertFirst(1);
        fer.insertFirst(2);
        fer.insertLast(3);
        fer.insertLast(4);
        fer.insertFirst(5);

        // display double linked list input data
        fer.displayListForward();
    }
}
