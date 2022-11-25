package practiceAdvanced.practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_MarketGunlukGelir {
    /*
    Günlük gelir market programi yaziniz.
    Tüm gunlerin gelirlerini gosteren bir method
    Haftalik gelir ortalamasini gosteren bir method
    Hangi gunlerin ortalama gelirden az geliri oldugunu gosteren bir method,
     */
    static List<String> gunler = new ArrayList<>(Arrays.asList("pazartesi", "sali", "carsamba", "persembe", "cuma", "cumartesi", "pazar"));
    static List<Double> gunlukGelirler = new ArrayList<>();
    static double toplamGelir = 0;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + "  gelirini giriniz");
            double gununGeliri = input.nextDouble();
            gunlukGelirler.add(gununGeliri);
            toplamGelir += gununGeliri;
            gun++;
        }
        System.out.println(gunlukGelirler);
        System.out.println("toplamGelir = " + toplamGelir);
        System.out.println("Gelir ortalamasi: " + gelirOrtalamasi());
        System.out.println(" Ortalama Ustu Günler:" + ortalamaUstuGunler());
        System.out.println(" Ortalama Alti Günler:" + ortalamaAltiGunler());
    }

    static double gelirOrtalamasi() {
        return toplamGelir / gunler.size();

    }

    static String ortalamaUstuGunler() {
        String str = "";
        for (int i = 0; i < gunlukGelirler.size(); i++) {
            if (gunlukGelirler.get(i) > gelirOrtalamasi()) {
                str += gunler.get(i) + "";
            }
        }

        return str;
    }

    static String ortalamaAltiGunler() {
        String str = "";
        for (int i = 0; i < gunlukGelirler.size(); i++) {
            if (gunlukGelirler.get(i) < gelirOrtalamasi()) {
                str += gunler.get(i) + "";
            }
        }

        return str;

    }
}