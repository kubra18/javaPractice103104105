package PracticeAdvanced.Practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06_MountainArray {
    /*
    Bir Arrayin Mountain Array olup olmadigini kontrol eden bir kod yaziniz.
    Mountain Array: Element degerleri bir noktaya kadar surekli artip o noktadan sonra sürekli azalan Array
     */
    public static void main(String[] args) {
        int[] arr = {-999, 1, 2, 4, 6, 9, 22, 8, 5, 2, -100};
        List<Integer> list = new ArrayList<>();

        for (int w : arr) {
            list.add(w);
        }
        System.out.println("list = " + list);

        int max = arr[0];
        for (int w : arr) {
            if (w > max) {
                max = w;
            }
        }
        System.out.println("max = " + max);

        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                break;
            }
            list1.add(arr[i]);
        }
        System.out.println("list1 = " + list1);
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < list.indexOf(max)) {
                continue;
            }
            list2.add(arr[i]);

        }
        System.out.println("list2 = " + list2);

        List<Integer> list1Copy = new ArrayList<>(list1);
        System.out.println("list1Copy = " + list1Copy);

        Collections.sort(list1Copy);
        List<Integer> list2Copy = new ArrayList<>(list2);
        System.out.println("list2Copy = " + list2Copy);
        Collections.reverse(list2Copy);

        if (list1.equals(list1Copy) && list2.equals(list2Copy)) {
            System.out.println("Mountein Array");
        } else {
            System.out.println("degil");
        }

    }
}