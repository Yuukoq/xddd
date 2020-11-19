package Projekt_Dziennik;
import Zad1.Uczen;

import java.util.ArrayList;
public class Dziennik {
    public static void main(String[] args)
    {
        Uczeń uczen1 = new Uczeń();
        uczen1.imie = "  Wiktoria";
        uczen1.nazwisko = " Majewska      ";
        uczen1.numer = 1;
        uczen1.ocenaInformatyka =5;
        uczen1.ocenaMatematyka =3;
        uczen1.ocenaPolski =5;
        uczen1.obecnosc = true;

        Uczeń uczen2 = new Uczeń();
        uczen2.imie = "  Kevin";
        uczen2.nazwisko = "    Kromer        ";
        uczen2.numer = 2;
        uczen2.ocenaInformatyka = 6;
        uczen2.ocenaMatematyka =2;
        uczen2.ocenaPolski =3;
        uczen2.obecnosc = true;

        Uczeń uczen3 = new Uczeń();
        uczen3.imie = "  Mariusz";
        uczen3.nazwisko = "  Włodarczyk    ";
        uczen3.numer = 3;
        uczen3.ocenaInformatyka =3;
        uczen3.ocenaMatematyka =6;
        uczen3.ocenaPolski =2;
        uczen3.obecnosc = false;

        Uczeń uczen4 = new Uczeń();
        uczen4.imie = "  Szymon";
        uczen4.nazwisko = "   Dzięgielewski ";
        uczen4.numer = 4;
        uczen4.ocenaInformatyka = 2;
        uczen4.ocenaMatematyka =3;
        uczen4.ocenaPolski =6;
        uczen4.obecnosc =true;

        Uczeń uczen5 = new Uczeń();
        uczen5.imie = "  Patryk";
        uczen5.nazwisko = "   Morawski      ";
        uczen5.numer = 5;
        uczen5.ocenaInformatyka = 5;
        uczen5.ocenaMatematyka =5;
        uczen5.ocenaPolski =1;
        uczen5.obecnosc = false;

        ArrayList lista = new ArrayList();
        lista.add(uczen1);
        lista.add(uczen2);
        lista.add(uczen3);
        lista.add(uczen4);
        lista.add(uczen5);

        System.out.println("Nr  Imię      Nazwisko       Oceny    Obecność"   );
        for (Object u : lista){
            System.out.println(((Uczeń)u).numer + " " + (((Uczeń)u).imie) + " " + (((Uczeń)u).nazwisko) +" "+ (((Uczeń)u).ocenaInformatyka) +","+ (((Uczeń)u).ocenaMatematyka) + "," + (((Uczeń)u).ocenaPolski)+ "    " + (((Uczeń)u).obecnosc));
        }
    }
//Wyswietlenie 1 ucznia : System.out.println(((Uczeń)lista.get(0)).numer +"   "+ (((Uczeń)lista.get(0)).imie) +"  "+ (((Uczeń)lista.get(0)).nazwisko) +"      "+ (((Uczeń)lista.get(0)).ocenaInformatyka) + ","+ (((Uczeń)lista.get(0)).ocenaMatematyka)+","+ (((Uczeń)lista.get(0)).ocenaPolski) + "      " +(((Uczeń)lista.get(0)).obecnosc));
}

