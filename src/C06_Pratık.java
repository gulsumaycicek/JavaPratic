import java.util.Scanner;

public class C06_Pratık {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı gırınız");

        int sayı= scanner.nextInt();

        String sonuc=(sayı>99 &&sayı<1000)?("üc basamaklı sayı"):(sayı%2==0  ?"3 basamklı olmayan cıft sayı":"3 basamaklı olmayan tek sayı yazdırın");
        System.out.println(sonuc);



    }


}
