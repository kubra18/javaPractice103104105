package day05_ifStatement;

import java.util.Scanner;

public class C03_ifStatement {
    public static void main(String[] args) {
        //Soru 8) Kullanicidan maas icin bir teklif isteyin ve
// asagidaki degerlere gore cevap yazdirin.
//Teklif 20.000’in uzerinde ise "Kabul ediyorum" ,
//10000 – 20.000 arasinda ise "Konusabiliriz",
//10.000’nin altinda ise "Maalesef Kabul edemem" yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen maasinizi giriniz");
        double maas = input.nextDouble();

        if(maas>=20000){
            System.out.println("kabul ediyorum");
        } else if (maas>=10000 && maas<20000) {
            System.out.println("konusabiliriz");


        } else if (maas<10000) {
            System.out.println("maalesef kabul edemem");

        }
    }
}
