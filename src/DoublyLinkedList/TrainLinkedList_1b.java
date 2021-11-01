package DoublyLinkedList;

public class TrainLinkedList_1b {
    private TrainLinkedList_1c first;
    private TrainLinkedList_1c last;

    // check whether linked list is empty or not
    public boolean isEmpty() {
        return (first == null);
    }

    // insert data at the beginning
    public void insertFirst(int data) {
        TrainLinkedList_1c node = new TrainLinkedList_1c();
        node.data = data;

        // check if the data is empty
        if (isEmpty()) {
            last = node;
        } else {
            first.before = node;
        }
        node.after = first;
        first = node;
    }

    // insert data at the end
    public void insertLast(int data) {
        TrainLinkedList_1c node = new TrainLinkedList_1c();
        node.data = data;

        // check if the data is empty
        if (isEmpty()) {
            first = node;
        } else {
            last.after = node;
            node.before = last;
        }
        last = node;
    }

    // insert at a certain position
    public boolean insertKey(int key, int data) {
        TrainLinkedList_1c node = new TrainLinkedList_1c();
        node.data = data;

        TrainLinkedList_1c current = first;
        while (current.data != key) {
            current = current.after;
            if (current == null)
                return false;
        }

        if (current == last) {
            node.after = null;
            last = node;
        } else {
            node.after = current.after;
            current.after.before = node;
        }
        node.before = current;
        current.after = node;
        return true;
    }

    // delete data at the beginning
    public TrainLinkedList_1c deleteFirst() {
        TrainLinkedList_1c temp = first;

        if (first.after == null) {
            last = null;
        } else {
            first.after.before = null;
        }
        first = first.after;
        return temp;
    }

    // delete data at the end
    public TrainLinkedList_1c deleteLast() {
        TrainLinkedList_1c temp = last;

        if (first.after == null) {
            first = null;
        } else {
            last.before.after = null;
        }
        last = last.after;
        return temp;
    }

    // delete key data
    public TrainLinkedList_1c deleteKey(int key) {
        TrainLinkedList_1c current = first;

        while (current.data != key) {
            current = current.after;
            if (current == null)
                return null;
        }
        if (current == first)
            first = current.after;
        else
            current.before.after = current.after;
        if (current == last)
            last = current.before;
        else
            current.before.after = current.before;
        return current;
    }

    // display data in forward
    public void displayListForward() {
        System.out.println("Data linkeed list display list forward");
        TrainLinkedList_1c current = first;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes od doubly Linked List");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.after;
        }
    }

    // show data in backward
    public void displayListBackward() {
        System.out.println("data linked list display list backward");
        TrainLinkedList_1c current = last;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of double linked list");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.before;
        }
    }
}
