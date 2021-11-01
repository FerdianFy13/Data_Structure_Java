//package searching;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class kota {
//    public static void main (String[] args) {
//        BufferedReader fer;
//        String sil;
//        SequentialSearch dua = new SequentialSearch();
//
//        // nama file csv Kelas1GG.csv dengan 26 baris 2 kolom
//        String fileName = "Kelas1GG.csv";
////        String key = "362055401191 Ferdian Firmansyah";
//
//        // array menampung value pada array 2 dimensi
//        String[][] value = new String[26][2];
//
//        int i = 0;
//        Boolean found = false;
//        try {
//            fer = new BufferedReader(new FileReader(fileName));
//            while ((sil = fer.readLine()) !=null && !found) {
//
//                // memisahkan 2 kolom dengan split ","
//                String[] nilai = sil.split(",");
//                value[i][0] = nilai[0]; // simpan value baris i kolom 0
//                value[i][1] = nilai[1]; // simpan value baris i kolom 1
//                i++;
//                if
//            }
//            fer.close();;
//
//        } catch (IOException f) {
//            f.printStackTrace();
//        }
//        System.out.println("Mencetak Value Array 2 Dimensi");
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.print("\n");
//
//        // menampilkan isi array 2 dimensi dari perulangan
//        for (int l = 0; l < value.length; l++) {
//            for (int v = 0; v < value[0].length; v++) {
//                System.out.print(value[l][v] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
