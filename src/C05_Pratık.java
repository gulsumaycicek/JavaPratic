import java.util.Scanner;

public class C05_Pratık {
    public static void main(String[] args) {


        /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.



                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("vıze notunu gırınız");
        double vıze = scanner.nextDouble();
        System.out.println("vıze sınavı ıcın hesaplama yuzdesını gırınız ");
        double vızeOran = scanner.nextDouble() / 100;


         System.out.println("fınal notunu gırınız");
        double fınal = scanner.nextDouble();
        System.out.println("fınal sınavı ıcın hesaplama yuzdesını gırınız");
        double fınalOran = scanner.nextDouble() / 100;

        double gecmeNotu = (vıze * vızeOran) + (fınal * fınalOran);
        System.out.println("gecme notunuz:" + gecmeNotu);

        if (gecmeNotu >= 90) {
            System.out.println("tebrıkler");
        } else if (gecmeNotu < 90 && gecmeNotu >= 80) {
            System.out.println("gayet basarılı BA");
        } else if (gecmeNotu < 80 && gecmeNotu >= 70) {
            System.out.println("gayet basarılı BB");

        } else if (gecmeNotu < 70 && gecmeNotu >= 60) {
            System.out.println("gayet basarılı CB");

        } else if (gecmeNotu < 60 && gecmeNotu >= 50) {
            System.out.println("gayet basarılı CC");
        } else if (gecmeNotu < 50 && gecmeNotu >= 40) {
            System.out.println("gayet basarılı DC");
        } else if (gecmeNotu < 40 && gecmeNotu >= 30) {
            System.out.println("gayet basarılı DD");
        }else {
            System.out.println("basarısız");
        }
    }
}