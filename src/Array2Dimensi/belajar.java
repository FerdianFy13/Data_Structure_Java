package Array2Dimensi;

public class belajar {
    public static void main(String[] args) {
        String[][] fer = {
                {"Ferdian", "TIA"},
                {"Ferdi", "TIB"}
        };

        for (int i = 0; i < fer.length; i++){
            System.out.println("Nama " + fer[i][0] + " Kelas " + fer[i][1]);
        }
    }
}
