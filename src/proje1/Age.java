package proje1;

import java.util.Scanner;

public class Age {


    /*
               Eğer age 10 dan küçük veya eşit ise
               facebook hesabi acmak icin cok gencsin print yapın.
               Eğer age 16 dan küçük veya eşit ise
               ehliyet almak icin cok gencsin print yapın.
               Eğer age 18 den küçük veya eşit ise
               dovme yaptirmak icin cok gencsin print yapın.
               Eğer age 21 den küçük veya eşit ise
               alkol icmek icin cok gencsin print yapın.
               Eğer age 21 den büyük ise
               istedigini yapabilirsin print yapın.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myAge = scanner.nextInt();

        //  code Start here don't change before this line

        //System.out.println("too young to drink alcohol");

        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin


        if (myAge <=10) {
            System.out.println("facebook hesabi acmak icin cok gencsin");
        } else if (  myAge <=16) {
            System.out.println("ehliyet almak icin cok gencsin");
        } else if ( myAge <= 18) {
            System.out.println("too young to get a tattoo");
        } else if ( myAge < 21) {
            System.out.println("alkol icmek icin cok gencsin");
        }else {
            System.out.println("istedigini yapabilirsin");
        }

    }

}
