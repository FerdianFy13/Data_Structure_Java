package CashierMobileAppByFerdianFirmansyah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class CashierMobileApp {
    public static void main(String[] args) throws IOException {

        // object BufferedReader
        InputStreamReader fer = new InputStreamReader(System.in);
        BufferedReader readFile = new BufferedReader(fer);
        CashierMobileApp sort = new CashierMobileApp();

        // CashierMobileApp app developer
        System.out.println("Ferdian Firmansyah");
        System.out.println("TI - 1G / 362055401191");
        System.out.println("Politeknik Negeri Banyuwangi");

        // input amount of data
        System.out.print("\nEnter Amount of Data : ");
        int amountData = Integer.parseInt(readFile.readLine());

        // array data as a placeholder for Data values
        int[] data = new int[amountData];

        // select data charging method
        System.out.println("\nData Charging");
        System.out.println("1. Input by user");
        System.out.print("2. Input by program --> Choice [1 / 2]: ");
        int contents = Integer.parseInt(readFile.readLine());

        // cashier program contents
        switch(contents) {
            // data filling is done by the User
            case 1    :
                System.out.println();
                for (int n = 0; n < amountData; n++)
                {
                    System.out.print("Data to-" + (n + 1) + " : ");
                    data[n] = Integer.parseInt(readFile.readLine());
                }
                break;

            // data filling is done by the program randomly
            case 2    :
                for (int j = 0; j < amountData; j++)
                    data[j] = new Random().nextInt(1001);

                // sorting Insertion Ascending iteration
                int[] newData = sort.insertionSortAscending(data);

                // Show data filled in by the program
                System.out.println("\nShow Data");
                for (int j = 0; j < data.length; j++)
                    System.out.println("Data ke-" + (j + 1) + " : "+data[j]);

                break;

            // If the menu selection doesn't match
            default    :    System.out.println("Options Not Available");
        }

        // input the data you are looking for
        System.out.print("\nInput the data you are looking for : ");
        int search = Integer.parseInt(readFile.readLine());

        // Sequential Searching Process
        boolean found = false;  // Indicator variable if data has been found
        int order = 0;          // Variable to find out what order the data is looking for

        for (int a = 0; a < amountData; a++) {
            System.out.print(data[a] + " == " + search);
            if (data[a] == search) {
                System.out.println("    --> Data Found");
                order = a + 1;
                found = true;
                break;
            } else
                System.out.println("    --> Data Not Found");
        }

        if (found == true)
            System.out.println("\ndata found in order-" + (order));
        else
            System.out.println("\nData Not Found");
    }

    // sorting Insertion Ascending iteration process
    int[] insertionSortAscending (int[] data) {
        int f = data.length;

        // int[] data =  new int[] f;
        int key, s;

        // iteration random number data loop
        for (int i = 0; i < f; i++) {
            key = data[i];
            s = i - 1;

            while (s >= 0 && data[s] > key) {
                data[s + 1] = data[s];
                s = s - 1;
            }
            data[s + 1] = key;
        }
        return data;
    }
}
