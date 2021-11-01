package LinkedList;

public class TrainLinkedList_1a {
    public static void main(String[] args) {
        TrainLinkedList_1b linkedList = new TrainLinkedList_1b();
        linkedList.insertFirst(100);
        linkedList.insertFirst(80);
        linkedList.insertFirst(60);
        linkedList.insertFirst(40);

        System.out.println("Program Single Linked List Order By Ferdian Firmansyah!!!");
        System.out.println("First Result");
        linkedList.viewList();
        System.out.println("Second Result");
        linkedList.removeFirst();
        linkedList.viewList();
    }
}
