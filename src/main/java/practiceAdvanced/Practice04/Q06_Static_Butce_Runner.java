package practiceAdvanced.Practice04;

public class Q06_Static_Butce_Runner {
    //Basit bir ev bütcesi kodu giriniz.
    public static void main(String[] args) {

        Butce baba = new Butce();
        System.out.println("Maas oncesi:   "+Butce.butce);
        baba.maasAl(5000);
        System.out.println("maas sonrasi butce:   "+Butce.butce);
        System.out.println(baba.harclik);
        baba.harclikAl(500);

        baba.harclikHarca(266);
        baba.butcedenHarca(1000);


        System.out.println("baba harclik"+baba.harclik);

        Butce anne = new Butce();
        anne.maasAl(2000);
        anne.maasAl(3000);
        anne.harclikAl(2000);

        Butce kiz = new Butce();
        kiz.harclikAl(500);
        kiz.harclikHarca(400);

        System.out.println("butce: "+Butce.butce);//
        System.out.println("Anne Harclik: "+anne.harclik);//
        System.out.println(Butce.butce);


    }
}
