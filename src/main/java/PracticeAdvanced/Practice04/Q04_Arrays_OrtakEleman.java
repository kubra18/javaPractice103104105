package PracticeAdvanced.Practice04;

import java.util.ArrayList;
import java.util.List;

public class Q04_Arrays_OrtakEleman {
    /*

     */
    public static void main(String[] args) {
        String[]arr = {"john","Brad","Ali"};
        String[]brr = {"ali","veli"};
        List<String>list= new ArrayList<>();

        for(String w:arr){
            for(String u:brr){
                if(w.equalsIgnoreCase(u)){
                    list.add(w);
                }
            }
        }
        System.out.println("Ortak elementler: "+list);
    }
}
