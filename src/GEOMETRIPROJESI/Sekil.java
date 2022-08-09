package GEOMETRIPROJESI;

public class Sekil {



    public double uzunkenar;
    public double kısakenar;
    public double yarıcap;
    public double pi=3.14;
    public int kenar;




    public Sekil(double uzunkenar, double kısakenar){
        this.kısakenar=kısakenar;
        this.uzunkenar=uzunkenar;
    }
    public void  cevreHesaplama(double uzunkenar,double kısakenar){

        System.out.println("Dikdortgenin cevresi :" + (uzunkenar+kısakenar)*2);
    }
    public void alanHesaplama(double uzunkenar,double kısakenar){

        System.out.println("Dikdortgenin alanı:" + uzunkenar*kısakenar);
    }


    public Sekil(int kenar) {
        this.kenar=kenar;

    }
    public void cevreHesaplama(int kenar){

        System.out.println("Karenın cevresı: " + (kenar*4));
    }
    public void alanHesaplama(int kenar){

        System.out.println("Karenın alanı:"+(kenar*kenar));
    }




    public Sekil(double yarıcap){
        this.yarıcap=yarıcap;

    }
    public void cevreHesaplama(double yarıcap){

        System.out.println("cemberin cevresı:"+(yarıcap*pi)*2);
    }
    public void alanHesaplama(double yarıcap){

        System.out.println("cemberın alanı:"+(yarıcap*yarıcap)*pi);


    }

}
