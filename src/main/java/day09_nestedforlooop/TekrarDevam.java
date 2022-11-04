package day09_nestedforlooop;

import java.util.Scanner;

public class TekrarDevam {
    public static void main(String[] args) {
        /*
     Kullanicidan toplanmak uzere sayilar isteyin.
     Sayi adedi 10'u gecerse yada toplami 500'u gecerse
    " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
     */
        Scanner inptt = new Scanner(System.in);
        int sayac = 0;
        int sum = 0;
        while (sayac < 11 && sum < 500)
        {
            System.out.println("Lütfen toplanmak uzere sayilar giriniz.");
            int sayi = inptt.nextInt();
            sum += sayi;
            sayac++;
        }
        if ((sum > 500) || (sayac >10)){
            System.out.println("Bu kadar sayi yeter" + sayac + "adet sayi girdiniz.Toplami" + sum + "kadardir");

        }else
            System.out.println(sayac+ "adet sayi girdiniz. toplami"+sum+"kadardir");
        //Asagidaki sekli yazdiran kodu yaziniz
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
//


    }
}


