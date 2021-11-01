package projecttugas;

public class queueutest {
    String[] data;
    int head = 0;

    int no = 1;

    public queueutest(int limit) {
        data = new String[limit];
    }

    public void enqueue(String inputan) {
        if (head < data.length) {
            data[head] = inputan;
            head++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public String dequeue() {
        String tmp = data[0];
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        head--;
        if (head >= 0) {
            data[head] = null;
            no++;
        } else {
            no = 0;
            head = 0;
            return "Queue is empty";
        }
        return "No.00" + no + ", Nama : " + tmp;
    }

    public void print() {
        for (int i = 0;i < data.length; i++) {
            System.out.println("No.00" + (no++) + ", Nama : " + data[i]);
        }
    }

    public static void main(String[] args) {
        queueutest Cust = new queueutest(5);
        Cust.enqueue("Andre");
        Cust.enqueue("Katty");
        Cust.enqueue("Betrand");
        Cust.enqueue("Charley");
        Cust.enqueue("Mohammed ikrara");
        Cust.dequeue();
        Cust.print();
    }
}
