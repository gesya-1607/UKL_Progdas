import java.util.Scanner;
public class UKLsulit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahSiswa;
        double[] nilai;

        System.out.println("Masukkan jumlah siswa:");
        int Siswa = input.nextInt();

        // Menginisialisasi array nilai berdasarkan jumlah siswa
        nilai = new double[Siswa];
        double total = 0;

        // Memasukkan nilai siswa ke dalam array
        for (int A = 0; A < Siswa; A++) {
            System.out.println("Masukkan nilai siswa ke-" + (A) + ":");
            nilai[A] = input.nextDouble();
            total += nilai[A]; 
        }

        // Menghitung rata-rata
        double rataRata = total / Siswa;
        for (int A = 0; A < Siswa; A++){
            System.out.println(nilai [A] + " ");
        }
        System.out.println("Nilai rata-rata siswa adalah: " + rataRata);
        
        
    }
}