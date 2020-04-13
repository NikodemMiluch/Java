import java.util.Scanner;
import java.lang.Math;

class PolaCzworokatowWypuklych
{
    public static void main(final String[] args) {
        /* test */
        double a;/* bok */
        double b; /* bok */
        double h; /* wysokość */
        String x; /* wybrany czworokąt */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w programie wyliczającym pola czworokątów wypukłych.");
        System.out.println("Lista wszystkich czworokątów wypukłych: Kwadrat, Prostokąt, Trójkąt, Równoległobok, Romb, Trapez, Deltoid, Koło");
        System.out.println("Wybierz czworkąt żeby wyliczyć jego pole: ");
        x = scanner.next(); /* scanner.next() to dla string */
    
        if(x.equals("Kwadrat"))
        {
            System.out.println("Podaj długość boku kwadratu(musi być liczbą naturalną):");
            a = scanner.nextDouble();
            System.out.println(a * a);
        }
        else if(x.equals("Prostokąt"))
        {
            System.out.println("Podaj długość jednego boku prostokąta(musi być liczbą naturalną):");
            a = scanner.nextDouble();
            System.out.println("Podaj długość drugiego boku prostokąta(musi być liczbą naturalną):");
            b = scanner.nextDouble();
            System.out.println(a * b);

        }
        else if(x.equals("Trójkąt"))
        {
            System.out.println("Podaj długość podstawy trójkąta(musi być liczbą naturalną):");
            a = scanner.nextDouble();
            System.out.println("Podaj długość wysokości opuszczonej na podstawę trójkąta(musi być liczbą naturalną):");
            h = scanner.nextDouble();
            System.out.println(1/2.0 * a * h);
        }
        else if(x.equals("Równoległobok"))
        {
            System.out.println("Podaj długość boku równoległoboku(musi być liczbą naturalną):");
            a = scanner.nextDouble();
            System.out.println("Podaj długość wysokości opuszczonej na bok równoległóboku(musi być liczbą naturalną):");
            h = scanner.nextDouble();
            System.out.println(a * h);

        }
        else if(x.equals("Romb"))
        {
            System.out.println("Podaj długość boku rombu(musi być liczbą naturalną):");
            a = scanner.nextDouble();
            System.out.println("Podaj długość wysokości opuszczonej na bok rombu(musi być liczbą naturalną):");
            h = scanner.nextDouble();
            System.out.println(a * h);

        }
        else if(x.equals("Trapez"))
        {
            System.out.println("Podaj długość jednej podstawy trapezu(musi być liczbą naturalną):");
            a = scanner.nextDouble();
            System.out.println("Podaj długość drugiej podstawy trapezu(musi być liczbą naturalną):");
            b = scanner.nextDouble();
            System.out.println("Podaj długość wyskości spuszczonej na dłuższą podstawę trapezu(musi być liczbą naturalną):");
            h = scanner.nextDouble();
            System.out.println(((a+b)*h)/2);

        }
        else if(x.equals("Deltoid"))
        {
            System.out.println("Podaj długość jednaj z przekątnych deltoidu(musi być liczbą naturalną):");
            a = scanner.nextDouble();
            System.out.println("Podaj długość drugiej przekątnej deltoidu(musi być liczbą naturalną):");
            b = scanner.nextDouble();    
            System.out.println((a*b)/2);
        }
        else if(x.equals("Koło"))
        {
          System.out.println("Podaj promień koła:");
          a = scanner.nextDouble();
          System.out.println(a * a * Math.PI);
        }
        else
        {
            System.out.println("Źle napisałeś nazwę czworokąta!");
        }

        scanner.close();
    }
}
