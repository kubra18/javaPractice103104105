package practiceAdvanced.Practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {
    public static void main(String[] args) {
        /*
        0 ile 100 arasinda raastgele bir tahmini yapan bir kod yaziniz.
        ipucu : girdiginiz numara rastgeleNum dan kücükse ==>daha buyuk bir numara giriniz
                girdiginiz numara rastgeleNum dan buyukse ==>daha kucuk bir numara giriniz
                girdiginiz numara rastgeleNum ya esitse ==>tebrikler!!
         */
        int sayi = 50;

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int rastgeleNum = input.nextInt();


        do {System.out.println("Lütfen bir sayi giriniz");
            sayi = input.nextInt();

            if (sayi == rastgeleNum) {
                System.out.println("Tebrikler");
            } else if (sayi < rastgeleNum) {
                System.out.println("daha kucuk bir numara giriniz");
            } else if (sayi > rastgeleNum) {
                System.out.println("daha buyuk bir numara giriniz");
            } else {
                System.out.println();
            }
        }while (sayi != rastgeleNum) ;



        }

}
