import java.util.Scanner;
public class UKLsedang1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        //menggunakan percabangan

        //masukan inputan
        System.out.println("masukan bilangan bulat positif");
        int bilangan = Scanner.nextInt();

        //validasi apakah bilangan tersebut positif
        if(bilangan < 0){
            System.out.println("bilangan harus positif");
        }else{
            //menghitung faktorial
            int faktorial = 1;
            for(int A = 1; A <= bilangan; A++){
                faktorial*= A;
                
            }
            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }
        
    }
}
