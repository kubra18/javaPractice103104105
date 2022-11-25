package practiceAdvanced.Practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {
        /*
Kullanicidan 3 adet sayi alin ve bunlarin bir dik ucgen kenar uzunluklari olup olmdigini
hesaplayan bir kod yaziniz.
Örnek ekran ciktisi:
1.kenar :3
2.kenar :4
3.kenar :5
bu bir dik ucgendir

         */

        Scanner input = new Scanner(System.in);
        System.out.println("1.kenar: ");
        int a = input.nextInt();
        System.out.println("2.kenar: ");
        int b = input.nextInt();
        System.out.println("3.kenar: ");
        int c = input.nextInt();

        if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
            System.out.println("bu bir dik ücgendir");

        } else {
            System.out.println("bu bir dik ucgen degildir");
        }
    }
}