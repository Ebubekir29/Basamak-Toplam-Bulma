import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,a,toplam = 0;

        System.out.print("Bir sayi giriniz : ");
        sayi = scan.nextInt();

        while (sayi != 0){
            a = sayi % 10;
            sayi /= 10;
            toplam += a;
        }
        System.out.println("Toplam : "+toplam);
    }
}
