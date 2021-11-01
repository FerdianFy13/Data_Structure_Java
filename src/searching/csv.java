package searching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class csv {
    public static void SequentialSearch(String[] value, int[] fileName) {
        String key = "";

        int i = 0;
        boolean search = false;

        while (!search && i < value.length) {
//            if (data[i].equals(key))
            if (value[i].equalsIgnoreCase(key))
                search = true;
            else
                i++;
        }
        for (int l = 0; l < value.length; l++) {
            for (int v = 0; v < value.length; v++) {
               if (search) {
                   System.out.println(+ l + "Data" + v);
               }
//                System.out.print(value[l][v] + " ");
            }
        }
        if (search) {
            System.out.println("data ditemukan");
            System.out.println(+ i +" adalah index dari data yang dicari");
            System.out.println("data nya adalah " + key);
        } else {
            System.out.println("data tidak itemukan");
        }
    }
    public static void main(String[] args) {
        BufferedReader fer;
        String sil;

        // nama file csv Kelas1GG.csv dengan 26 baris 2 kolom
        String fileName = "Kelas1GG.csv";
        String key = "Ferdian Firmansyah";
        Boolean search = true;

        // array menampung value pada array 2 dimensi
        String[][] value = new String[26][2];

        int i = 0;
        int d = search.compareTo(search);
        try {
            fer = new BufferedReader(new FileReader(fileName));
            while ((sil = fer.readLine()) !=null) {

                // memisahkan 2 kolom dengan split ","
                String[] nilai = sil.split(",");
                value[i][0] = nilai[0]; // simpan value baris i kolom 0
                value[i][1] = nilai[1]; // simpan value baris i kolom 1
                i++;
            }
            if (search) {
                System.out.println("data ditemukan");
                System.out.println(+ i +" adalah index dari data yang dicari");
                System.out.println("data nya adalah " + key);

            } else {
                System.out.println("data tidak itemukan");
            }
            fer.close();;

        } catch (IOException f) {
            f.printStackTrace();
        }
        System.out.println("Mencetak Value Array 2 Dimensi");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n");

        // menampilkan isi array 2 dimensi dari perulangan
        for (int l = 0; l < value.length; l++) {
            for (int v = 0; v < value[0].length; v++) {
                System.out.println(+ l + "Data" + v);
//                System.out.print(value[l][v] + " ");
            }
        }
//        if (search) {
//            System.out.println("data ditemukan");
//            System.out.println(+ i  +" adalah index dari data yang dicari");
//            System.out.println("data nya adalah " + key);
//        } else {
//            System.out.println("data tidak itemukan");
//        }
    }
}
