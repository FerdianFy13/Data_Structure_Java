package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class TrainQueue_2 {
    private static int sizes;
    private static Queue<Integer> TrainQueue;

    public static void main(String[] args) {
        System.out.print("What is the Expected Queue Size : ");
        sizes = insertData();
        createQueue();
        readQueue();
        writeQueue();
    }

    private static void createQueue() {
        TrainQueue = new LinkedList<Integer>();
    }

    private static int insertData() {
        BufferedReader fer = new BufferedReader(new InputStreamReader(System.in));
        String insertNumber = null;

        try {
            insertNumber = fer.readLine();
        } catch (IOException f) {
            f.printStackTrace();
        }

        int data = Integer.valueOf(insertNumber).intValue();
        return data;
    }

    private static void writeQueue() {
        Integer data;
        System.out.println("\nOrder keluar elemen dari Queue : ");

        for (int i = 0; i < sizes; i++) {
            data = TrainQueue.remove();
            System.out.println("Data to-" + (i + 1) + " : " + data);
        }

        data = TrainQueue.size();
        System.out.println("Queue size now is " + data);
    }

    private static void readQueue() {
        Integer data;
        for (int i = 0; i < sizes; i++) {
            System.out.print("Data to-" + (i + 1) + " : ");
            data = insertData();
            TrainQueue.add(data);
        }
        data = TrainQueue.size();
        System.out.println("Queue size now is " + data);
    }
}
