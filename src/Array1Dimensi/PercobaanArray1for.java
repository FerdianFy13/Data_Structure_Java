package Array1Dimensi;

public class PercobaanArray1for {
    public static void main(String[] args) {
        int fer[];
        fer = new int[10];

        // initialize first element
        fer[0] = 100;
        // initialize second element
        fer[1] = 200;
        // initialize third element
        fer[2] = 300;
        // initialize fourth element
        fer[3] = 400;
        // initialize fifth element
        fer[4] = 500;
        // initialize sixth element
        fer[5] = 600;
        // initialize seventh element
        fer[6] = 700;
        // initialize eighth element
        fer[7] = 800;
        // initialize ninth element
        fer[8] = 900;
        // initialize tenth element
        fer[9] = 1000;

        for (int i=0; i< fer.length;i++) {
            System.out.println("Element at index[" + i + "] = " + fer[i]);
        }
    }
}