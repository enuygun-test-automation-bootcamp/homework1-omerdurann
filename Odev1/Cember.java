package Odev1;

public class Cember extends Sekil{

    private int yaricap;

    public Cember(String name, int yaricap) {
        super(name);
        this.yaricap = yaricap;
    }

    @Override
    void cevreHesapla() {
        double cevre = (2 * Math.PI * yaricap);
        System.out.println(getName()+" Çemberin Çevresi = "+cevre);

    }
}
