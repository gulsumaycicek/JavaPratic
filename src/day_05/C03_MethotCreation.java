package day_05;

import java.util.Scanner;

public class C03_MethotCreation {
    public static void main(String[] args) {

        /*

 addDigits isminde bir yöntemi ediniz oluşturun.
    Parametresi int
 İade tipi de int
 Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları bir ettiren topla.
 Tek basamaklı haberin, dönüş etsin
    Örnek1:
    Girdi 38
    Çıktı: 2
 Açıklama: İşlemler şöyle: 3 + 8 = 11, 1 + 1 = 2.
 2 , tek basamaklı kadar, bunu döndürün.
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("bır sayı gırınız");
        int sayı = scanner.nextInt();
        addDigits(sayı);
        System.out.println("dırdıgınız sayının tek hanelı rakamlar toplamı"+addDigits(sayı));

    }

    private static int addDigits(int sayı) {

        while (sayı >= 10) {
            sayı = rakamTopla(sayı);
        }
        return sayı;
    }

    private static int rakamTopla(int sayı) {
        int rakam = 0;
        int toplam = 0;

        while (sayı > 0) {
            rakam = sayı % 10;
            toplam += rakam;
            sayı/=10;



        }
        return toplam;

    }
}

