package searching;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class sasa {
    private static Scanner x;
    public static void main(String[] args) {
        String filepath = "Kelas1GG.csv";
        String search = "Ferdian Firmansyah";
        Searchitem(search, filepath);
    }
    public static void Searchitem(String search, String filepath)  {
        boolean found = false;
        String nim = "";
        String nama = "";

        try {
            x = new Scanner(new File(filepath));
            x.useDelimiter("\n");
            while (x.hasNext() && !found) {
                nim = x.next();
                nama = x.next();

                if (nim.equals(search)) {
                    found = true;
                }
            }
            if (found) {
                JOptionPane.showMessageDialog(null, "nim" + nim + " nama " + nama);
            }
            else {
                JOptionPane.showMessageDialog(null, "not null");
            }
        } catch(Exception f) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
}
