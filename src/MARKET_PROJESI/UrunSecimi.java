package MARKET_PROJESI;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.*;

public class UrunSecimi {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL
		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */

    static Scanner sc = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.00");

    String urunAdi;
    String urunNo;
    double fiyat;
    String secilenUrunNo;
    double secilenKg;
    static double tutar;

    static List<UrunSecimi> urunListesi = new ArrayList<>();
    static List<UrunSecimi> alınanUrunListesi = new ArrayList<>();

    public UrunSecimi() {

    }


    public void UrunSecimi() {

    }

    private void fisUret() {
        DateFormat DFormat = DateFormat.getDateInstance();
        String tarih = DFormat.format(Calendar.getInstance().getTime());
        int saat = LocalDateTime.now().getHour();
        int dk = LocalDateTime.now().getMinute();

        System.out.println("******************** Halk Manav *********************************");
        System.out.println("Fatura tarihi : " + tarih + "\t\tsaat : " + saat + ":" + dk);
        System.out.println();
    }

    public UrunSecimi(String urunAdi, String urunNo, double fiyat) {
        this.urunAdi = urunAdi;
        this.urunNo = urunNo;
        this.fiyat = fiyat;
        urunListesi.add(this);

    }

    public void urunAtama() {
        UrunSecimi u1 = new UrunSecimi("Domates", "1", 2.10);
        UrunSecimi u2 = new UrunSecimi("Patates", "2", 3.20);
        UrunSecimi u3 = new UrunSecimi("Biber", "3", 1.50);
        UrunSecimi u4 = new UrunSecimi("Soğan", "4", 2.30);
        UrunSecimi u5 = new UrunSecimi("Havuç", "5", 3.10);
        UrunSecimi u6 = new UrunSecimi("Elma", "6", 1.20);
        UrunSecimi u7 = new UrunSecimi("Muzzz", "7", 1.90);
        UrunSecimi u8 = new UrunSecimi("Çilek", "8", 6.10);
        UrunSecimi u9 = new UrunSecimi("Kavun", "9", 4.30);
        UrunSecimi u10 = new UrunSecimi("Üzüm", "10", 2.70);
        UrunSecimi u11 = new UrunSecimi("Limon", "11", 0.50);


        //aşağıdaki yerine "urunListesi.add(this);"  yapıldı
        //    urunListesi.add(u1);
        //    urunListesi.add(u2);
        //    urunListesi.add(u3);
        //    urunListesi.add(u4);
        //    urunListesi.add(u5);
        //    urunListesi.add(u6);
        //    urunListesi.add(u7);
        //    urunListesi.add(u8);
        //    urunListesi.add(u9);
        //    urunListesi.add(u10);
        //    urunListesi.add(u11);

        urunSecim();

    }

    private void urunSecim() {
        System.out.println("************* HALK MANAVA HOŞGELDİNİZ ******************");
        System.out.println("Ürün ve Fiyat Bilgilerimiz Aşağıda Sunulmuştur.");
        System.out.println("Ürün no\t\tÜrün Adı\t\tFiyat\t\tPara Birimi");
        for (UrunSecimi w : urunListesi) {
            System.out.println(w.urunNo + "\t\t\t" + w.urunAdi + "\t\t\t" + w.fiyat + "\t\t\tUSD");
        }
        secilenUrun();
    }

    private void secilenUrun() {
        System.out.print("Lütfen seçmek istediğiniz ürünün numarasını giriniz : ");
        secilenUrunNo = sc.next();

        switch (secilenUrunNo) {
            case "1":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(0));
                baskaUrunAlmayıSor();
                break;
            case "2":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(1));
                baskaUrunAlmayıSor();
                break;
            case "3":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(2));
                baskaUrunAlmayıSor();
                break;
            case "4":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(3));
                baskaUrunAlmayıSor();
                break;
            case "5":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(4));
                baskaUrunAlmayıSor();
                break;
            case "6":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(5));
                baskaUrunAlmayıSor();
                break;
            case "7":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(6));
                baskaUrunAlmayıSor();
                break;
            case "8":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(7));
                baskaUrunAlmayıSor();
                break;
            case "9":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(8));
                baskaUrunAlmayıSor();
                break;
            case "10":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(9));
                baskaUrunAlmayıSor();
                break;
            case "11":
                kgSor();
                Fatura();
                alınanUrunListesi.add(urunListesi.get(10));
                baskaUrunAlmayıSor();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz : ");
                secilenUrun();
        }
    }


    private void baskaUrunAlmayıSor() {
        System.out.print("Başka ürün almak istiyor musunuz? Evet için 'E' Hayır için 'H' giriniz : ");
        char secim = sc.next().toUpperCase().charAt(0);
        if (secim == 'E') {
            secilenUrun();
        } else if (secim == 'H') {
            cıkıs();
        } else {
            System.out.println("Hatalı giriş yaptınız tekrar deneyiniz : ");
            baskaUrunAlmayıSor();
        }
    }

    private double kgSor() {
        System.out.print("Lütfen kaç kg almak istediğinizi giriniz : ");
        secilenKg = sc.nextDouble();
        return secilenKg;
    }

    private double Fatura() {
        tutar += urunListesi.get(Integer.parseInt(secilenUrunNo) - 1).fiyat * secilenKg;
        return tutar;
    }

    private void cıkıs() {
        fisUret();
        List<String> alınanUrunYazdırma = new ArrayList<>();
        for (UrunSecimi w : alınanUrunListesi) {
            alınanUrunYazdırma.add(w.urunAdi);
        }
        System.out.print("Aldığınız ürünler\t\t: ");
        for (String w : alınanUrunYazdırma) {
            System.out.print(w + ", ");
        }

        System.out.println();
        System.out.println("Ödeyeceğiniz Tutar\t\t: " + df.format(tutar) + " USD");
        System.out.println();
        System.out.println("Bizi tercih ettiğiniz için teşekkürler.");
        System.out.println("******************** Halk Manav *********************************");


    }
}


