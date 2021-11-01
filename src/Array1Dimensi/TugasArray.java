package Array1Dimensi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TugasArray {
    public static void main(String[] args) {
        String read = "Kelas1G.csv";
        String line = ",";
        System.out.print("\n");
        System.out.println("~~~~~~Daftar Nama Mahasiswa POLIWANGI Kelas 1G~~~~~~");
        System.out.print("\n");

        try {
            BufferedReader fer = new BufferedReader(new FileReader(read));

            while ((line = fer.readLine()) !=null) {
                String[] value = line.split(",");
                System.out.println(value[0]);
            }
            fer.close();

        } catch (FileNotFoundException sil) {
            System.out.println("~~~Error Not File In The Folder~~~");
        } catch (IOException sil) {
            sil.printStackTrace();
        }

        System.out.print("\n");
        System.out.println("~~~~~~Sukses~~~~~~");
    }
}