package Array1Dimensi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tugas{
    public static void main(String[] args) {
        String fileName = "Kelas1G.csv";
        File file = new File(fileName);

        try {
            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNext()) {
                String data = inputStream.next();
                String[] value = data.split(" , ");
                System.out.println(value[0]);
            }
        } catch (FileNotFoundException sil) {
            sil.printStackTrace();
        }

        System.out.println("Angka : " + System.getProperty(""));
    }
}
