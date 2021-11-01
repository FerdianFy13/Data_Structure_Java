package com.ferdi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ferdi {
    public static String a[];
    public static int i=0;

    public static int binarySearch(String[] array, String searchItem)
    {
        int first = 0;
        int last = array.length - 1;
        int middle = 0;

        boolean search = false;

//Loop until found or end of list.
        while(first <= last &&!search)
        {
            middle = (first + last) /2;
            if(array[middle]==(searchItem)) search = true;

            else
            {
                if(array[middle]==(searchItem))
                    last = middle -1;
                else first = middle + 1;
            }
        }
        if(search) return middle;
        else return(-1);
    }

    /* Main method */
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("E:\\Program Java\\Kelas1G.csv");
        BufferedReader fileInput = new BufferedReader(file);
        long numLines = 0;

        String line;
        do {
            line = fileInput.readLine();
            if (line != null) {
                a[i] = line;
                numLines++;
            }
            i++;
        }
        while (line != null);
        String searchItem = "Nabila Hermawan";
        // hello is located at the 4th entry in the file
        binarySearch(a, searchItem);
    }
}