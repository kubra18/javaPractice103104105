package PracticeAdvanced.Practice04;

public class Q05_StringBuilderPolidrome {
    //Bir String degerin Polidrome olup olmadigini kontrol eden bir kod yaziniz
    public static void main(String[] args) {
    /*    String str = "nazan";
        String strReverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            strReverse += str.charAt(i);


        }
        System.out.println(strReverse);
        if(str.equalsIgnoreCase(strReverse)){
            System.out.println("Palidrom");
        }else{
            System.out.println("Palidrom degil");
        }*/
        String str ="nazan";
        StringBuilder stb = new StringBuilder("nazan");

        String strReverse = stb.reverse().toString();
        System.out.println(stb);

        if(str.equals(strReverse)){
            System.out.println("Palidrom");
        }else {
            System.out.println("palidrom degil");
        }
    }
}