package Queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class queque {
    private static int[] QueQue = new int[5];
    private static int Counters = 0;

    private static boolean QuequeStorage() {
        if (Counters < QueQue.length) {
            return true;
        } else {
            return false;
        }
    }

    private static void createQueque() {
        int loopingZ = 0;
        int betha = 0;
        while (loopingZ == 0) {
            System.out.print("Input Number : ");
            Scanner bethaF = new Scanner(System.in);
            try {
                betha = bethaF.nextInt();
                loopingZ = 0;
            } catch (InputMismatchException fer) {
                System.out.println("Input must be a Number!");
                loopingZ = 0;
            }
        }
        QueQue[Counters] = betha;
        Counters++;
    }

    private static void removeQueque() {
        Counters--;
        for (int i = 0; i < Counters; i++) {
            QueQue[i] = QueQue[i + 1];
        }
        System.out.println("The first data in the queue has been issued");
    }

    private static void displayQueque() {
        System.out.println("Data in queque");
        for (int i = 0; i < Counters; i++) {
            System.out.println(" [ "+ i + " => "+ QueQue[i] +" ]");
        }
        System.out.println("");
    }

    private static void clearQueque() {
        Counters = 0;
    }

    private static void quitQueque() {
        String programs = "y";
        System.out.print("Keluar dari Program ? (Y/T) : ");
        programs = new Scanner(System.in).nextLine();
        if (programs.equalsIgnoreCase("y")) {
            System.exit(0);
        } else {
            MenuProgram();
        }
    }

    private static void MenuChoose(int chooseMenu) {
        switch (chooseMenu) {
            case 1:
                boolean check = QuequeStorage();
                if (check) {
                    createQueque();
                } else {
                    System.out.println("Queue Full !, empty data one first!");
                }
                break;
            case 2:
                removeQueque();
                break;
            case 3:
                System.out.println("Status Storage: ");
                System.out.println("Capacity: " + QueQue.length);
                System.out.println("Filled: " + Counters);
                break;
            case 4:
                displayQueque();
                break;
            case 5:
                clearQueque();
                break;
            case 6:
                quitQueque();
                break;
        }
        MenuProgram();
    }

    public static void MenuProgram() {
        int loopingx = 0;
        int chooseMenu = 0;
        while (loopingx == 0) {
            System.out.println("\nQueue Program with Java");
            System.out.println("Menu: ");
            System.out.println("1. Add Queue");
            System.out.println("2. Remove 1 data from Queue");
            System.out.println("3. Status Queue");
            System.out.println("4. Show data in Queue");
            System.out.println("5. Clean Queue");
            System.out.println("6. Exit the Program");
            System.out.print("Menu Options (1 - 6) >>> ");
            Scanner menuOption = new Scanner(System.in);
            try {
                chooseMenu = menuOption.nextInt();
                loopingx = 1;
            }catch(InputMismatchException e) {
                System.out.println("Input must be Numbers!");
            }
        }
        System.out.println("");
        MenuChoose(chooseMenu);
    }

    public static void main(String[] args) {
        MenuProgram();
    }
}