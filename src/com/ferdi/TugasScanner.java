package com.ferdi;

import java.util.Scanner;

public class TugasScanner {
    public static void main(String[] args) {
        Scanner ferdi = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String name = ferdi.nextLine();
        System.out.println("Nama Anda : "+name);

        System.out.print("Masukkan Jurusan Anda : ");
        String jurusan = ferdi.nextLine();
        System.out.println("Jurusan Anda : "+jurusan);

        System.out.print("Masukkan NIM Anda : ");
        long nim = ferdi.nextLong();
        System.out.println("NIM Anda : "+nim);

        System.out.print("Masukkan KHS Semester 1 Anda : ");
        float KHS1 = ferdi.nextFloat();
        System.out.println("KHS Anda : "+KHS1);
    }
}