package searching;

import javax.annotation.processing.RoundEnvironment;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.rmi.server.LogStream;
import java.util.Arrays;

public class satu {
//    public static void main(String[] args) {
//        //Strengir sem innihalda 9 nöfn. Sumir innihalda sama nafnið.
//        //Nöfn sem eru eins í öllum 3 listunum eru Hulda og Ingi.
//        String[] name1 = {"Helgi", "Arnar", "Hulda", "Hrefna", "Ingi", "Marta",
//                "Svavar", "Ester", "Valur"};
//        String[] name2 = {"Oddur", "Birgitta", "Hulda", "Ingi", "Selma", "Svavar",
//                "Sylvia", "Unnar", "Hrefna"};
//        String[] name3 = {"Elfa", "Jan", "Hulda", "Hrund", "Ingi", "Marta",
//                "Angela", "Sturla", "Valur"};
//
//        Arrays.sort(name2);
//        Arrays.sort(name3);
//
//        for(int i = 0; i < name1.length; i++) {
//            if ((Arrays.binarySearch(name2, name1[i])).com(Arrays.binarySearch(name3, name1[i])) < 0) {
//                StdOut.println(name1[i]);
//                break;
//            }
//        }
//    }
//public static void binarySearch() {
//    String TAG = "TEST";
//    String wordFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/word.dat";
//    String wordxFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/wordx.dat";
//
//    String target = "abracadabra";
//    boolean targetFound = false;
//    int searchCount = 0;
//
//    try {
//        RandomAccessFile raf = new RandomAccessFile(wordxFilePath, "r");
//        RandomAccessFile rafWord = new RandomAccessFile(wordFilePath, "r");
//        long low = 0;
//        long high = (raf.length() / 4) - 1;
//        int cur = 0;
//        long wordOffset = 0;
//        int len = 0;
//
//        while (high >= low) {
//            long mid = (low + high) / 2;
//            raf.seek(mid * 4);
//            cur = raf.readInt();
//            LogStream.v(TAG + "-cur", String.valueOf(cur));
//
//            len = cur >> 22; //word length
//
//            cur = cur & 0x3FFFFF;  //first 10 bits are 0
//
//            rafWord.seek(cur);
//            byte [] bytes = new byte[len];
//
//            wordOffset = rafWord.read(bytes, 0, len);
//            Log.v(TAG + "-wordOffset", String.valueOf(wordOffset));
//
//            searchCount++;
//
//            String str = new String(bytes);
//
//            Log.v(TAG, str);
//
//            if (target.compareTo(str) < 0) {
//                high = mid - 1;
//            } else if (target.compareTo(str) == 0) {
//                targetFound = true;
//                break;
//            } else {
//                low = mid + 1;
//            }
//        }
//
//        raf.close();
//        rafWord.close();
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//    if (targetFound == true) {
//        Log.v(TAG + "-found " , String.valueOf(searchCount));
//    } else {
//        Log.v(TAG + "-not found " , String.valueOf(searchCount));
//    }
public static void main(String[] args) throws IOException{
    // open the file for reading
    RandomAccessFile raf = new RandomAccessFile("Kelas1G.csv","r");
    String searchValue = "Ferdian Firmansyah";
    int lineSize = 27;

// perform the binary search...
    byte[] lineBuffer = new byte[lineSize];
    int bottom = 0;
    int top = Math.toIntExact(raf.length());
    boolean ketemu = true;
    int middle = 7;
    while (bottom <= top && !ketemu){
        middle = (bottom+top)/2;
        raf.seek(middle * lineSize); // jump to this line in the file
        raf.read(lineBuffer); // read the line from the file
        String line = new String(lineBuffer); // convert the line to a String

        int comparison = line.compareTo(searchValue);
        if (comparison == 0){
            ketemu = false;
            // found it
            break;
//            boolean = true;
        }
        else if (comparison > 0){
            // line comes before searchValue
            bottom = middle + 1;
        }
        else {
            // line comes after searchValue
            top = middle - 1;
        }
    }
    if (ketemu) {
        System.out.println("data " + middle);
        System.out.println("data" + searchValue  + "data");
    } else {
        System.out.println("data data");
    }
    raf.close(); // close the file when you're finished
}
}
