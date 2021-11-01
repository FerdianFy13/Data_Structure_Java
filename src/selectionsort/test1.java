package selectionsort;

import java.io.*;
import java.util.*;

public class test1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        //Buat objek ArrayList untuk menampung baris file input
        ArrayList<String> lines = new ArrayList<String>();
        try {

            //Membuat objek BufferedReader untuk membaca file input
            reader = new BufferedReader(new FileReader("sortjava.csv"));

            //Membaca semua baris file input satu per satu dan menambahkannya ke ArrayList
            String currentLine = reader.readLine();
            while (currentLine != null) {
                lines.add(currentLine);
                currentLine = reader.readLine();
            }
            Collections.sort(lines);

            //Membuat objek BufferedWriter untuk ditulis ke file output
            writer = new BufferedWriter(new FileWriter("bbb.csv"));
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //menutup file
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}