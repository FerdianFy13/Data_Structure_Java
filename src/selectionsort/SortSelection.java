package selectionsort;

public class SortSelection {
    public static void main(String[] args) {

        // Pemanggilan function SelectionSort dari class SortSelection
        SortSelection SelectionSort = new SortSelection();

        // mencetak data awal sebelum dilakukan sorting
        System.out.println("Data awal : ");

        // mendeklarsikan angka pada elenen array data bertipe data integer
        int data[] = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

        // menampilkan function SelectionSort tampil dari array data
        SelectionSort.tampil(data);
        System.out.println();

        // memulai waktu jalannya proses program dengan currentTimeMillis
        long awal = System.currentTimeMillis();

        // proses perulangan untuk mengurutkan data menggunakan SelectionSort
        for (int i = 0; i < data.length; i++) {
            int min = i;
            for (int s = i + 1; s < data.length; s++) {
                if (data[s] < data[min]) {
                    min = s;
                }
            }

            // menyimpan data hasil pengurutan pada variable array min
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;

            // mencetak data hasil SelectionSort
            System.out.println("index ke " + i + " dan index ke " + min);
            SelectionSort.tampil(data);
        }
        System.out.println();

        // mencetak waktu sorting SelectionSort
        long waktu = System.currentTimeMillis() - awal;
        System.out.println("Waktu Sorting : " + waktu);

        // Mencetak hasil akhit dari SelectionSort
        System.out.println("Hasil AKhir Sorting ");
        SelectionSort.tampil(data);
    }

    // function tamppil untuk proses SelectionSort
    void tampil (int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}