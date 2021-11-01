package Array2Dimensi;

public class latihan1 {
    public static void main(String[] args) {

        // deklarasi array 2 dimensi
        int [][] angka  = {
                {1, 5, 2, 9, 7},
                {2, 9, 8, 5, 9},
                {34, 17, 10, 89, 67},
                {14,71, 24, 92, 10},
        };
        System.out.println("Mencetak Array 2 Dimensi");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n");

        // menampilkan isi array dengan perulangan
        for (int i = 0; i < angka.length; i++) {
            for (int f = 0; f < angka.length; f++) {
                System.out.print(angka[i][f] + " ");
            }
            System.out.println();
        }
    }
}