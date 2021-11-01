package searching;

public class BinarySearchCSV {
    static int binarySearch(String[] arr, String x)  {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);

            // Check if x is present at mid
            if (res == 0)
                return m;

            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }

    // Driver method to test above
    public static void main(String []args)
    {
//        String[] arr = {
//                "Muhammad Sholah Mahasin", "I Wayan Frico Ari Wardhana", "Nabila Hermawan", "Khamariza Putri Ihshani",
//                "Rizal Eka Budi Pratama", "Naafi Ramadhan", "Haryo Noor Fachry Mahendra", "Hera", "Muhammad Iqbal Saputra",
//                "Ferdian Firmansyah", "Adya Ginansah", "Tiana Oktaviana", "Tri Ayu Novitasari", "Yehezkiel Krestarta",
//                "Kevin Joanito", "Endik Jauhari", "Baqiatus Sholeha", "Dio Pebriansyah", "Muhammad Luqman Hakim", "Inna Lailatul Mukaromah",
//                "Yoshe Naomi Vici Aflaha", "Avif Saiful Rizal", "Erik Ferdiansyah", "Irvan Wahyu Fadila", "Oky Deviana Putri",
//                "Bagus Setiawan", "Vina Rahmatul Muflikah"};
        String[] arr = { "Ferdian Firmansyah", "Hera", "Ryan", "Ardian Firman"};
        String x = "Ardian Firman";
        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
