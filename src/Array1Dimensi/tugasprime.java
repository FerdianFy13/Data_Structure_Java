package Array1Dimensi;

import java.util.Scanner;

public class tugasprime {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Elemen Array 1 Dimensi : ");
        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }

        // perulangan isi array berdimensi satu
        for (int i = 0; i < array.length; i++) {
            boolean Prima = true;

            if (array[i] == 1)
                Prima = false;
            else {

                // memeriksa apakah bilangan tersebut termasuk bilangan prima
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        Prima = false;
                        break;
                    }
                }
            }

            // mencetak angka dari bilangan prima
            if (Prima)
                System.out.println(array[i] + " Bilangan Prima");
            else
                System.out.println(array[i] + " Bukan Bilangan Prima");
        }
    }
}