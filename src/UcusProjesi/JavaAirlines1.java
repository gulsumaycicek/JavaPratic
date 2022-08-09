package UcusProjesi;

import java.util.Scanner;

public class JavaAirlines1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("javaAirlines'a hos geldin AGAM..\n B C D rotasından birini seciniz : ");
        String city = scan.next().toUpperCase();
        System.out.print("ucusunuz için \n tek yon-->1 \n cift yon-->2 \n giriniz : ");
        int flytype = scan.nextInt();
        System.out.print("agam yasını da gir : ");
        int age = scan.nextInt();
        double priceC = 0.10 * 700;
        double priceB = 0.10 * 500;
        double priceD = 0.10 * 900;

        if (city.equals("B") || city.equals("C") || city.equals("D")) {

            if (age > 65) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.7 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.7 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                }
            }
        }
    }
}
