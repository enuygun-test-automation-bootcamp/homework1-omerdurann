package Odev1;

public abstract class Sekil {
    private String name ;
   public Sekil(String name) {
       this.name = name;
   }
   public void isminiSoyle(){
       System.out.println("bu bir " +name+" dir");
   }
   abstract void cevreHesapla();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
