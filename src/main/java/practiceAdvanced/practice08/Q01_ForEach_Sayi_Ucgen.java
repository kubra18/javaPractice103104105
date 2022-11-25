package practiceAdvanced.practice08;

import java.util.Scanner;

public class Q01_ForEach_Sayi_Ucgen {
    /*
    alttaki sekli veren kodu yaziniz.

    1 2 3 4 5  6
     2 3 4 5 6
      3 4 5 6
       4 5 6
        5 6
         6
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisinin giriniz");
        int satirSayisi = input.nextInt();

        for(int i=1; i<=satirSayisi; i++){

            for( int bosluk = 1; bosluk<i ; bosluk++){
                System.out.print(" ");
            }
            for (int sayi = i; sayi<=satirSayisi; sayi++){
                System.out.print(sayi+" ");
            }
            System.out.println();
        }
    }
}
