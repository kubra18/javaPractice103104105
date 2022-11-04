package PracticeAdvanced.Practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_Ekle_Cikar {
    /*
    Kullanicidan aldiginiz bir sayiyyi bir liste ekleyen,
    listten cikaran ya da mevcut bir elementi o sayi ile guncelleyen bir kod yaziniz.

    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer>list = new ArrayList<>();
        while (true){
            System.out.println(" Ekleme yapmak icin 'add'\n"+
                    "güncelleme yapmak icin 'delete'\n"+
                    "silmek icin 'delete'\n"+
                    "cikmak icin 'quit' komutunu giriniz");
            String option = input.next();
            if(option.equalsIgnoreCase("add")){
                System.out.println("eklemek istediginiz sayiyi giriniz");
                int ekleneceksayi=input.nextInt();
                list.add(ekleneceksayi);
            } else if (option.equalsIgnoreCase("delete")) {
                System.out.println("silmek istediginiz sayiyiy giriniz");
                int silineceksayi = input.nextInt();
                list.remove((Integer)silineceksayi);
                
            } else if (option.equalsIgnoreCase("update")) {
                System.out.println("güncellemek istediginiz sayiyiy giriniz");
                int guncelleceksayi=input.nextInt();
                System.out.println("girmek istediginiz yeni sayi");
                int yenisayi=input.nextInt();
                list.set(list.indexOf(guncelleceksayi),yenisayi );
                
                
            } else if (option.equalsIgnoreCase("quit")) {
                break;
            }else {
                System.out.println("gecerli bir komut giriniz");
                
            }

        }
    }
}
