package day_05;

import java.util.Scanner;

public class C08_H8 {
    public static void main(String[] args) {

           /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
         */

        int arr[]=new int[8];

        Scanner scanner=new Scanner(System.in);
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(i+".ındex elemanı gırınız");
            arr[i]= scanner.nextInt();
            if (arr[i]%3==0){
                sayac++;

        }


            }
        System.out.println("3 e tam bolulene bılen eleman sayısı:"+sayac);
        }


    }

