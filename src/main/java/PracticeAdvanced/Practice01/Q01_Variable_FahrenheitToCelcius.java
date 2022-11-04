package PracticeAdvanced.Practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelcius {
    public static void main(String[] args) {
        //Fahrenheit degeri, Celsiuc degere ceviren kod yaziniz.
        //formül:c = (f-32)*5/9


        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz");

        double f = input.nextDouble();
        double c = (f-32)*5/9;

        System.out.println(c);

        NumberFormat numberFormat = new DecimalFormat(".00");
        String formettedC = numberFormat.format(c);
        System.out.println("formattedC = "+formettedC);
    }
}
