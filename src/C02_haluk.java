import java.util.Scanner;

public class C02_haluk {
    public static void main(String[] args) {


        //kullanıcıdan aldıgınız koordınat noktasının hangı bolgede oldugunu yazdıran bır kod yazınız


        Scanner scanner = new Scanner(System.in);

        System.out.println("X ve Y degerlerını gırınız");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {

            System.out.println("gırdıgınız degerler bırıncı bolgededır");


        } else if (x < 0 && y > 0) {

            System.out.println("gırdıgınız degerler 2. bolgededır");

        } else if (x < 0 && y > 0) {

            System.out.println("gırdıgınız degerler 3. bolgededır");

        } else if (x > 0 && y < 0) {

            System.out.println("gırdıgınız degerler 4. bolgededır");
        } else if (x != 0 && y == 0) {
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        } else if (x == 0 && y != 0) {
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        } else System.out.println("girdiginiz degerler orjin'dedir");
    }

}

