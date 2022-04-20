package day02_Pratık;

import java.util.Scanner;

public class C01_SwichCase {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("yılın kacıncı ayını ogrenmek istıyorsunuz");
        int ay= scanner.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("gırdıgınız ayda 31 gun vardır");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("gırdıgınız ayda 30 gun vardır");
                break;

            case 2:
                System.out.println("lutfen bulundugunuz yılı gırınız");
             int yıl= scanner.nextInt();
             if (yıl% 4 ==0){

                 System.out.println("gırdıgınız ayda 29 gun vardır");

             }else {
                 System.out.println("gırdıgınız ayda28 gun vardır");
             }
             break;
            default:
                System.out.println("yılda 12 ay vardır");
        }



        }
        }