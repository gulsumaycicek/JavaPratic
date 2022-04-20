import java.util.Scanner;

public class C03_Pratık {

    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        System.out.println("ehlıyetınız var ıse-> 1 yok ıse  ->0 yazınız");
        int ehlıyet = scanner.nextInt();
        if (ehlıyet == 0 || ehlıyet == 1) {
            System.out.println("hızınızı gırınız");
            int hız = scanner.nextInt();

            if (ehlıyet == 1) {
                if (hız < 0) {
                    System.out.println("hızınız negatıf hatalı verı gırdınız");
                } else if (hız >= 54 && hız < 75) {
                    System.out.println("cezanız 100$ dır");

                } else if (hız >= 75 && hız < 84) {
                    System.out.println("cezanız 150$ dır");
                } else if (hız >= 84 && hız < 94) {
                    System.out.println("cezanız 320$ dır");

                } else if (hız > 94) {
                    System.out.println("cezanız 500$ dır");
                } else {
                    System.out.println("hız sınırında setehat edıyorsunuz hayırlı yolcukuklar");

                }

            } else if (ehlıyet == 0) {
                if (hız < 0) {
                    System.out.println("hızınız negatıf hatalı verı gırdınız");
                } else if (hız >= 54 && hız < 75) {
                    System.out.println("cezanız 100$ dır");

                } else if (hız >= 75 && hız < 84) {
                    System.out.println("cezanız 150$ dır");
                } else if (hız >= 84 && hız < 94) {
                    System.out.println("cezanız 320$ dır");

                } else if (hız > 94) {
                    System.out.println("cezanız 500$ dır");
                } else {
                    System.out.println("hız sınırında setehat edıyorsunuz ancak ehlıyetsız oldugunuz ıcın cezanız 200$");

                }

            } else {
                System.out.println("ehliyetınız var mı yok mu");
            }
        }
    }
}