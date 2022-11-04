package day10_arrays;

import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {


    /*
    Interwiew
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
    Test data
    hackerDili("java ile hersey guzel")
    j4v4 1l3 h3r53y guz3l
    İpucu harfleri değiştirin ve ekrana yazdırın.

   */


            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir cumle giriniz");
            String str = input.nextLine();

            String arr[] = new String[str.length()];

            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.substring(i, i + 1);
                switch (arr[i]) {
                    case "a":
                        arr[i] = "4";
                    case "s":
                        arr[i] = "5";
                    case "e":
                        arr[i] = "3";
                    case "i":
                        arr[i] = "1";
                    case "o":
                        arr[i] = "0";

                }
                System.out.println(arr[i]);
            }


        }

    }