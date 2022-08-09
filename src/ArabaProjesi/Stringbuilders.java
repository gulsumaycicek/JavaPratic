package ArabaProjesi;

public class Stringbuilders {
  /*
    ==== STRİNGBUİLDERS ====
    Obje oluşturma:
    StringBuilder sb1= yeni StringBuilder(); Bos bir SB oluştur
System.out.println("sb1 : " + sb1); //

    StringBuilder sb2= yeni StringBuilder("Mehmet"); icinde Mehmet değeri olan bir SB ürettir
System.out.println("sb2 : " + sb2);// Mehmet

    StringBuilder sb3= yeni StringBuilder(10); 10 karakter kapasitesi olan bir SB ürettir
System.out.println("sb3 : " + sb3);//


    Verilen SB nin sonuna Dizesi (concat)ekleme:

            sb1.append(" ").append("Çetintürk"); verilen SB'in sonuna istedigimiz Dizeleri ekler
            System.out.println(sb1); Rumeysa Çetintürk

    Bir ekleme ekleme'de Verilen SB nin sonuna Dizesi:
    Dize cumle="Javayi cok sever";
sb1.append(cumle, 6, 10); Başka bir String'den istedigimiz bolumu SB'in sonuna ekler
    baslangic indexi dahil, bitis indexi exclusive'dir
            System.out.println(sb1); Rumeysa Çetintürk cok

    SB nin uzunluğu (kapasite varsayılan=16):
            System.out.println(sb1.length()); 21 SB'in uzunluk verir verir danışma
            System.out.println(sb1.capacity()); 23 (7 +16) SB'in kapasiteye verir. (kapasite= SB obje oluşturuluruğunda yapıcı parantezine kapasitesi yaz, o kapasiteyi siper etmek, salonunuz kadar String pistizi patlıcansak, ilk yazdığımız kapasiteyi verir,kapasitel yazımazsa 16 atanır.)

    İstenilen dizini teki karakteri bulma(charAt gibi):
            System.out.println(sb1.charAt(1));// u SB'in istedigimiz indexde olan karakterin verir verir

sb1.charAt(5); Bize bilgi eden metodlar SB'i değirmenmez
            System.out.println(sb1); Rumeysa Çetintürk cok

    İstenilen index teki yada iki index arasında arasında silme karakteri:
            sb1.delete(17, 21); SB'in istedigimiz index'leri arasi kismini siler (hala 17 dahil 21 hariç)
System.out.println(sb1); //Rumeysa Çetintürk

sb1.deleteCharAt(16); SB'in istedigimiz index'deki gözden siler
System.out.println(sb1); Rumeysa Çetintur



    İstenilen harf yada kelimenin dizini ini bulma:
            System.out.println(sb1.indexOf("Çetin") );  8.. SB'da arama yapar
            System.out.println(sb1.indexOf("e", 6));  9.. istedigimiz indexten sonrasinda arama yapar

System.out.println(sb1.indexOf("Kazım")); -1 aradigimiz String'i SB'da buğusa -1 döndürür

    Verilen dizin lerdeki karakterlerini eklemede SB nin yerine yerine Dizesi:
            sb1.insert(7, " "); istedigimiz index'den itibaren istenen Stringi ekler

            System.out.println(sb1); Rumeysa Çetintur

    cumle="Merhaba dunya";
sb1.insert(0, cumle, 0, 8); sb1.insert(dizin, str, uzaklık, uzun)
    Merhaba Rumeysa Çetintur
0 : SB'a hangi index'den itibaren ekyeli
    cumle : Hangi String'den ekyeli
            0 : cumlenin hangi indexinden baslanacak
8 : bitis indexi

sb1.insert(25, cumle, 8, 13);

System.out.println(sb1); Merhaba Rumeysa Çetinturdunya

    SB nin İspanyolca Stringin (yada harfin) filminin son indeksi:
            System.out.println(sb1.lastIndexOf("t")); 22 istenen String'in kullanıcıyadıgi son indexi verir
            System.out.println(sb1.lastIndexOf("a", 22 )); 14 istenen indexten bir kere sinüs bakar

    SB nin sicim dizini leri arasını, verilen Dize ile ilgili değişme:
            sb1.replace(8, 16, "Seher"); SB'in baslangic ve bitis index'leri arasindaki kismi
    verilen Dize ile değişken
System.out.println(sb1); Merhaba Seher Çetinturdunya

    SB yi tersten yazıldı:
            sb1.reverse();
System.out.println(sb1); aynudrutniteC reheS abahreM
sb1.reverse();

    İstenilen dizini teki bir harfi harfi, harfi harfle devrildi:
            sb1.setÇanak(10, 'k');
System.out.println(sb1); Merhaba Şeker Çetinturdunya

    SB nin sli index ler verme (substring gibi):(bilgi verir, SB yi değiştirmez)
            System.out.println(sb1.subSequence(8, 13)); Şeker SB'in istedigimiz endeksi'ler
    arasindaki bolumunu verir
System.out.println(sb1.substring(8)); Şeker Çetinturdunya
    baslangic index'inden sona kadar
            sb1.subSequence(8,13);
System.out.println(sb1); Merhaba Şeker Çetinturdunya
sb1.substring(8, 13);
System.out.println(sb1); Merhaba Şeker Çetinturdunya

    SB de yeneği kontrolü:
            ======SB ve Dize ====
    String isim= "Rumeysa Çetintur";
System.out.println(sb1.equals(isim)); yanlış verir.. veri turleri farkli oldugu icin
    icerigin kiyaslanmasi mumkun degildir
    StringBuilder sb2= yeni StringBuilder("Rumeysa Çetintur");

System.out.println(sb1==sb2); yanlış
System.out.println(sb1.equals(sb2)); false SB'da eşittir yöntemi"u String'den farkli calisir
    ama ayni obje ile kiyaslandiginda doğru
    String'de == kadar çalış
            System.out.println(sb1.equals(sb1)); doğru




==================================================
    StringBuilder sb3=yeni StringBuilder("Java cok güzel");
    StringBuilder sb4=yeni StringBuilder("Java cok guzel");

System.out.println(sb3.equals(sb4)); yanlış

    iceriklerin esit olup olmadigina bakmak icin String'deki eşittir method'unu kullanalim
    SB yi Dize e çevirme:
            System.out.println(sb3.toString().equals(sb4.toString())); doğru

sb3.toString().concat(" İnsanin sevdikce sevesi geliyor"); String sınıfı'ina ait metodları
    kullanıcıyı kalici değer olmaz.
            System.out.println(sb3);
    toString() yöntemi'unu kullaninca SB String'e donusmus olur
    dolayisiyla tum Dize metodları kullanilabilir
System.out.println(sb3.toString().concat(" İnsanin sevdikce sevesi geliyor"));
    Java cok güzel insanin sevdikce sevesi geliyor

System.out.println(sb1.length());  27
            System.out.println(sb1.capacity()); 48
            sb1.trimToSize(); SB icin hazirlanan kapasitedeki fazlalıkları siler
    uzunluk ile kapasiteyi esit eder duruma
System.out.println(sb1.length());  27
            System.out.println(sb1.capacity()); 27

            System.out.println(sb3.compareTo(sb4));//

   */
}

