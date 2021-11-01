package selectionsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class latihan {
    public static void main(String[] args) throws FileNotFoundException {

        // Pemanggilan function SelectionAsc dari class SortSelectionAsc
        SortSelectionAsc SelectionAsc = new SortSelectionAsc();

        int[] ferdi = readFiles("sortjava.csv");
        System.out.println("data" + ferdi);

        // menghitung lama waktu execute menggunakan currentTimeMillis
        long start =  System.currentTimeMillis();
        long end = System.currentTimeMillis();

        // menampilkan waktu execute dengan (end - start)
        System.out.println("Waktu yang dibutuhkan : " + (end - start) + " miliseconds");
    }
    public static int[] readFiles(String file) throws FileNotFoundException {
        File f = new File("sortjava.csv");
        Scanner x = new Scanner(f);

        int[] ferdi = new int[12];
        Scanner ff = new Scanner(f);

        for (int i = 0; i < ferdi.length; i++) {
            ferdi[i] = ff.nextInt();
        }
        return ferdi;
    }

    // function pengurutan data SelectionSortAsc secara ascending
    public int[] SelectionSortAsc (int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int s = i + 1; s < data.length; s++) {
                if (data[s] < data[min]) {
                    min = s;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
        return data;
    }
}
