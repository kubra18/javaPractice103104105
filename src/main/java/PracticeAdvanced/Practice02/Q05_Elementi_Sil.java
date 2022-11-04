package PracticeAdvanced.Practice02;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Elementi_Sil {
    public static void main(String[] args) {
        /*
        Elementleri kullanicidan alarak bir integer Array olusturunuz.
        kullanicidan indeks aliniz ve indeksteki elementi siliniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        for(int i=0; i<arr.length ;i++) {
            System.out.println("Giriniz: indeks" + i);
            arr[i] = input.nextInt();
        }
            System.out.println(Arrays.toString(arr));


            System.out.println("silmek istediginiz indeksi giriniz: ");
            int removeIndeks= input.nextInt();

            int idx = 0;
            int[] brr = new int [limit-1];
            for(int i = 0; i<arr.length; i++){
                if(removeIndeks==i){
                    continue;
                }else{
                    brr[idx] = arr[i];
                    idx++;
                }
            } System.out.println(Arrays.toString(brr));

            //2.Yol:
        List<Integer>numberlist = new ArrayList<>();
        for(int w : arr){
            numberlist.add(w);
        }
        System.out.println(numberlist);
        System.out.println("Silmek istediginiz elementin indexini giriniz");
        int silinecekidx = input.nextInt();
        numberlist.remove(silinecekidx);
        System.out.println(numberlist);

    }

    }

