package day04_IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz...");

        String gun = input.next();

        if (gun.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun...");
        }else if(gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yahudiler icin kutsal gun...");
        } else if(gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hristiyanlar icin kutsal gun...");
        } else {
            System.out.println("Lutfen gecerli bir gun giriniz...");
        }
    //2.yol:
        String gun1 = input.next().toLowerCase();
        if (gun1.equals("cuma")){
            System.out.println("Müslumanlar icin kutsal gün");
        }else if (gun1.equals("cumartesi")){
            System.out.println("Müslumanlar icin kutsal gün");
        }else if (gun1.equals("pazar"))
        {
            System.out.println("hristiyanlar icin kutsal gün");}
            else{
            System.out.println("kutsal gün degil");




    }

    }}
