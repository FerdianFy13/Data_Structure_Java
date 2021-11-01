package Array2Dimensi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class latihan2 {
    public static void main(String[] args) {
        BufferedReader fer;
        String sil;

        // nama file csv Kelas1G dengan jumlah 27 mahasiswa
        String fileName = "Kelas1G.csv";

        // array menampung value array
        String[] value = new String[27];

        int i = 0;
        try {
            fer = new BufferedReader(new FileReader(fileName));
            while ((sil = fer.readLine()) !=null) {
                value[i]=sil;
                i++;
            }
            fer.close();

        } catch (IOException v) {
            v.printStackTrace();
        }
        System.out.println("Mencetak Value Array");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n");

        // menampilkan isi array dengan perulangan
        for (int f = 0; f < value.length; f++) {
            System.out.println(value[f]);
        }
    }
}