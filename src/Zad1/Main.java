package Zad1;

public class Main {
    public static void main(String[] args)
    {
        Uczen Zad1 = new Uczen();
        Zad1.imie = "Wiktoria";
        Zad1.nazwisko = "Majewska";
        Zad1.wiek = 18;

        Zad1.info();

        Matma Zad11 = new Matma();
        Zad11.q =3;
        Zad11.w =6;
        Zad11.r =5;
        Zad11.potenga();
        Zad11.wyniki();
        Zad11.trojkat();
    }
}
