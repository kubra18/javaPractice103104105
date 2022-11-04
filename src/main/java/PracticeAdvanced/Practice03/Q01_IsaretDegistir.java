package PracticeAdvanced.Practice03;

import java.util.Arrays;

public class Q01_IsaretDegistir {
    public static void main(String[] args) {
        //verilen bir array icerisindeki isaretleri dagostoren yeni array kodu yaziniz.
        int []arr = {1,-2,4,-10,15};
        int []brr = new int[arr.length];
        int idx = 0;
        for(int w:arr) {

            brr[idx] = w*-1;
            idx++;
        }
        System.out.println(Arrays.toString(brr));
    }
}
