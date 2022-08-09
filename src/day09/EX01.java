package day09;

import java.util.HashMap;

public class EX01 {

    public class Ex01 {
        public  void main(String[] args) {
            //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
            // input : {"ahmet", "ahmet can", "haluk"};  {"şeref", "erdem", "bilgin"};
            // output : {ahmet=şeref, ahmet can=erdem, haluk=bilgin};

            String ad[] = {"ahmet", "ahmet can", "haluk"};
            String soyAd[] = {"şeref", "erdem", "bilgin"};
            HashMap<String, String> adSoyad = new HashMap<>();
            for (int i = 0; i < ad.length; i++) {
                adSoyad.put(ad[i], soyAd[i]);
            }
            System.out.println("ad soyad :" + adSoyad);
        }
    }
}
