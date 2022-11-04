package day02_variables;
import java.util.Scanner;
public class C05_Odev //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki
// rakamlarin toplamini bulunuz
//         *   Ex :
//         *   input  : 12345==>1+2+4+5=12
//         *   output : 12
//
//
{
    public static void main(String[] args) {
        Scanner scanner5=new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli bir sayi giriniz");
        int sayi= scanner5.nextInt();
        int birler= sayi%10;
        int onlar=(sayi/10)%10;
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000)%10;

        System.out.println(birler+onlar+binler+onbinler);




    }

}
