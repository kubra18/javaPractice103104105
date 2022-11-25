package practiceAdvanced.Practice06;

public class Q04_Kütüphane {
    //kütüphaneye eklemek istediginiz kitaplari
    // adi, yazar adi,sayfa sayisi, seri numarasi ile yazdiran bir kod yaziniz.
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap("Harry potter","jk rowling",500);
        kitap1.kitapBilgileri();
        Kitap kitap2= new Kitap("1984","george Orwell",352);
        kitap2.kitapBilgileri();



    }

}
