package Array2Dimensi;

import java.util.Scanner;

public class bilanganprima {
    public static void main(String[] args) {
        Scanner ferdi = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris : ");
        int f = ferdi.nextInt();
        System.out.print("Masukkan Jumlah Kolom : ");
        int s = ferdi.nextInt();

        int array2d[][] = new int[f][s];
        int z = 0, c = 0;
        int total = f * s;
        int count = 0;

        for (int i = 2; count < total; i++) {

            int div = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }

            if (div == 2) {
                array2d[z][c++] = i;
                count++;
                if (c == s) {
                    z++;
                    c = 0;
                }
            }
        }

        System.out.println("Bilangan Prima Array 2 Dimensi :");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(array2d[i][j] + "\t");
            }
            System.out.println();
        }
    }
}