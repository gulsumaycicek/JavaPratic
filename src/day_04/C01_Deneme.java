package day_04;

public class C01_Deneme {
    public static void main(String[] args) {

        /* GÖREV:
 Asagidaki String değişkenini kullanarak konsolda A L i yazdiriniz.
 String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
        String harfDeposu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char a=harfDeposu.charAt(harfDeposu.indexOf("A"));
        char l=harfDeposu.charAt(harfDeposu.indexOf("L"));
        char ı=harfDeposu.charAt(harfDeposu.indexOf("I"));
        System.out.println(""+a+l+ı);






    }
}
