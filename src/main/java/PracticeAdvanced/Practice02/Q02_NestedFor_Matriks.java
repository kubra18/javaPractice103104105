package PracticeAdvanced.Practice02;

import java.util.Scanner;

public class Q02_NestedFor_Matriks {
    public static void main(String[] args) {
        /*
        2 boyutlu bir tablo olarak ekrana carpim tablosunu hesaplayip yazdiran kodu yaziniz.

        Örnek ekran ciktisi
        1 2 3 4 5
        2 4 6 8 10
        3 6 9 12 15
        4 8 12 16 20
        5 10 15 20 25
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi = input.nextInt();

        for (int i = 1; i < sayi + 1; i++) {//satir kontrolu
            for (int j = 1; j < sayi + 1; j++) {
                System.out.println(String.format("%2d", j * i));
            }
        }

    }
}