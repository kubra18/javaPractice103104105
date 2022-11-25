package practiceAdvanced.Practice02;

public class Q06_BelirliToplamiVerenIkililer {
    public static void main(String[] args) {
        /*Toplamlari, verilen bir sayiya esit olan Array element
        ciftlerini yazdiran bir method olusturunuz

        //{4,6,5,-10,8,5,20} ==> 10
        4 + 6 = 10 ==> 10
           */
int []arr = {4,6,5,-10,8,5,20};
ikilileriBul(arr,10);

    }
    public  static void ikilileriBul(int[]arr,int number){

        for(int i = 0; i<arr.length;i++){

            for(int j = i+1 ; j< arr.length ; j++){

                if(arr[i] + arr [j] == number){
                    System.out.println(arr[i] + " " + arr[j] +"="+number);
                }
            }
        }





    }
}
