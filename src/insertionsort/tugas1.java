package insertionsort;

public class tugas1 {
    public static void main(String[] args) {

        // mendeklrasikan array berdimensi 1
        int[] data = new int[12];

        // mencetak string data awal
        System.out.println("Data Awal : ");

        // menghasilkan angka acak 1 - 12
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 12 + 1);
        }

        // mencatak data awal
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");

        // iterasi sorting insertion ascending
        int f = data.length;
        int key, s;

        // mencetak string Iterasi Insertion Sort Ascending
        System.out.println("Iterasi Insertion Sort Ascending : ");

        // iterasi perulangan data angka random
        for (int i = 1; i < f; i++) {
            key = data[i];
            s = i - 1;

            while (s >= 0 && data[s] > key) {
                data[s + 1] = data[s];
                s = s - 1;
            }
            data[s + 1] = key;

            // mencetak proses hasil dari iterasi
            System.out.print("Iterasi Ke- " +  i + " : ");
            for (int r = 0; r < data.length; r++) {
                System.out.print(data[r] + ",");
            }
            System.out.println("\n");
        }
    }
}