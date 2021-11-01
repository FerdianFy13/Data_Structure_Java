package LinkedList;

public class TrainLinkedList_2b {
    TrainLinkedList_2c head;

    public TrainLinkedList_2b() {
        head = null;
    }

    public TrainLinkedList_2b(TrainLinkedList_2c f) {
        head = f;
    }

    TrainLinkedList_2c first = null;
    TrainLinkedList_2c last = null;

    public void addHead(String name, int age) {
        TrainLinkedList_2c object = new TrainLinkedList_2c(name, age);
        object.after = head;

        if (first == null) {
            first = object;
        }
        head = object;
        last = head;
    }

    public void view() {
        TrainLinkedList_2c pos = head;
        while (pos != null) {
            pos.view();
            pos = pos.after;
            System.out.println();
        }
    }

    public void addTail(String name, int age) {
        TrainLinkedList_2c atEndValue = new TrainLinkedList_2c(name, age);
        first.after = atEndValue;
        first = atEndValue;
    }

    public void removeFirst() {
        if (head.after != null) {
            head = head.after;
        }
    }

    public void removeLast() {
        TrainLinkedList_2c start = head;
        TrainLinkedList_2c prev = null;
        while (head != null) {
            prev = head;
            head = head.after;
        }
        prev.after = null;
        head = prev;
    }

    public TrainLinkedList_2c search(String name) {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return (head.toString().length());
    }
}
