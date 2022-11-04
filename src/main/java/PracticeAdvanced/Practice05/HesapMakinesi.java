package PracticeAdvanced.Practice05;

import org.w3c.dom.ls.LSOutput;

public class HesapMakinesi {
    public void toplama(int...a){
    int toplam = 0;
    for(int w:a){
        toplam +=w;

    }
        System.out.println("Toplam  ="+toplam);
    }
    public void cikarma(int a,int b)
    {
        System.out.println("Fark   =" +(a-b));
    }
    public void carpma(int...a){
        int carpm=1;
        for(int w:a){
            carpm *=w;
        }
        System.out.println("carpim=  "+carpm);
    }
    public void bolme(int a,int b){
        System.out.println("bölüm   ="+(a/b));
    }
}
