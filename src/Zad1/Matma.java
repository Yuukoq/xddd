package Zad1;

public class Matma {
    double PI =3.14;
    double E =2.71;
    int q;
    int w;
    int r;


    void potenga()
    {
        System.out.println("Liczba do potegi 3: " + q*q*q +"\n");
    }
    void wyniki()
    {
        System.out.println("Suma dwóch liczb: " + (q + w) +"\n" +
                "Różnica dwóch liczb: " + (w - q) +"\n" +
                "Iloczyn dwóch liczb: " + (r * q) +"\n");
    }
    void trojkat()
    {
        if (q + w > r) {
            System.out.println("Można stworzyć trójkąt");
        }
        else
        {
            System.out.println("Nie można stworzyć trójkąta");
        }
    }
}
