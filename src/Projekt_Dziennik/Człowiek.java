package Projekt_Dziennik;

public class Człowiek {
    protected String imie;
    protected String nazwisko;


     String getImie() {
        return "Imię: " + this.imie;
    }

    void setImie(String imie) {
        this.imie = imie;
    }

   String getNazwisko() {
        return "Nazwisko: " + this.nazwisko;
    }

    void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}

