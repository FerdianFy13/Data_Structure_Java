package insertionsort;

public class TimeInsertionSort {
    public static void main(String[] args) {

        // fungsi dari insertionSort pada class TimeInsertionSort
        TimeInsertionSort insertionSort = new TimeInsertionSort();

        // mendeklarasikan variable array data secara random
        int[] data = insertionSort.iRandom(2003);

        // mencetak data sebelum diurutkan
        System.out.println("Data Sebelum Diurutkan: ");
        insertionSort.tampil(data);

        // menampilkan waktu pemrosesan program menggunakan fungsi currentTimeMillis
        long start =  System.currentTimeMillis();
        insertionSort.insertionSortAsc(data);
        long end = System.currentTimeMillis();

        // mencetak data sebelum diurutkan
        System.out.println("Data Sesudah Diurutkan : ");
        insertionSort.tampil(data);

        // mencetak waktu hasil dari pemrosesan program yang dijalankan
        System.out.println("Waktu yang dibutuhkan : " + (end - start) + " miliseconds");

    }

    // method iRandom untuk menghasilkan angka random pada program
    public int[] iRandom(int f) {

        // mendeklarasikan variable array data f
        int data[] = new int[f];

        // perulangan untuk menghasilkan angka random pada program
        for (int a = 0; a < data.length; a++) {
            data[a] = (int) (Math.random() * f + 1);
        }

        // pengembalian variable array data
        return data;
    }
    void tampil (int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // method untuk pemrosesan insertionSortAsc
    public int[] insertionSortAsc (int[] data) {
        int f = data.length;

        // int[] data =  new int[] f;
        int key, s;

        // iterasi perulangan data angka random
        for (int i = 0; i < f; i++) {
            key = data[i];
            s = i - 1;

            while (s >= 0 && data[s] > key) {
                data[s + 1] = data[s];
                s = s - 1;
            }
            data[s + 1] = key;
        }
        return data;
    }
}