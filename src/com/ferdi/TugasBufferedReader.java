package com.ferdi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TugasBufferedReader {
    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader ferdi = new BufferedReader(reader);

            System.out.print("Masukkan Nama Anda : ");
            String name = ferdi.readLine();
            System.out.println("Nama Anda : "+name);

            System.out.print("Masukkan Jurusan Anda : ");
            String jurusan = ferdi.readLine();
            System.out.println("Jurusan Anda : "+jurusan);

            System.out.print("Masukkan NIM Anda : ");
            String nim = ferdi.readLine();
            System.out.println("NIM Anda : "+nim);

            System.out.print("Masukkan KHS Semester 1 Anda : ");
            String KHS1 = ferdi.readLine();
            System.out.println("KHS Anda : "+KHS1);
        } catch (Exception f) {
            f.printStackTrace();
        }
    }
}