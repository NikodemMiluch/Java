import java.util.Scanner;

class PolaCzworokatowWypuklych
{
    public static void main(final String[] args) {
        
        int a;/* bok */
        int b; /* bok */
        int h; /* wysokość */
        int x; /* wybrany czworokąt */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w programie wyliczającym pola czworokątów wypukłych.");
        System.out.println("Lista wszystkich czworokątów wypukłych: Kwadrat(wpisz 1), Prostokąt(2), Trójkąt(3), Równoległobok(4), Romb(5), Trapez(6), Deltoid(7)");
        System.out.println("Wybierz czworkąt żeby wyliczyć jego pole: ");
        x = scanner.nextInt(); /* scanner.next() to dla string */
    
        if(x==1)
        {
            System.out.println("Podaj długość boku kwadratu(musi być liczbą naturalną):");
            a = scanner.nextInt();
            System.out.println(a * a);
        }
        else if(x==2)
        {
            System.out.println("Podaj długość jednego boku prostokąta(musi być liczbą naturalną):");
            a = scanner.nextInt();
            System.out.println("Podaj długość drugiego boku prostokąta(musi być liczbą naturalną):");
            b = scanner.nextInt();
            System.out.println(a * b);

        }
        else if(x==3)
        {
            System.out.println("Podaj długość podstawy trójkąta(musi być liczbą naturalną):");
            a = scanner.nextInt();
            System.out.println("Podaj długość wysokości opuszczonej na podstawę trójkąta(musi być liczbą naturalną):");
            h = scanner.nextInt();
            System.out.println(1/2.0 * a * h);
        }
        else if(x==4)
        {
            System.out.println("Podaj długość boku równoległoboku(musi być liczbą naturalną):");
            a = scanner.nextInt();
            System.out.println("Podaj długość wysokości opuszczonej na bok równoległóboku(musi być liczbą naturalną):");
            h = scanner.nextInt();
            System.out.println(a * h);

        }
        else if(x==5)
        {
            System.out.println("Podaj długość boku rombu(musi być liczbą naturalną):");
            a = scanner.nextInt();
            System.out.println("Podaj długość wysokości opuszczonej na bok rombu(musi być liczbą naturalną):");
            h = scanner.nextInt();
            System.out.println(a * h);

        }
        else if(x==6)
        {
            System.out.println("Podaj długość jednej podstawy trapezu(musi być liczbą naturalną):");
            a = scanner.nextInt();
            System.out.println("Podaj długość drugiej podstawy trapezu(musi być liczbą naturalną):");
            b = scanner.nextInt();
            System.out.println("Podaj długość wyskości spuszczonej na dłuższą podstawę trapezu(musi być liczbą naturalną):");
            h = scanner.nextInt();
            System.out.println(((a+b)*h)/2);

        }
        else if(x==7)
        {
            System.out.println("Podaj długość jednaj z przekątnych deltoidu(musi być liczbą naturalną):");
            a = scanner.nextInt();
            System.out.println("Podaj długość drugiej przekątnej deltoidu(musi być liczbą naturalną):");
            b = scanner.nextInt();    
            System.out.println((a*b)/2);
        }
        else
        {
            System.out.println("Źle napisałeś nazwę czworokąta!");
        }


    }
}