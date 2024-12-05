import java.util.Random;
import java.util.Scanner;
public class UKLsedang3 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        Random random = new Random();

        //pilihan jenis kuis
        while (true) {
        System.out.println("Pilih Jenis Kuis (Pilih Angkanya)");
        System.out.println("1.Perkalian, 2.Pembagian, 3.Modulus,4. penjumlahan,5. pengurangan,6.Exit");
        int jenis = input.nextInt();

        if (jenis == 6) { // Pilihan untuk keluar
            System.out.println("Terima kasih telah bermain!");
            break;
        }
        //validasi pilihan
        if (jenis < 1 || jenis > 6) {
            System.out.println("Pilihan tidak valid. Silakan pilih ulang.");
            continue; 
        }
        //menghasilkan angka acak
        int num1 = random.nextInt(50) + 1;
        int num2 = random.nextInt(49) + 1; 
        int correctAnswer = 0;
        String operator = "";
        
        if (jenis == 1) { // Perkalian
            operator = "*";
            correctAnswer = num1 * num2;
        } 
        else if (jenis == 2) { // Pembagian
            operator = "/";
            correctAnswer = num1 / num2;
            num1 = correctAnswer * num2; 
        } 
        else if (jenis == 3) { // Modulus
            operator = "%";
            correctAnswer = num1 % num2;
        }
        else if(jenis == 4){//penjumlahan
            operator = "+";
            correctAnswer = num1 + num2;
        }
        else if (jenis == 5){//pengurangan
            operator = "-";
            correctAnswer = num1 - num2;
        }

        //jawab benar
        System.out.printf("%d %s %d = ", num1, operator, num2);
            int userAnswer = input.nextInt();
            if (userAnswer == correctAnswer) {
                System.out.println("Jawaban benar");
            } else {
                System.out.printf("Jawaban salah. Jawaban yang benar adalah %d ", correctAnswer);
            }
        


        }
    }
}
