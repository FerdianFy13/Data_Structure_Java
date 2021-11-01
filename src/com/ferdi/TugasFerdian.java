package com.ferdi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TugasFerdian {
    public static void main(String[] args) {
        BufferedReader readerfile = null;
        try {
            String strCurrentLine;

            readerfile = new BufferedReader(new FileReader("Ferdi.txt"));

            while ((strCurrentLine = readerfile.readLine()) !=null) {
                System.out.println(strCurrentLine);
            }
        } catch (IOException f) {
            f.printStackTrace();

        } finally {

            try {
                if (readerfile !=null)
                    readerfile.close();
            } catch (IOException fer) {
                fer.printStackTrace();
            }
        }
    }
}