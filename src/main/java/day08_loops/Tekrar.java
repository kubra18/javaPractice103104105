package day08_loops;

import java.util.Scanner;

public class Tekrar {
    /*
      Kullanicidan bir cumle ve bir harf alin,
      Cumlede verilen harfin kac kere
      kullanildigini bulup, yazdirin
      ORNEK:
      INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e
      OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz.");
        String cumle = input.nextLine().toLowerCase();
        System.out.println("bir harf giriniz");
        char harf = input.next().toLowerCase().charAt(0);
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }

        }
        System.out.println("girdiginiz harf " + sayac + "  keredir");

 /*
 EX :Kullanicidan bir kelime isteyiniz
  alinan kelimenin karakter dizisinin her harfi ve
  bu harfin karakter dizisi içindeki indexini birer satıra yazdirin
          ORNEK
   Bir kelime giriniz:istanbul
    Karakter        Index
      i               0
      s               1
      t               2
      a               3
      n               4
      b               5
      u               6
      l               7
  */

        Scanner inpt = new Scanner(System.in);
        System.out.println("Bir kelime Giriniz");
        String kelime = inpt.nextLine();
        System.out.println("karakter" + "\tIndex");

        for (int i = 0; i < kelime.length(); i++) {
            System.out.println(kelime.charAt(i) + "           " + i);
        }
        System.out.println();



         /*
    Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
    tekrarlayan kodu yaziniz
   * ornek:  input            output
   *         elma  2           eaea
   *         army  3           ayayay
   */
        Scanner input2 = new Scanner(System.in);
        System.out.println("lütfen bir kelime girin");
        String klime = input2.nextLine();

        System.out.println("kac kez tekrarlansin");
        int tkrr = input2.nextInt();
        String ilkson = klime.substring(0, 1) + klime.substring(klime.length() - 1);
        String ckt = "";


        for (int i = 1; i < tkrr + 1; i++) {
            ckt += ilkson;

        }System.out.println(ckt);

        /*
            *
           * *
          *   *
         *     *
        *********
         */
        // Sekilde gorulen ucgeni yazdiriniz

for(int i=1; i<6;i++){
    for(int j=1;j<10;j++){
        if((i==1 && j==5)||(i==2 && (j==4 || j==6)) || (i==3 && (j==3 || j==7)) || (i==4 &&(j==2||j==8)) || i==5 ){
            System.out.println("*");
        }else{
            System.out.println(" ");
        }
    }
}
        System.out.println();
    }
}