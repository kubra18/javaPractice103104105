package day03_ifstatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {
        //kullanicidan alacaginiz iki sayiyi yine kullaniciya
        // sectireceginiz
        //dört islemden biri ile isleme koyup sonucu yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen \n toplama icin 1\n cikarma icin 2\n bolme icin 3\n carpma icin 4\n giriniz...");
        int islem = input.nextInt();


        System.out.println("lutfen 2 tamsayiyi giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if
        (islem == 1) {
            System.out.println("toplama isleminin sonucu=" + (num1 + num2));
        }
        else if
        (islem == 2)
        {
            System.out.println("cikarma isleminin sonucu=" + (num1 - num2));
        }
        else if
        (islem == 3) {
            System.out.println("bolme isleminin sonucu=" + (num1 / num2));
        }
        else if
            (islem == 4) {
            System.out.println("carpma isleminin sonucu=" + (num1 * num2));
        }
        else System.out.println("hatali giris yaptiniz");
    }}