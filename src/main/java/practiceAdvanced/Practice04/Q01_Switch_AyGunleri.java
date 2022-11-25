package practiceAdvanced.Practice04;

import java.util.Scanner;

public class Q01_Switch_AyGunleri {
    /*
    Girilen yil ve ay numarasina gore ayin kac gün oldugunu yazdiran bir kod yaziniz.
    Girdi yil: 2000 ay:2
    cikti:29
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yili Gririniz");
        int yil= input.nextInt();
        int ay = input.nextInt();
        int gun;

        switch (ay){
            case 1: case 3:
            case 5: case 7:
            case 8: case 10: case 12:
                gun =31;
                System.out.println("girdiginiz ayin gun sayisi = " + gun);
                break;
            case 4: case 6: case 9: case 11:
                gun=30;
                System.out.println("girdiginiz ayin gun sayisi = " + gun);
                break;
            case 2:
                if ((yil%4==0)){
                    gun=29;

                }else {
                    gun=28;
                    System.out.println("girdiginiz ayin gun sayisi"+ gun);
                }break;
            default:
        }
    }
}
