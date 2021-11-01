package searching;

public class SequentialSearch {
    public static void main(String[] args) {

        // Variable array data
        String[] data = {"Vina", "Endik", "Zidan", "Iqbal", "Erik", "Ferdi", "Silvia", "Baqi", "Vivi", "Okik", "Zulva"};

        String key = "Ferdi";

        int i = 0;
        boolean search = false;

        while (!search && i < data.length) {
//            if (data[i].equals(key))
            if (data[i].equalsIgnoreCase(key))
                search = true;
            else
                i++;
        }

        if (search) {
            System.out.println("data ditemukan");
            System.out.println(i + " adalah index dari data yang dicari");
            System.out.println("data nya adalah " + data[i]);
        } else {
            System.out.println("data tidak itemukan");
        }
    }
}
