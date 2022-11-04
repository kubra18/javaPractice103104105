package day09_nestedforlooop;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
          /*
            Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
         'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
         */
        String str = "aksödjkaaclkaasxlada";
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                sayac++;
            } else if (str.charAt(i) == 'c') {
                break;

            }
        }
        System.out.println(sayac);

        /* 1'den 100'e kadar hic rakam  kullanmadan sayilari konsola yazdiriniz*/


        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
         /* tac uzunlugu -> 6 iken
            ^
            ^^
            ^^^
            ^^^^
            ^^^^^
           ^^^^^^
            |||
            |||
            |||
            |||
            |||
     */

        int tac = 6;
        String yprk = "";
        for (int i = 1; i < 7; i++) {
            yprk += "^";
            System.out.println(yprk);

        }
        for (int i = 1; i < 6; i++) {
            System.out.println("|||");

        }
          /*
      Adada yalnız bir maymun var
      Her gün 4 muz yemesi gerekiyor
      o adada sadece 165 muz var
      Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
      Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
      int MuzSayısı =165, hayatta kalmaDays = 0;
      boolean maymunAlive = true;
      */
        //Maymunun kac gun hayatta kalacagini gosteren kod
        //Hayatta kaldigi suerece muz vermelisin(DO While)
        //eger 4 ten az muz kalirsa maymunlar olur

        int muz = 165;
        boolean MaymunAlive = true;
        int survivalDays = 0;

        do {
            muz -= 4;
            survivalDays++;

            if (muz < 4) {
                MaymunAlive = false;
                System.out.println("bugün   " + survivalDays + "muz kalmadi.Maymun oldü");
            } else System.out.println(survivalDays+"maymun hala yasiyor");
        } while (MaymunAlive);
        System.out.println("maymunun yasadigi gün sayisi" + survivalDays);

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya geldiginde bunlari yazmasin

/*
     Kullanicidan toplanmak uzere sayilar isteyin.
     Sayi adedi 10'u gecerse yada toplami 500'u gecerse
    " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
     */
        Scanner inptt = new Scanner(System.in);


        sayac = 0;
        int sum = 0;
        while (sayac < 11 && sum < 500) ;
        {
            System.out.println("Lütfen toplanmak uzere sayilar giriniz.");
            int sayi = inptt.nextInt();
            sum += sayi;
            sayac++;
        }
            if ((sum > 500) || (sayac >10)){
                System.out.println(sayac+ "adet sayi girdiniz. toplami"+sum+"kadardir");
            }else
            System.out.println("Bu kadar sayi yeter" + sayac + "adet sayi girdiniz.Toplami" + sum + "kadardir");
        }
    }

