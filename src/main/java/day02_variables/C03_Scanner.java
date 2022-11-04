package day02_variables;
import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

  /*     /* Scanner input = new Scanner(System.in);
                System.out.println("Lütfen ismini giriniz...");
        String kullaniciIsmi= input.nextLine();
*/
        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
Scanner scan = new Scanner(System.in);
System.out.println("lütfen yaricapi giriniz...");
double r=scan.nextDouble();
System.out.println("cemberin cevresi= "+2*314*r/100 );
System.out.println("dairenin alani="+314*r*r/100);

//Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
// cevre hesabini yapan bir program yaziniz.
        Scanner scan2=new Scanner(System.in);
        System.out.println("lütfen kisa kenari giriniz");
        double kisa=scan2.nextDouble();
        System.out.println("lütfen uzun kenari giriniz");
        double uzun=scan2.nextDouble();

        System.out.println("Dikdörtgenin alani ="+kisa*uzun);
        System.out.println("dikdortgenin cevresi"+(2*kisa+2*uzun));


        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
// Ucgenin cevresi=a+b+c

        Scanner input= new Scanner(System.in);

        System.out.println("ucgenin bir kenarını girin");
        byte x=input.nextByte();
        System.out.println("ucgenin ikinci kenarını girin");
        byte y= input.nextByte();
        System.out.println("ucgenin ucuncu kenarını girin");
        byte z= input.nextByte();


        System.out.println("Cevre: "+ (x+y+z));

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */

Scanner scan4 =new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char ch=scan4.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);


    }



    }

