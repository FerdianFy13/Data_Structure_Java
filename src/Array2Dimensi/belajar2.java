package Array2Dimensi;

import java.util.Arrays;
import java.util.Scanner;

public class belajar2 {
    public static void main(String[] args) {
        System.out.println("Belajar Array 2D");

        // cara mmembuat array 2D
        int[][] array = {{1, 4} , {3, 5}};
        printArray(array);

        // int 3 sama dengan baris
        // int 2 sama dengan kolom
        // int [baris][kolom]
        int[][] arrayy = new int[3][2];

        //System.out.pri ntln(arrayy.length);
//        printArray(arrayy);

 //       for (int i = 0; i < arrayy.length; i++) {
  //          System.out.print("[");
   //         for (int f = 0; f < arrayy[i].length; f++) {
   //             System.out.print(arrayy[i][f] + ",");
  //          }
//            System.out.print("]\n");
//        }
        int[][] array2d = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
        };
        printArray(array2d);

        int[][] array2d_2d = {
                {1,2,3},
                {4,5,6,7},
                {8}
        };

        printArray(array2d_2d);
    }

    private static void printArray(int[][] data){
        System.out.print("\n");
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }

}
