package PracticeAdvanced.Practice05;

public class Q03 {
    //Küp, kare prizma ve dikdortgenler prizmasinin hacmini hesaplayan kodu yaziniz.
    public static void main(String[] args) {

        Hacim hacim = new Hacim();

        int karePrizma = hacim.hacimHesapla(5,6);
        int dikdortgenPrizma = hacim.hacimHesapla(2,3,4);
        System.out.println("kare prizma =  "+ karePrizma);
        System.out.println("dikdortgen prizma=   "+dikdortgenPrizma);
        System.out.println(hacim.hacimHesapla(10));


    }
}
