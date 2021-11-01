package Array2Dimensi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ferdianf {
    public static void main(String[] args) {
        ferdianf fe = new ferdianf();
        fe.belajar();
        BufferedReader fer;
        BufferedReader fir;
        String sil;
        String via;

        // nama file csv Kelas1GG.csv dengan 26 baris 2 kolom
        String fileName = "friend.csv";
        String fileName2 = "family.csv";

        // array menampung value pada array 2 dimensi
        String[][] value = new String[3][2];
        String[][] data = new String[2][2];

        int i = 0;
        try {
            fer = new BufferedReader(new FileReader(fileName));
            while ((sil = fer.readLine()) != null) {

                // memisahkan 2 kolom dengan split ","
                String[] nilai = sil.split(",");
                value[i][0] = nilai[0]; // simpan value baris i kolom 0
                value[i][1] = nilai[1]; // simpan value baris i kolom 1
                i++;
            }
            fer.close();

            int f = 0;
            try {
                fir = new BufferedReader(new FileReader(fileName2));
                while ((via = fir.readLine()) != null) {

                    // memisahkan 2 kolom dengan split ","
                    String[] nilai2 = via.split(",");
                    data[f][0] = nilai2[0]; // simpan data baris f kolom 0
                    data[f][1] = nilai2[1]; // simpan data baris f kolom 1
                    f++;
                }
                fir.close();

            } catch (IOException j) {
                j.printStackTrace();
            }

            } catch (IOException u) {
                u.printStackTrace();
            }

            System.out.println("Mencetak Value Array 2 Dimensi");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("\n");

            // menampilkan isi array 2 dimensi dari perulangan
            for (int l = 0; l < value.length; l++) {
                for (int v = 0; v < value[0].length; v++) {
                    System.out.print(value[l][v] + " ");
                }
                System.out.println();
            }
            for (int o = 0; o < data.length; o++) {
                for (int n = 0; n < data[0].length; n++) {
                    System.out.print(data[o][n] + " ");
                }
                System.out.println();
            }
        }
        public void belajar () {
            System.out.println("hallo ferdi");
    }
    }