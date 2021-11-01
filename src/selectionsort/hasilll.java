package selectionsort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class hasilll {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        PrintWriter outputStream = null;
        ArrayList<String> rows = new ArrayList<String>();

        try {
            reader  = new BufferedReader(new FileReader("sortjava.csv"));
            outputStream = new PrintWriter(new FileWriter("Output.txt"));

            String file;
            while ((file = reader.readLine()) != null) {
                rows.add(file);
            }
            Collections.sort(rows);
            String[] strArr= rows.toArray(new String[0]);
            for (String cur : strArr)
                outputStream.println(cur);
        } finally {
            if (reader  != null) {
                outputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
