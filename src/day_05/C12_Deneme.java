package day_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_Deneme {


        static List<String> urunListesi=new ArrayList<>();
        static List<Double>urunFiyatlari=new ArrayList<>();
        static  double toplamOdeme;
        static Scanner scanner=new Scanner(System.in);

        public static void main(String[] args) {




            urunListesi.add("Domates- urun kodu: 0");
            urunListesi.add("Patates- urun kodu:1");
            urunListesi.add("Biber-urun kodu:2");
            urunListesi.add("lira- urun kodu:3");
            urunListesi.add("Durduk-urun kodu:4");
            urunListesi.add("Elma-urun kodu:5");
            urunListesi.add("Muz- urun kodu:6");
            urunListesi.add("Çilek- urun kodu:7");
            urunListesi.add("Kavun-urun kodu:8");
            urunListesi.add("Uzum- urun kodu:9");
            urunListesi.add("Limon- urun kodu:10");


            urunFiyatlari.add(2.10);
            urunFiyatlari.add(3.20);
            urunFiyatlari.add(1.50);
            urunFiyatlari.add(2.30);
            urunFiyatlari.add(3.10);
            urunFiyatlari.add(1.20);
            urunFiyatlari.add(1.90);
            urunFiyatlari.add(6.90);
            urunFiyatlari.add(4.30);
            urunFiyatlari.add(2.70);
            urunFiyatlari.add(0.50);

            System.out.println(urunListesi);
            musteriSecim();
        }
    private static void musteriSecim() {
        System.out.print("sectiginiz urun kodu giriniz : ");
        int secim=scanner.nextInt();

        System.out.print("sectiginiz urunden kaç kilo alacaksınız : ");
        double kilo=scanner.nextDouble();

        double urunTutari=kilo*urunFiyatlari.get(secim-1);
        toplamOdeme+=urunTutari;

        System.out.print("devam etmek istiyorsanız 1 kasa için 2 seçiniz :");
        int devam=scanner.nextInt();
        if (devam==1){
            musteriSecim();//recursive method
        }else
            kasa();
    }
    private static void kasa() {
        System.out.println("yine bekleriz odemen gereken para : "+toplamOdeme);









    }
}
