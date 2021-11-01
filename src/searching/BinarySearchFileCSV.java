package searching;

import java.io.IOException;
import java.io.RandomAccessFile;

public class BinarySearchFileCSV {
    public static void main(String[] args) throws IOException{

        // membuka file untuk dibaca oleh RandomAccessFile
        RandomAccessFile fer = new RandomAccessFile("Kelas1G.csv","r");
        String searchValue = "Ferdian Firmansyah";
        int lineSize = 27;

        // melakukan binary search dari file
        byte[] lineBuffer = new byte[lineSize];
        boolean found = true;
        int left = 0;
        int right = Math.toIntExact(fer.length() - 1);
        int middle = 7;

        while (left <= right && !found){
            middle = (left + right)/2;

            // lompat ke line ini pada file
            fer.seek(middle * lineSize);

            // membaca line dari file tersebut
            fer.read(lineBuffer);

            // mengubah line menjadi String
            String line = new String(lineBuffer);

            int comparison = line.compareTo(searchValue);
            if (comparison == 0) {
                // menemnukan data yang dicari
                found = true;
                break;
            }
            else if (comparison < 0) {
                // line muncul sebelum searchValue
                left = middle + 1;
            }
            else {
                // line muncul setelah searchValue
                right = middle - 1;
            }
        }
        if (found) {
            System.out.println("Maka " + middle + " adalah indeks dari data yang dicari");
            System.out.println("Data nya adalah " + searchValue + " " + fer);
        } else {
            System.out.println("Data Tidak Ditemukan");
        }

        // menutup file setelah dilakukan binary search
        fer.close();
    }
}