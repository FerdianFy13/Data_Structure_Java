package Array1Dimensi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PercobaanArrayCSV {
    public static void main(String[] args) {
        String fileName = "Kelas1G.csv";
        System.out.print("\n");
        System.out.println("~~~~~~Daftar Nama Mahasiswa POLIWANGI Kelas 1G~~~~~~");
        System.out.print("\n");

        try {
            BufferedReader fer = new BufferedReader( new FileReader(fileName));
            String strLine = null;
            StringTokenizer fir = null;
            int lineNumber = 0, tokenNumber = 0;

            while((fileName = fer.readLine()) != null) {
                lineNumber++;
                String[] result = fileName.split(",");
                for (int x = 0; x < result.length; x++) {
                    System.out.println(result[x]);
                }
            }
        }

        catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException f) {
            f.printStackTrace();
        }

        System.out.print("\n");
        System.out.println("~~~~~~Sukses~~~~~~");
    }
}