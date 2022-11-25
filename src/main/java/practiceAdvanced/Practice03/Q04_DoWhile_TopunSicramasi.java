package practiceAdvanced.Practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {
    /*
Bir top belirli bir yukseklikten atilmaktadir. (Scanner ile yuksekligi al)
Atildiktan sonra, atildigi yüksekligin 3/4 u kadar yerden yukari sicramaktadir.
Top ziplama yuksekligi 1 metrenin altina indiginde durmaktadir.
Bu ana kadar aaldigi toplam yolu ve yere vurma sayisini bulan do while kodunu bulunuz.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Birakilan yuksekligi gir");
        double yukseklik = input.nextDouble();
        double toplamYol = 0;
        int vurmaSayisi = 0;
    do {
        vurmaSayisi++;
        toplamYol+=yukseklik;
        yukseklik = yukseklik*0.75;
         toplamYol+=yukseklik;


    }while(yukseklik>1);
        System.out.println("vurmaSayisi = " + vurmaSayisi);
        System.out.println("toplamYol = " + toplamYol);
        NumberFormat numberFormat = new DecimalFormat(".#");
        System.out.println(numberFormat.format(toplamYol));
        }
    }


