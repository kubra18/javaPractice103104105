package day14_inheritianceencapsulation;

public class KumandaRunner {
    public static void main(String[] args) {
        Test tv = new Test(102.10,80.00,40.45);  //Test(102.10,80.00,40.45),
        tv.gucDugmesi();//Kumandayla tv yi actim
        System.out.println(tv.kanalDegistirme(2));
        System.out.println(tv.sesAzaltma());//11
        System.out.println(tv.sesArtirma());//12
    }


}
