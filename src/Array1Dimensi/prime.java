package Array1Dimensi;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }
        //loop through the numbers one by one
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;

            //check to see if the numbers are prime
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            //print the number
            if (isPrime)
                System.out.println(i + " are the prime numbers in the array ");
            else
                System.out.println(i + " not the prime numbers in the array ");
        }
    }
}