package Odev1;

public class Kare extends Sekil{

    private int kenar ;

    public Kare(String name , int kenar) {
        super(name);
        this.kenar = kenar;
    }

    @Override
    void cevreHesapla() {
        System.out.println(getName()+" Çevresi = "+(4 * kenar));

    }
}
