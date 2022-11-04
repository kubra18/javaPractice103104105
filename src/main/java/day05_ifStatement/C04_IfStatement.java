package day05_ifStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input=new Scanner(System.in);

        System.out.println("lütfen cinsiyetinizi yaziniz..."+"\n kadin icin K \n Erkek icin E harfini giriniz..");
        char cins = input.next().toUpperCase().charAt(0);
        System.out.println("lütfen yasinizi giriniz");
        double yas = input.nextDouble();

if (cins=='K') {
    if (yas < 0 || yas > 120) {
        System.out.println("lütfen gecerli bir yas giriniz");
    } else if (yas > 60) {
        System.out.println("emekli olabilirsin");

    } else {
        System.out.println("emekli olamazsin" + (60 - yas)+ "calismalisin");

    }} else if (cins == 'E') {if(yas<0 && yas>120)
    {
        System.out.println("lutfen dogrun yas degerini giriniz");

    } if (yas>65){
        System.out.println("emekli olabilirsin");}
    else{
        System.out.println("emekli olamazsin"+(60-yas)+"calismalisin");}}
    else {
        System.out.println("lütfen gecerli bir harf giriniz");
    }
}}