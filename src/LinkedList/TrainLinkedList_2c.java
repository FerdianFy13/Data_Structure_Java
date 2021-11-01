package LinkedList;

public class TrainLinkedList_2c {
    String name;
    int age;
    TrainLinkedList_2c after;

    public TrainLinkedList_2c() {
        name = "fer";
        age = 18;
        after = null;
    }

    public TrainLinkedList_2c(String name, int age) {
        this.name = name;
        this.age = age;
        after = null;
    }

    public void view() {
        System.out.print("Name : " + name + " Age : " + age);
    }
}
