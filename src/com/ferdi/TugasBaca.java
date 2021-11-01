package com.ferdi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TugasBaca {
    public static void main(String[] args) {
        try {
            File ferdi = new File("FerdianF.txt");
            System.out.println("~~~~~~Membaca Input File TXT~~~~~~");
            Scanner ferdian = new Scanner(ferdi);

            while (ferdian.hasNext()) {
                System.out.print(ferdian.next()+"");
            }

            ferdian.close();
        } catch (FileNotFoundException sil) {
            System.out.println("~~~Error Not File In The Folder~~~");
        }
    }
}