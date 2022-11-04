package day02_variables;
import java.util.Scanner;

public class C04_Scanner {


    //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini
    //  ekrana yazdiran programi yazdiriniz
    public static void main(String[] args) {
      Scanner scanner1= new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz...");
        int sayi=scanner1.nextInt();

        //bir sayinin birler basamagindaki rakam%10 ile

int sonRakam=sayi%10;
int ilkRakam=sayi/1000;

        System.out.println("ilk rakam + son rakam= "+(ilkRakam+sonRakam));


        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

        Scanner scan2=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz...");
        int sayi2=scan2.nextInt();

        int birler=sayi2%10;
        int onlar=(sayi2/10)%10;
        int yuzler=(sayi2/100)%10;
        System.out.println("birler basamagi"+birler);
        System.out.println("onlar basamagi"+onlar);
        System.out.println("yuzler basamagi"+yuzler);



    }

}
