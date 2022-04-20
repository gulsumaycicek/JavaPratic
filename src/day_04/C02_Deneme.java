package day_04;

import java.util.Scanner;

public class C02_Deneme {
    public static void main(String[] args) {


        /* GÖREV:
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir üçlü
         * kullanarak harflerin benzersiz(farkli) olup olmadigina bakiniz örneğin: ala => 3
         * Test verileri: ali eme all
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("isim giriniz");
        String isim= scanner.nextLine();
        char c1=isim.charAt(0);
        char c2=isim.charAt(1);
        char c3=isim.charAt(2);



                String  sonuc =  isim.length()==3 ?((c1!=c2 && c1!=c3 && c2!=c3)?"girdiginiz isim 3 harfli ve uniq karaktere sahip":
                "girdiginiz isim 3 harfli ve uniq karaktere sahip değil"):"Girdiginiz isim 3 harfli değil";
        System.out.println(sonuc);


    }
}
