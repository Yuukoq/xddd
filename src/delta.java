import java.util.Scanner;

public class delta

{
    public static void main(String[] args)
    {
        float d;

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj A");
        int a = scan.nextInt();
        System.out.println("Podaj B");
        int b = scan.nextInt();
        System.out.println("Podaj C");
        int c = scan.nextInt();

        System.out.println("Podałeś A=" + a);
        System.out.println("Podałeś B=" + b);
        System.out.println("podałeś C=" + c);

        System.out.println("delta wynosi " + (d=b*b-4*a*c));
        if (d<0){
            System.out.println("SPRZECZNE");
            return;
        }
        double sqrt = Math.sqrt(d);
        System.out.println("pierwsiastek z delty wynosi "+ sqrt);
        System.out.println("X1 Wnosi: " + ((-b+sqrt)/2*a));
        System.out.println("X2 Wnosi: " + ((-b-sqrt)/2*a));

    }
}
