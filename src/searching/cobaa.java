package searching;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class cobaa {
    public static void main(String [] args)
    {
        cobaa ar = new cobaa();
        ar.readArray("Kelas1GG.csv",",");
        String arr[][] = ar.getArray();
        int rows = ar.getRows();
        int cols = ar.getCols();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }

    private String arr[][];
    private int rows, cols;

    String[][] getArray()
    {
        return arr;
    }

    int getRows()
    {
        return rows;
    }

    int getCols()
    {
        return cols;
    }

    // Read using DELIMITER TAB
    void readArray(String arrayName) {
        rows = 0;
        cols = 0;
        int r, c, numElements;
        String ipString, splitString[];
        ArrayList <String>tmpArr = new ArrayList<>();

        try {
            Scanner in = new Scanner(new FileReader(arrayName));
            while(in.hasNext()) {
                ipString = in.nextLine();
                splitString = ipString.split("\t");
                if (rows==0) {
                    cols = splitString.length;
                }
                for (c = 0; c < cols; c++) {
                    tmpArr.add(splitString[c]);
                }
                rows++;
            }
            in.close();

            arr = new String[rows][cols];
            numElements = 0;
            for (r = 0; r < rows; r++) {
                for (c = 0; c < cols; c++) {
                    arr[r][c] = tmpArr.get(numElements);
                    numElements++;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error Question!");
        }
    }

    // Read using DELIMITER regex
    void readArray(String arrayName, String regex)
    {
        rows = 0;
        cols = 0;
        int r, c, numElements;
        String ipString, splitString[];
        ArrayList <String>tmpArr = new ArrayList<>();

        try
        {
            Scanner in = new Scanner(new FileReader(arrayName));
            while(in.hasNext())
            {
                ipString = in.nextLine();
                splitString = ipString.split(regex);
                if (rows==0)
                {
                    cols = splitString.length;
                }
                for (c=0;c<cols;c++)
                {
                    tmpArr.add(splitString[c]);
                }
                rows++;
            }
            in.close();

            arr = new String[rows][cols];
            numElements = 0;
            for (r=0; r<rows; r++)
            {
                for (c=0; c<cols; c++)
                {
                    arr[r][c] = tmpArr.get(numElements);
                    numElements++;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error occurred!");
        }
    }
}
