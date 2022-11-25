package day14_inheritianceencapsulation;

public class Test {

    private double genislik;

    private double yukseklik;

    private double ekranBuyuklugu;

    private int maxSes = 30;

    private int ses = 12;

    private boolean guc;

    public Test(double genislik,double yukseklik,double ekranBuyuklugu){
//Konstructer olusturdum
    this.genislik=genislik;
    this.ekranBuyuklugu=ekranBuyuklugu;
    this.yukseklik=yukseklik;
 }
    public double kanalDegistirme(int kanal){
        switch (kanal){
            case 1:
                return 34.75;
            case 2:
                return 45.23;
            case 3:
                return 50.89;
        }
        return 0;
    }
public void gucDugmesi(){//Kapaliysa acar aciksa kapatir.
        this.guc=!guc;
    }
    public  int sesAzaltma(){
        if(0<ses){//ses pozitifse azaltir.
            ses --;
        }
        return ses;
   }
    public int sesArtirma(){
     if(maxSes>ses){
         ses++;
     }
     return ses;
    }

}
