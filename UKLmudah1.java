import java.util.Scanner;
public class UKLmudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menggunakan percabangan

        //masukan variabel

        int jarakMinimum = 10;
        int harga1 = 5000;
        int harga2 = 10000;
        int harga3 = 50000;
        int volumeMinimum = 100;

        //masukan inputan

        System.out.println("masukan barang paket: ");
        int berat = input.nextInt();

        System.out.println("masukan jarak tempuh: ");
        int jarakTempuh = input.nextInt();

        System.out.println("masukan tinggi barang: ");
        int t = input.nextInt();

        System.out.println("masukan lebar barangt: ");
        int l = input.nextInt();

        System.out.println("masukan panjang barang: ");
        int p = input.nextInt();

        int resultVolume = p*l*t; //menghitung volume 
        
        if(jarakTempuh <= jarakMinimum){
            int result1 = harga1 * berat;
            if(resultVolume > volumeMinimum){
                int finalResult = result1 + harga3;
                System.out.println("biaya yang hatus dibayar " + finalResult);
            }else{
                System.out.println("biaya yang harus dibayar " + result1);
            }

        }else if(jarakTempuh > jarakMinimum){
            int result2 = harga2 * berat;
            if(resultVolume > volumeMinimum){
                int finalResult = result2 + harga3;
                System.out.println("niaya yang harus dibayar " + finalResult);
            }else{
                System.out.println("biaya yang harus dibayar " + result2);
            }
        }
    }
}
