package com.ferdi;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Tugasdata {
    public static void main(String[] args) {
        String dataawal = "Ferdian Firmansyah";
        String datatengah = "TI 1G / 362055401191";
        String dataakhir = "Politeknik Negeri Banyuwangi";

        try (PrintWriter ferdi = new PrintWriter(new File("FerdianF13.csv"))) {
            ferdi.append(dataawal);
            ferdi.append('\n');
            ferdi.append(datatengah);
            ferdi.append('\n');
            ferdi.append(dataakhir);
        } catch (FileNotFoundException sil) {
            sil.printStackTrace();
        }
        System.out.println("Ferdian Firmansyah Mahasiswa Politeknik Negeri Banyuwangi");
    }
}