//package searching;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class dua {
//    public static void main(String[] args) throws IOException {
//        BufferedReader fer;
//        String sil;
//
//        // nama file csv Kelas1GG.csv dengan 26 baris 2 kolom
//        String fileName = "Kelas1GG.csv";
////        String key = "362055401191 Ferdian Firmansyah";
//
//        // array menampung value pada array 2 dimensi
//        String[][] value = new String[26][2];
//        SequentialSearch(fileName, value);
//
//        int i = 0;
//        try {
//            fer = new BufferedReader(new FileReader(fileName));
//            while ((sil = fer.readLine()) !=null) {
//
//                // memisahkan 2 kolom dengan split ","
//                String[] nilai = sil.split(",");
//                value[i][0] = nilai[0]; // simpan value baris i kolom 0
//                value[i][1] = nilai[1]; // simpan value baris i kolom 1
//                i++;
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
////        int[] newdata = sort.insertionSortAsc(data);
////        String[] newdata = searching.SequentialSearch
//
//        // menampilkan isi array 2 dimensi dari perulangan
//        for (int l = 0; l < value.length; l++) {
//            for (int v = 0; v < value[0].length; v++) {
//                System.out.print(value[l][v] + " ");
//            }
//            System.out.println();
//        }
//
////        System.out.println();
////        System.out.println("Data Yang Dicari Adalah " + key);
//    }
////    String[] SequentialSearch (String filename, Stir) {
////
////    }
//
//    public static void SequentialSearch(String fileName, String[][] value) throws IOException {
//        String key = "Ferdian Firmansyah";
//        BufferedReader fer = new BufferedReader(new FileReader(fileName));
//        String[][] value2 = new String[26][2];
////        value = value2;
//        value2 = value;
//
//        int i = 0;
//        boolean search = false;
//
//        while (!search && i < value.length) {
////            if (data[i].equals(key))
//            if (value[i].equals(key))
//                search = true;
//            else
//                i++;
//        }
//
//        if (search) {
//            System.out.println("data ditemukan");
//            System.out.println(i + " adalah index dari data yang dicari");
//            System.out.println("data nya adalah " + value[i]);
//        } else {
//            System.out.println("data tidak itemukan");
//        }
//    }
//}
