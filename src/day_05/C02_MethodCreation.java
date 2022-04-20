package day_05;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("cevirim yapacagınız islemı gırınız");
        String islem= scanner.next();
        System.out.println("cevırım mıktarını gırınız");
        double mıktar= scanner.nextDouble();
        donustur(islem,mıktar);

    }

    private static void donustur(String islem, double mıktar) {

        switch (islem){
            case "saat":
                System.out.println("merak ettıgın saat"+mıktar*60*60+"sanıyedır");
                break;
            case "mil":
                System.out.println("merak ettıgın mıl"+mıktar*1.61+"kılometredır");
                break;
            case "kg":
                System.out.println("merek ettıgın kılo"+mıktar*1000+"gramdır");
                break;

        }
        System.out.println("gecerlı bır sayı gırınız");
    }

}
