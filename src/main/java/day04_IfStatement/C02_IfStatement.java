package day04_IfStatement;

import java.util.Scanner;

public class C02_IfStatement { /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notu giriniz");
        int a = input.nextInt();

        if (100>=a  && a>=90){
            System.out.println("A=cok iyi");
        }
            else if (90>a && 80<=a){
                System.out.println("B=iyi");
            } else if (a<80 && 70<=a) {
                System.out.println("C=orta");
            }
            else if (a<70 && a>=60 )
            {
                    System.out.println("D=Gecer");
                }
            else {
                System.out.println("Zayif");



            }
        }
    }

