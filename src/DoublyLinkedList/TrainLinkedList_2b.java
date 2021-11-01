package DoublyLinkedList;

public class TrainLinkedList_2b {

    // parameter encapsulation
    private TrainLinkedList_2c head;
    private TrainLinkedList_2c tail;

    // this method displays the TrainLinkedList_2b cross forward and backward
    public void cross() {
        System.out.println();

        // cross forwards
        for (TrainLinkedList_2c f = head; f != null; f = f.getNext()) {
            System.out.println(f.getValue());
        }
        System.out.println("~~~~~~~~~~");

        // cross backwards
        for (TrainLinkedList_2c f = tail; f != null; f = f.getPrev()) {
            System.out.println(f.getValue());
        }
    }

    // this method adds a name into the doubly linked list
    public void add(String line) {
        // creates a new node
        TrainLinkedList_2c node = new TrainLinkedList_2c(line);

        // if the head is null set the head and tail equal to the new node
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
    }

    // this method removes a name into the doubly linked list
    public  void remove(String line) {
        TrainLinkedList_2c nodeRemove = find(line);
        removeNode(nodeRemove);
    }

    // this method checks to see if the name is available
    private TrainLinkedList_2c find(String element) {
        TrainLinkedList_2c current = head;

        // if the node is empty then make the program crash
        if (current == null) {
            throw new IllegalStateException("Doubly Linked List is empty!!!");
        }

        // otherwise, traverse through the program doubly linked list
        while (current != null) {
            if (current.getValue().equals(element)) {
                return current;
            }
            current = current.getNext();
        }

        // if element cant be found then throw an exception
        if (current == null) {
            throw new IllegalStateException("Doubly Linked List was not found!!!");
        }
        return null;
    }

    // this method finds node a name into the doubly linked list
    public TrainLinkedList_2c findNode() {
        TrainLinkedList_2c current = head;
        if (current == null) {
            throw new IllegalStateException("Doubly Linked List is empty!!!");
        }
        String littleElement = current.getValue();
        TrainLinkedList_2c littleNode = current;

        while (current != null) {
            if (littleElement.compareTo(current.getValue()) < 0) {
                littleNode = current;
                littleElement = littleNode.getValue();
            }
            current = current.getNext();
        }
        return littleNode;
    }

    // this method removes node a name into the doubly linked list
    public void removeNode(TrainLinkedList_2c nodeRemove) {
        TrainLinkedList_2c prev = nodeRemove.getPrev();
        TrainLinkedList_2c next = nodeRemove.getNext();

        // if to remove an item with no previous or next
        if (prev == null && next == null) {
            head = null;
            tail = null;
        } else if (prev == null) {
            head = next;
            head.setPrev(null);
        } else if (tail.getNext() == next) {
            tail = prev;
            tail.setNext(null);
        } else {
            prev.setNext(next);
            prev.setPrev(prev);
        }
    }

    // this method boolean a name into the doubly linked list
    public boolean isEmpty() {
        return head == null;
    }

    // this method sort a name into the doubly linked list
    public void sort() {
        TrainLinkedList_2b sorting = new TrainLinkedList_2b();
        if (isEmpty()) {
            return;
        } while (!isEmpty()) {
            TrainLinkedList_2c little = findNode();
            sorting.add(little.getValue());
            remove(little.getValue());
        }
        head = sorting.head;
        tail = sorting.tail;
    }
}
