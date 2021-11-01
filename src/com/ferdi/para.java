package com.ferdi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class para {
    public static void main(String[] args) throws IOException {
        BufferedReader fer;
        String sil;

        // nama file csv Kelas1G dengan jumlah 27 mahasiswa
        String fileName = "Kelas1G.csv";

        // array menampung value array
        String[] data = new String[27];

//        Para(data, fileName);

        int i = 0;
        try {
            fer = new BufferedReader(new FileReader(fileName));
            while ((sil = fer.readLine()) != null) {
                data[i] = sil;
                i++;
            }
            fer.close();

        } catch (IOException v) {
            v.printStackTrace();
        }
        System.out.println("Mencetak Value Array");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n");

//        // menampilkan isi array dengan perulangan
//        for (int f = 0; f < data.length; f++) {
//            System.out.println(data[f]);
//        }
        Arrays.sort(data);
    }

//    public static void Para(String[] data, String fileName) throws IOException {
//        BufferedReader fer = new BufferedReader(new FileReader(fileName));
//        String key = "Ferdian Firmansyah";
//
//        // Binary Search Algorith
//        int F = 0;
//        int R = data.length;
//        boolean search = true;
//        int s = 0;
//
//        while (F <= R && !search) {
//            s = (F + R) / 2;
//            if (data[s] == key) {
//                search = true;
//            }
//            else {
//                R = s - 1;
//                F = s + 1;
//            }
//        }
//        if (search) {
//            System.out.println("maka " + s + " adalah indeks dari data yang dicari");
//            System.out.println("data nya adalah " + data[s]);
//        } else {
//            System.out.println("data tidak ditemukan");
//        }
//    }
}
