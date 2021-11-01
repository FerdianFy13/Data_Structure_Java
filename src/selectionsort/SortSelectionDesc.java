package selectionsort;

public class SortSelectionDesc {
    public static void main(String[] args) {

        // Pemanggilan function SelectionDesc dari class SortSelectionDes
        SortSelectionDesc SelectionDesc = new SortSelectionDesc();

        // mendeklarasikan variable array data dengan angka acak menggunakan function iRandom
        int[] data = SelectionDesc.iRandom(243);

        // mencetak data sebelum terurut
        System.out.println("Data Sebelum Terurut : ");
        SelectionDesc.tampil(data);

        // menghitung lama waktu execute menggunakan currentTimeMillis
        long start =  System.currentTimeMillis();
        SelectionDesc.SelectionSortDesc(data);
        long end = System.currentTimeMillis();

        // mencetak data sesudah terurut
        System.out.println("Data Sebelum Terurut : ");
        SelectionDesc.tampil(data);

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

    // function pengurutan data SelectionSortAsc secara descending
    public int[] SelectionSortDesc (int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int s = i + 1; s < data.length; s++) {
                if (data[s] > data[min]) {
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
