package day03_ifstatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {


        char harf1='a';
        char harf2='A';

        System.out.println(" harf1 ==>harf2  "+ (harf1>harf2));
        //Karsilastirma islemlerinin sonucunu true ya da false doner

        //Buyuk harflerin ascii degerleri kücük harflerin ascii degerlerin
        // ascii degerlerinden daha kucuktur

        //herhangi bir char variablenin ascii degerlerini kod yazarak bulunuz

        // 1.yol:

        char space=' ';
        System.out.println("Spacenin ascii degeri: "+(space+0));

        //toplamaya etkisi  olmayan sifiri sectim boylece
        // yazzdirdigimiz deger bize yazdirdigimiz ascii degeri verir

        char m='m';
        System.out.println("m'nin ascii degeri:  "+(m+0));


        //2.yol:

        int harf3='m';
        System.out.println("m'nin ascii degerini yazdir = " + harf3);

        //char larda java char karakteri integer atayabiliriz.
        //cunku charin bir resim bir de sayisal ascii
        // degeri vardir bu nedenle ascii degerlerini hesaplaayabiliriz.


        byte b1=12;
        byte b2=-125;
        System.out.println("b1>b2==> "+(b1>b2));

        float f1= 2.34757465f;
        float f2= 5.87987F;

        System.out.println("f1>f2 ==>  " + (f1>f2));




    }
}
