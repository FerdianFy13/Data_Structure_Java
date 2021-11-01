package insertionsort;

public class InsertionSortDescending {
    public static void main(String[] args) {

        // mendeklarasikan variable object
        InsertionSortDescending sort = new InsertionSortDescending();

        // mencetak string data awak
        System.out.println("Data Awal : ");

        // medeklarasikan variable array berdimensi satu
        int[] data = new int[12];

        // menghasilkan angka acak 1 - 12
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 12 + 1);
        }

        // mencatak data awal
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        // iterasi Sorting Insertion Descending
        int[] newdata = sort.insertionSortDesc(data);

        // mencetak data hasil sorting
        System.out.println("\n");
        System.out.println("Data hasil Insertion Sort Descending : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
    }

    // proses iterasi Sorting Insertion Descending
    int[] insertionSortDesc (int[] data) {
        int f = data.length;

        // int[] data =  new int[] f;
        int key, s;

        // iterasi perulangan data angka random
        for (int i = 0; i < f; i++) {
            key = data[i];
            s = i - 1;

            while (s >= 0 && data[s] < key) {
                data[s + 1] = data[s];
                s = s - 1;
            }
            data[s + 1] = key;
        }
        return data;
    }
}