package Queue;

public class TrainQueue_1b {
    private int maxSize;
    private long[] queue;
    private int head;
    private int tail;
    private int item;

    public TrainQueue_1b(int size) {
        this.maxSize = size;
        this.queue = new long[maxSize];
        head = 0;
        tail = -1;
        item = 0;
    }

    public void add(long s) {
        if (isFull()) {
            System.out.println(" Antrian Sudah Pernuh Terisi");
        } else {
            tail++;
            queue[tail] = s;
            item++;
        }
    }

    public long remove() {
        long temp = queue[head];
        head++;
        if (head == maxSize) {
            head = 0;
        }
        item--;
        return temp;
    }

    public void constraint() {
        System.out.print("[ ");
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.print(" ]");
    }

    public long peekQueue() {
        return queue[head];
    }

    public boolean isEmpty() {
        return (item == 0);
    }

    public boolean isFull() {
        return (item == maxSize);
    }
}
