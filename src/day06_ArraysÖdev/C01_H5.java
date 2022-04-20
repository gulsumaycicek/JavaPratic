package day06_ArraysÖdev;

public class C01_H5 {
    public static void main(String[] args) {

          /* (dizi elemanlarinin ortalama degerini hesaplayan ve
            * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
                */
        int arr[]={1,2,3,4,5,6,7};

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        int ortalama=toplam/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama) System.out.print(arr[i]+" ");

            }

        }
    }

