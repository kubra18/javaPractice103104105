package PracticeAdvanced.Practice01;

import java.util.Scanner;

public class Q05_Dowhile_Tahminioyunu {
    public static void main(String[] args) {
         /*
        0 ile 100 arasinda raastgele bir tahmini yapan bir kod yaziniz.
        ipucu : girdiginiz numara rastgeleNum dan kücükse ==>daha buyuk bir numara giriniz
                girdiginiz numara rastgeleNum dan buyukse ==>daha kucuk bir numara giriniz
                girdiginiz numara rastgeleNum ya esitse ==>tebrikler!!
         */
        int sayi;
        Scanner input = new Scanner(System.in);
        int rastgeleNum = (int) (Math.random() * 100) + 1;
        int sayac = 0;
        do {
            sayac++;
            System.out.println("lütfen bir sayi giriniz");
            sayi = input.nextInt();
            if (sayi == rastgeleNum) {
                System.out.println("Tebrikler");
            } else if (sayi < rastgeleNum) {
                System.out.println("daha buyuk bir numara giriniz");
                System.out.println(10 - sayac + "hakkiniz kaldi");
            } else if (sayi > rastgeleNum) {
                System.out.println("daha kucuk bir numara giriniz");
                System.out.println(10 - sayac + "hakkiniz kaldi");
            }
            if (sayac == 10) {
                System.out.println("hakkiniz bitti. oyunu kaybettiniz.\nTekrar oynamak icin 1,cikmak icin herhangi bir sayi girin");
                int secenek = input.nextInt();
                if (secenek == 1) {
                    sayac = 0;
                    rastgeleNum = (int) (Math.random() * 100) + 1;
                } else {
                    break;

                }

            }

        } while (sayi != rastgeleNum);
    }
}