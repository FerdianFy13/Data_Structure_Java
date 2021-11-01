package selectionsort;

public class SortSelectionAsc {
    public static void main(String[] args) {

        // Pemanggilan function SelectionAsc dari class SortSelectionAsc
        SortSelectionAsc SelectionAsc = new SortSelectionAsc();

        // mendeklarasikan variable array data dengan angka acak menggunakan function iRandom
        int[] data = SelectionAsc.iRandom(243);

        // mencetak data sebelum terurut
        System.out.println("Data Sebelum Terurut : ");
        SelectionAsc.tampil(data);

        // menghitung lama waktu execute menggunakan currentTimeMillis
        long start =  System.currentTimeMillis();
        SelectionAsc.SelectionSortAsc(data);
        long end = System.currentTimeMillis();

        // mencetak data sesudah terurut
        System.out.println("Data Sesudah Terurut : ");
        SelectionAsc.tampil(data);

        // menampilkan waktu execute dengan (end - start)
        System.out.println("Waktu yang dibutuhkan : " + (end - start) + " miliseconds");
    }

    // function iRandom unutk menghasilkan angka random pada program
    public int[] iRandom(int f) {
        int data[] = new int[f];
        for (int a = 0; a < data.length; a++) {
            data[a] = (int) (Math.random() * f + 1);
        }
        return data;
    }

    // function untuk tampil dalam proses SelectionSort
    void tampil (int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // function pengurutan data SelectionSortAsc secara ascending
    public int[] SelectionSortAsc (int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int s = i + 1; s < data.length; s++) {
                if (data[s] < data[min]) {
                    min = s;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
        return data;
    }
}
