package selectionsort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SortSelectionCSV {
    public static void main(String[] args) {

        // fungsi array list
        ArrayList<String> selectionToSort = new ArrayList<String>();
        String readFile = "sortjava.csv";
        BufferedWriter writer = null;

        try (BufferedReader br = new BufferedReader(new FileReader(readFile))) {
            String line = br.readLine();
            while (line != null) {
                selectionToSort.add(line);
                line = br.readLine();
            }
            writer = new BufferedWriter(new FileWriter("tugas1.csv"));
        } catch (IOException f) {
            f.printStackTrace();
        }

        String[] deskripFile = selectionToSort.toArray(new String[]{});
        int size = deskripFile.length;
        int smallIndex = 0;
        String temp = null;
        System.out.println("File Sorting");

        // Temukan referensi string yang harus ditempatkan di setiap array
        for (int i = 0; i < deskripFile.length - 1; i++) {
            smallIndex = i;
            for (int s = i + 1; s < size; s++) {
                if (deskripFile[s].compareTo(deskripFile[smallIndex]) > 0) {
                    smallIndex = s;
                }
            }

            temp = deskripFile[i];
            deskripFile[i] = deskripFile[smallIndex];
            deskripFile[smallIndex] = temp;
        }
        System.out.println(Arrays.toString(deskripFile));
    }
}
