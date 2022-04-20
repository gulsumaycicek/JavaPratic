package proje1;

import java.util.Scanner;

public class perfectSquare {


    /*
    Pozitif bir int  num verildiğinde, return edildiği zaman num tamkare ise true veren değilse false veren bir foksiyon yazın.
 Not: sqrt gibi fonksiyonları  kullanmayın.
        Example 1:
        Input: 16
        Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16
        Example 2:
        Input: 25
        Output: true
        Note: bu sayı tamkare çünkü 5*5=25
        Example 3:
        Input: 14
        Output: false
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir tam sayi giriniz : ");
        int input = scanner.nextInt();

        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

        int x = 0;
        for (int i = 0; i <= input / 2 + 1; i++) {

            if (input == i * i) {
                x = 1;
            }
        }
        if (x == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
