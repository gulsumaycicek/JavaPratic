package day_05;

public class C09_H9 {
    public static void main(String[] args) {

               /* GÖREV:
 Dizeyi parametre olarak kabul eden ve basamakların toplamını yazdıran bir yöntem yazın
 verilen dizede mevcut
 giriş :"ade1r4d3"
 çıkış : 8
 hile : --> Character.isDigit() kullanın
 --> Tamsayı.değerOf()
         */

        String str="ade1r4d3";
        String[] arr=str.split("");
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (Character.isDigit(arr[i].charAt(0))){
                toplam+=Integer.valueOf(arr[i]);

            }

        }
        System.out.println("strıngtekı rakam taoplamı :"+toplam);
    }
}
