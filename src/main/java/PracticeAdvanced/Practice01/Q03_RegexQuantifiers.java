package PracticeAdvanced.Practice01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {
        // Bir String degerin belirli sayida karakter icerip belirli bir karakter
        // ile bitip bitmedigini kontrol eden bir kod yaziniz.

        String str = "as";
        System.out.println(str.matches(".s"));//true==>herhangi bir karakterle baslayip s ile bitiyor.
        //matches() methodu regex ile calisip String degerin regex ile karsilastirmasini yapar.

        //Bir String degerin ikinci karakterinin belirli bir karakter olup olmadigini kontrol eden bir kod yazinniz.
        System.out.println("lkdshfdskfl".matches(".k.*"));//true

        //Bir String degerin sadece harf icerip icermedigini kontrol eden bir kpod yaziniz.
        System.out.println("x".matches("[A-Za-z]*"));

        //Bir string degerinin bir sayida belirli karakterleri icerdigini kontrol eden bir kod yaziniz

        System.out.println("Abdhg".matches("[a-zA-Z]{5}"));//==>True 5 karakterli ve hepsi harf

        //Bir string degerinin belirli karakterleri en az belirli sayida icerip icermedigini
        // kontrol eden bir kod yaziniz
        System.out.println("1234567".matches("[0-9]{6,}"));//true==> en az 6 rakam iceriyor.

        //ilk karakter 1,3 karakter noktalama isareti ve kalan 8 karakter toplam 12 karakter olmali
        System.out.println("1?!.12345678".matches("[1][\\p{Punct}]{3}[0-9]{8}"));

    }
}
