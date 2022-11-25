package practiceAdvanced.practice08;

import java.util.ArrayList;
import java.util.List;

public class Q06_List_RastgeleSayi {
    /*
    Bir list icerisine 0 dan 20 ye kadar rastgele 10 tam sayi atayan ve
    atanan cift sayilari "cift sayi" String degerine donusturen bir kod yaziniz. Eger cift sayi
    icermezse "Cift sayi yoktur" yazdirin.

    örn: [19,11,10,19,4,6,15,18,1,14]
    [19, 11, cift sayi, 19,cift sayi,cift sayi,15,cift sayi,1,cift sayi]
     */
    public static void main(String[] args) {

    }
    static void rastgeleSayiEkle() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            list.add((int) (Math.random() * 21));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if ((int) (list.get(i)) % 2 == 0) {
                list.set(i, Integer.valueOf("ciftSayi"));

            }
            System.out.println(list);
            if (!list.contains("CiftSayi")) {
                System.out.println("Cift Sayi Yoktur");
            }

        }
    }}

