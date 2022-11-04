package PracticeAdvanced.Practice05;

import java.util.Scanner;

public class Q02_NestedFor_Ucgen {
    public static void main(String[] args) {
        /*

      kullanicidan aldiginiz satur sayisina göre asagidaki ucgeni yazdiriniz

                    *
                   * *
                  * * *
                 * * * *
                * * * * *

 */
        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisini giriniz");
        int satir = input.nextInt();



        for( int i= 0; i<satir; i++){
            for (int bos = satir-i; bos>1;bos--){
                System.out.print(" ");
            }
            for (int yildiz=0;yildiz<=i; yildiz++){
                System.out.print("* ");
            }
            System.out.println();
            }

        }
    }

