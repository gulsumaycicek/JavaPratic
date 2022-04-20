package day08;

import java.time.LocalDateTime;

public class Kullanıcı {


    String name;
    LocalDateTime kayıtZamanı;
    public Kullanıcı() {//p'siz cons...
    }

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//p'li cons...
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }
}
