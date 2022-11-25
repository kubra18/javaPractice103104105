package practiceAdvanced.Practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {

        /*
        Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
        ad ayri soyad ayri sekilde ekrana yazdiriniz.
        örn:
        Ad: ALi
        Soyad: Can
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisminizi aralarinda bosluk olacak sekilde giriniz");

        String adsoyad = input.nextLine();
        String ad = adsoyad.substring(0,adsoyad.indexOf(" "));
        String soyad = adsoyad.substring(adsoyad.indexOf(" ")+1);

        System.out.println("Ad:   "+ad);
        System.out.println("Soyad:"+soyad);



    }
}
