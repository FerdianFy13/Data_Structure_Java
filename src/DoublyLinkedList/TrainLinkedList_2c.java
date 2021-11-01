package DoublyLinkedList;

public class TrainLinkedList_2c {

    // parameter encapsulation
    private TrainLinkedList_2c prev;
    private TrainLinkedList_2c next;
    private String name;

    // constructor
    TrainLinkedList_2c(String name) {
        this.name = name;
    }

    // this function returns the name
    public String getValue() {
        return this.name;
    }

    // this function changes the value
    public void setValue(String name) {
        this.name = name;
    }

    // this function returns the next TrainLinkedList_2c
    public TrainLinkedList_2c getNext() {
        return this.next;
    }

    // this function returns the previous TrainLinkedList_2c
    public TrainLinkedList_2c getPrev() {
        return  this.prev;
    }

    // this function sets the next TrainLinkedList_2c
    public void setNext(TrainLinkedList_2c next) {
        this.next = next;
    }

    // this function sets the previous TrainLinkedList_2c
    public void setPrev(TrainLinkedList_2c prev) {
        this.prev = prev;
    }
}
