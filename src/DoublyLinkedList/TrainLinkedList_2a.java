package DoublyLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrainLinkedList_2a {
    public static void main(String[] args) throws FileNotFoundException {
        TrainLinkedList_2b fer = new TrainLinkedList_2b();
        fer = insert("kelas1g.txt");
        fer.cross();
    }

    public static TrainLinkedList_2b insert(String fileName) throws FileNotFoundException {
        TrainLinkedList_2b iterasi = new TrainLinkedList_2b();
        try (Scanner file = new Scanner(new File(fileName))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                if (line.startsWith("delete ")) {
                    String element = line.substring("delete ".length());
                    iterasi.remove(element);
                    continue;
                }
                iterasi.add(line);
            }
            iterasi.sort();
        }
        return iterasi;
    }
}
