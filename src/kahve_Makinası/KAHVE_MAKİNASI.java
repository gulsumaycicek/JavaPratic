package kahve_Makinası;


import java.util.Scanner;

public class KAHVE_MAKİNASI {

    public static void main(String[] args) {


        /*
 1. Basit bir Kahveyileştirdi olarak. 3 çeşit kahvemiz olsun.
 2. Sistem şu uza sorsun: "Hangi Kahveyi istersiniz?"
 3.Bu soru ile birlikte birlikte, olarak kahve bilgilerini gören.
   Örn:
 Hangi Kahveyi İster?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
 Dize hangiKahve önce ve var olan kahvelerden onu yazınız.
 (örn: Türk Kahvesi, ya da türk kahvesi. ---> Büyük- küçük harf bunu olmayan string methodu⭐.)
 todo 1. Heryde bölümü
 Eğer kahveSi Türk kahvesi ise, konsola = Türk kahvesi ası. yazsın. (Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
 Eğer filtre kahve ise, konsola = Filtre kahve tespiti. yazsın. (String hangiKahve'yi turu !)
 Ise Espresso ise, konsola = Espresso İsyanın... yazsın. (String hangiKahve'yi turu !)
 Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptı. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edentir, o onu daha önce onu bu yüzden bastan baslatın.)
                                                                                     todo ----------------------------------
 Sistem bize şu uzayı sorsun: "Süt eklememizi ister misiniz ? (Evet ya Hayır olarak cevaplanmaız): " Konsolda aynen aynen ay yazmalı. Parantez içi de konsolda olsun.
 Dize sut oluştur.
 todo 2.Gerek Bölümü
 ise String sut, evet e eşitse,konsola, Süt eksini... lüzımad jelsin. -- (Büyük küçük harf getiricisini için String methodu olarak. Olanı: Evet, EVET, EvEt,EVEt vs.
 ise String sut, hayır a eşit ise, konsola , Süt eklesini gelsin.
                                                                                    todo ----------------------------------
 Sistem bize "Şeker ister misin ? (Evet ya hayır hakkı veriniz) : " bir göre bir soru sorsun. (Büyük harf göreligı olmayan için dize yöntemi olarak.
 String seker öncez.
 todo 3.Gerek Bölümü
        todo if(){
 Ise String seker Evet e eşitse , sistem bize "Kaçayı şeker olsun?" sorusu sormalı. Ederez altına int kaçSeker ederz.
 Şeker getir giriniz.
 Ve konsola kadar vuruyoruz örnek: 5 şeker ekerek. (ihbar: Bu kodların heosi eğer bloğunun olan)
        todo }
        todo else{
 Eğer Dize şeker hayır 'a eşitse, sistem bize "Şeker ekle" versin versin.
 ONEMLİ !! = bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız yeri. (Dize bosKod = sc.nextLine(); ) kukla kod ekleyiniz.
 Sistem bize "Hangi şekilde olsun? (Büyük çocuk - orta boy - küçük çocuk olarak giriniz.) : kurtarır sorsun. (büyük küçük harf göreligı etti. yani büyük boy ya BüYüK Boy girdiginde kabul etti.
 Dize boyut şekilde...
 todo 4.Gerek Bölümü
 eğer String boyut Büyük boy' a eşitse = Kahveniz büyük boyiyor. (Büyük boy adı String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "dur.")
 Eğer Dize boyut Orta Boy'a eşitse = Kahveniz orta boy ayıp.. ("Kahveniz" + boyut + "ayıp.)
 Eğer Dize boyut Küçük boy'a eşitse = Kahveniz küçük boyiyor. yazsın. ("Kahveniz" + boyut + "ayıp.)
 todo SONUÇ BÖLÜMÜ
 Siparişlerimizi verdik. Oğul hali görmek istiyoruz.
 konsola kadar yazılan örnek :
 Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi müdürü. orta boy için de String boyut ' u.daldı.)
        todo Açıklama :
 Projeyi bilerek biraz zor gazetesi. Onu fazla kafa yormanız ve "grupçanız için" de onu etti. Yapamayan dayılar, kesinlikle canlarını sıkmasın.
 Boyut çok zor lere. Ama adım adım yitirdi, grup ile çözerseniz ve dedim notları tamamen gruplara halledenizi. Şeysöyler, Hiç yok. Biraz karışık.
 Bir ödev hafızlık günüz. Bunun kadar ölçüsü olan bunu ölçüsüde lütbat lüm.
 Amaçayıla beraber SesLendirme Kanalı larda ödev üzerine tartışılabilirsiniz.
 TEKİN KOLAY GELİN !!
                 */


        Scanner scanner = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("-----Kahve Makinesi-----");
        System.out.println("************************");
        String islemler = "1.Türk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n" +
                "4.Americano\n" + "5.Cappicino\n" + "6.Cıkıs";
        System.out.println(islemler);
        System.out.println("************************");

        while (true) {
            System.out.print("Yapmak istediginiz islemin numarasini giriniz : ");
            String hangiKahve = scanner.nextLine();

            if (hangiKahve.equals("6")) {
                System.out.println("Kahve Makinesi Sisteminden cikiliyor...");
                break;
            } else if (hangiKahve.equals("1")) {
                System.out.println("Türk kahvesi hazırlanıyor...");
            } else if (hangiKahve.equals("2")) {
                System.out.println("Filtre kahve hazırlanıyor...");
            } else if (hangiKahve.equals("3")) {
                System.out.println("Espresso hazırlanıyor...");
            } else if (hangiKahve.equals("4")) {
                System.out.println("Americano hazırlanıyor...");
            } else if (hangiKahve.equals("5")) {
                System.out.println("Cappicino hazırlanıyor...");
            } else {
                System.out.println("Hatalı tuşlama yaptınız.Tekrar deneyiniz...");
                break;
            }

            System.out.print("\nSüt eklememizi ister misiniz?\n" + "1.Evet\n" + "2.Hayır\n" + "Tuslayiniz: ");
            String sut = scanner.nextLine();

            if (sut.equals("1")) {
                System.out.println("Süt ekleniyor...");
            } else if (sut.equals("2")) {
                System.out.println("Sut eklenmiyor...");
            } else {
                System.out.println("Hatali islem yaptiniz...");
                break;
            }

            System.out.print("\nSeker ister misiniz?\n" + "1.Evet\n" + "2.Hayır\n" + "Tuslayiniz: ");
            String seker = scanner.nextLine();

            if (seker.equals("1")) {
                System.out.print("Kaç seker olsun: ");
                int kacSeker = scanner.nextInt();
                scanner.nextLine();
                System.out.println(kacSeker + " seker ekleniyor");
            } else if (seker.equals("2")) {
                System.out.println("Şeker eklenmiyor ");
            } else {
                System.out.println("Hatalı giris yaptınız. Tekrar deneyiniz...");
                break;
            }

            System.out.print("\nHangi boyutta olsun?\n" + "1.Buyuk Boy\n" + "2.Orta Boy\n" + "3.Kucuk Boy\n" + "Tuslayiniz: ");
            String boyut = scanner.nextLine();

            if (boyut.equals("1")) {
                System.out.println("Buyuk Boy Kahveniz hazirlaniyor...");
            } else if (boyut.equals("2")) {
                System.out.println("Orta Boy Kahveniz hazirlaniyor...");
            } else if (boyut.equals("3")) {
                System.out.println("Kucuk Boy Kahveniz hazirlaniyor...");
            } else {
                System.out.println("Hatali gırıs yaptınız. Tekrar deneyiniz...");
                break;
            }


            System.out.println("\nKahveniz hazir. Afiyet olsun !!!");
            break;

        }

    }
}
