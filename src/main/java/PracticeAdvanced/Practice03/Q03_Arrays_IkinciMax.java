package PracticeAdvanced.Practice03;

import java.util.Arrays;

public class Q03_Arrays_IkinciMax {
    /*Bir array icerisinde min,max,ikinci max
   degerlerini olusturan array bulunuz
    input:   int []arr :{100,1000,-200,0,23467};
    output:
    */
    public static void main(String[] args) {
        int[]arr = {100,10001,-90,845,8787,0,1};

        //1. yol:
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("min: "+arr[0]+"max:  "+arr[arr.length-1]+"secMax:  "+arr[arr.length-2]);

        //"2. yol:
        int min = arr[0];
        int max = arr[0];
        int secondMax = arr[0];

        for (int w: arr) {
            if(w<min){
                min = w;
            }else if (w>max){
                secondMax = max;
                max = w;
            }else if (w>secondMax){
                secondMax = w;
            }
        }
        System.out.println("    min:   "+  min   +   "   secondmax:  "+secondMax   +   "    max:  "+max);
    }
}
