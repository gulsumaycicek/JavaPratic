package proje2;

import java.util.Scanner;

public class sameFirtsAndLast {


    /*
    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse true değerini yazdırın.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true
    sadece  true veya false print et
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

        // code start here

        // Koda burdan başlayin

        if(useThisArray[0].equals(useThisArray[useThisArray.length-1])){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }

}
