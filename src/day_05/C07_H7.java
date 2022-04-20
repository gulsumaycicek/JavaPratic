package day_05;

public class C07_H7 {
    public static void main(String[] args) {


        /* GÖREV:
         * 2 boyutlu bir diziyi kabul eden ve maksimum değeri bulan bir yöntem yazın
         * (2 tane tanede bir diziyi kabil eden ve maksimum değeri bulan bir yöntem yazin )
         * Giriş: {{1,2,-3},{41,55},{-61,-17,80}}
         * Çıkış : 80
         */

        int arr[][] = {{1, 2, -3}, {41, 55}, {-61, -17, 80}};
        System.out.println(maxDegerbul(arr));

    }

    public static int maxDegerbul(int arr[][]) {
        int max = arr[0][0];
        for (int kat=0;kat<arr.length;kat++){
            for (int daire=0; daire<arr[kat].length;daire++){
                if (arr[kat][daire]>max){
                    max=arr[kat][daire];

                }
            }
        }
        return max;


    }
}
