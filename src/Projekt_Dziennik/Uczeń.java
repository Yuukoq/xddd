package Projekt_Dziennik;

public class Uczeń extends Człowiek  {
    protected int numer;
    protected int ocenaInformatyka;
    protected int ocenaMatematyka;
    protected int ocenaPolski;
    protected boolean obecnosc;

     String getNumer() {
        return "Numer ucznia: " +this.numer;
    }

     void setNumer(int numer) {
        this.numer = numer;
    }

     String getOcenaInformatyka() {
        return "Ocena z Informatyki: " + this.ocenaInformatyka;
    }

     void setOcenaInformatyka(int ocenaInformatyka) {
         if (ocenaInformatyka>= 1&& ocenaInformatyka <=6);{
        this.ocenaInformatyka = ocenaInformatyka;}
    }

     String getOcenaMatematyka() {
        return "Ocena z Matematyki: " + this.ocenaMatematyka;
    }

     void setOcenaMatematyka(int ocenaMatematyka) {
         if (ocenaMatematyka>= 1&& ocenaMatematyka <=6);{
        this.ocenaMatematyka = ocenaMatematyka;}
    }

     String getOcenaPolski() {
        return "Ocena z Polskiego: " + this.ocenaPolski;
    }

     void setOcenaPolski(int ocenaPolski) {
         if (ocenaPolski>= 1&& ocenaPolski <=6);{
        this.ocenaPolski = ocenaPolski;}
    }

    String isObecnosc() {
        return "Obecność: " + this.obecnosc;
    }

     void setObecnosc(boolean obecnosc) {
        this.obecnosc = obecnosc;
    }
}
