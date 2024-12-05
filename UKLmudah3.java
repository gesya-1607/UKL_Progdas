import java.util.Scanner;
public class UKLmudah3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        //mengguakan perulangan 
        System.out.println("batas atas");
        int atas = Scanner.nextInt();

        System.out.println("batas bawah");
        int bawah = Scanner.nextInt();
        
        for(int A = atas; A >= bawah; A-- ){
            if(A % 3 == 0){
                System.out.println(A + ". Saya angkatan 33");
            }else if(A % 3 == 1){
                System.out.println(A + ". Saya anak wikusama");
            }else if(A % 3 == 2){
                System.out.println(A + ". Saya anak moklet");
            }
        }
        System.out.println("1. Saya senang");
    }
}
