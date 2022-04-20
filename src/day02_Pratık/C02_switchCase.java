package day02_Pratık;

import java.util.Scanner;

public class C02_switchCase {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Pazartesı1\n Salı2:\n Carsamba3:\n Persembe4:\nCuma5:\nCmartesı6:\nPazar7:Haftanın kacıncı gunu oldugunu yazınız");

       int kacınCıgun= scanner.nextInt();
        System.out.println("kac gun sonrasını ogrenmek ıstıyorsunuz");

int kacGunSonrası= scanner.nextInt();
int bulunanGun=(kacGunSonrası+kacınCıgun)%7;
if (kacınCıgun<=0&&kacınCıgun>=7) {
    System.out.println("hatalı verı gırıldı");
}


    switch (bulunanGun) {

        case 1:
            System.out.println(kacGunSonrası + "gun sonra gunlerden PAZARTESI");

        case 2:
            System.out.println(kacGunSonrası + "gun sonra gunlerden SALI");
        case 3:
            System.out.println(kacGunSonrası + "gun sonra gunlerden CARSAMBA");
        case 4:
            System.out.println(kacGunSonrası + "gun sonra gunlerden PERSEMBE");
        case 5:
            System.out.println(kacGunSonrası + "gun sonra gunlerden CUMA");
        case 6:
            System.out.println(kacGunSonrası + "gun sonra gunlerden CUMARTESI");
        case 0:
            System.out.println(kacGunSonrası + "gun sonra gunlerden PAZAR");
            break;
        default:
            System.out.println("haftada yedı gun var-(");

    }
}


    }

