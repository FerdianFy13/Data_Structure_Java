package Array1Dimensi;

import java.util.Arrays;

public class PercobaanArray2 {
    public static void main(String[] args) {
        int angka[] = {20, 90, 120, 8, 15, 72, 66, 42};
        int f = angka.length;
        int s, i, l;
        System.out.print("Angka Didapatkan : ");

        for (s = 0; s < f; s++) {
            System.out.print(" " + angka[s]);
        }
        System.out.println("\n");
        System.out.print("Mengurutkan Iterasi Angka : ");

        Arrays.sort(angka);;
        for (s = 0; s < f; s++) {
            System.out.print(" " + angka[s]);
        }
    }
}