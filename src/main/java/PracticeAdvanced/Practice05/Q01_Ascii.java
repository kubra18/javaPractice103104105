package PracticeAdvanced.Practice05;

import java.util.Scanner;

public class Q01_Ascii {
    //kullanicidan alinan iki karakter arasinda bulunan tüm karakterleri yazdiran bir kod yaziniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk karakteri giriniz");
        char ch1 = input.next().charAt(0);
        System.out.println("ikinci karakteri giriniz");
        char ch2 = input.next().charAt(0);

        int ilk = Math.min(ch1,ch2);
        int son = Math.max(ch2,ch1);

        for(int i=ilk; i<=son;i++){
            System.out.print((char)i+" ");
        }


    }
}


