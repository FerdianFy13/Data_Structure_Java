package searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {90, 8 , 4, 16, 50, 32, 65, 51, 88, 24, 27};

        // megurutkan data
        Arrays.sort(data);

        // nilai yang dicari
        int key = 50;

        // Binary Search Algorith
        int F = 0;
        int R = data.length - 1;
        boolean search = false;
        int s = 0;

        while (F <= R && !search) {
            s = (F + R) / 2;
            if (data[s] == key) {
                search = true;
            }
            if (key < data[s]) {
                R = s - 1;
            }
            if (key > data[s]) {
                F = s + 1;
            }
        }
        if (search) {
            System.out.println("maka " + s + " adalah indeks dari data yang dicari");
            System.out.println("data nya adalah " + data[s]);
        } else {
            System.out.println("data tidak ditemukan");
        }
    }
}
