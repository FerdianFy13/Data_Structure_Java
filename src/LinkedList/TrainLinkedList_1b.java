package LinkedList;

public class TrainLinkedList_1b {
    private TrainLinkedList_1c first;

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        TrainLinkedList_1c node = new TrainLinkedList_1c();
        node.data = data;
        node.next = first;
        first = node;
    }

    public void insertLast(int data) {
        TrainLinkedList_1c node = new TrainLinkedList_1c();
        node.data = data;
        TrainLinkedList_1c constraint = first;

        while (constraint.next != null) {
            constraint = constraint.next;
        }
        constraint.next = node;
    }

    public TrainLinkedList_1c removeFirst() {
        TrainLinkedList_1c temp = first;
        first = first.next;
        return temp;
    }

    public void viewList() {
        System.out.println("First ---> last");
        TrainLinkedList_1c constraint = first;

        while (constraint != null) {
            constraint.viewNode();
            constraint = constraint.next;
        }
        System.out.println();
    }
}
