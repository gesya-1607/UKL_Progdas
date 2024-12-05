public class UKLsulit3 {
    public static void main(String[] args) {
        // Input array
        int[] angka = {1, 2, 2, 3, 3, 3, 4};
    
        System.out.println("Frekuensi setiap elemen dalam array:");

        // Perulangan pertama untuk memilih elemen
        for (int A = 0; A < angka.length; A++) {
            int hitung = 0; // Frekuensi elemen
            boolean sudahdihitung = false;

        // Cek apakah elemen sudah dihitung sebelumnya
        for (int Y = 0; Y < A; Y++) {
            if (angka[A] == angka[Y]) {
            sudahdihitung = true;
            break;
            }
        }

        // Jika elemen sudah dihitung, lewati
        if (sudahdihitung) {
            continue;
        }

        // Hitung frekuensi elemen
        for (int j = 0; j < angka.length; j++) {
            if (angka[A] == angka[j]) {
            hitung++;
            }
        }

            // Cetak hasil
            System.out.println(angka[A] + " muncul " + hitung + " kali");
        }
}
}
