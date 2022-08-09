package GEOMETRIPROJESI;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Cember yarıcapı gırınız");
        double yarıcap= scan.nextDouble();

        Cember circle=new Cember( yarıcap);

        circle.cevreHesaplama( yarıcap);
        circle.alanHesaplama( yarıcap);



        System.out.println("Karenin kenar uzunlugunu gırınız");
        int kenar= scan.nextInt();
        Kare square = new Kare(kenar);

        square.alanHesaplama(kenar);
        square.cevreHesaplama(kenar);


        System.out.println("Dikdortgen uzun kenar ve kısa kenar  gırınız");
        double uzunkenar= scan.nextDouble();
        double kısakenar=scan.nextDouble();

        Dikdortgen rectengle= new Dikdortgen(uzunkenar,kısakenar);

        rectengle.alanHesaplama(uzunkenar,kısakenar);
        rectengle.cevreHesaplama(uzunkenar,kısakenar);
    }


    }



