package Array2Dimensi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class cobaa {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String fileName = "friend.csv";
        List<List<String>> list = new ArrayList<List<String>>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        String[] headers = line.split(";");
        for(String header: headers) {
            List<String> subList = new ArrayList<>();
            subList.add(header);
            list.add(subList);
        }
        while((line = br.readLine()) != null) {
            String[] elems = line.split(";");
            for(int i = 0; i < elems.length; i++) {
                list.get(i).add(elems[i]);
            }
        }
        br.close();
        int rows = list.size();
        int cols = list.get(0).size();
        String[][] array2D = new String[rows][cols];
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                array2D[row][col] = list.get(row).get(col);
            }
        }
    }
}