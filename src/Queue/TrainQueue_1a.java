package Queue;

public class TrainQueue_1a {
    public static void main(String [] args) {
        TrainQueue_1b TrainQueue = new TrainQueue_1b(10);
        TrainQueue.add(100);
        TrainQueue.add(200);
        TrainQueue.add(300);
        TrainQueue.add(400);
        TrainQueue.add(500);
        TrainQueue.add(600);
        TrainQueue.add(700);
        TrainQueue.add(800);
        TrainQueue.add(900);
        TrainQueue.add(1000);
        TrainQueue.constraint();
    }
}
