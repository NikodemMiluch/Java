import java.util.*;
import java.io.*;
class Tamagotchi
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int xx = 1;
        int a = 1; //jedzenie +fast food ++zdrowe
        int b = 1; //szczescie +zabawa
        int c = 1; //zdrowotnosc +ćwiczenia, ++leki
        int d = 1; //zmęczenie
        int p = 20; // j(10), dj(20); lek(20)
        System.out.println("Cześć, jestem Tamagotchi! Musisz zadbać za moje zapotrzebowania! Po każdym dniu dostajesz 20 zł!");
        for(int i = 0;i<20;i++)
        {
            while(xx != 0)
            {
            xx = 0;
            System.out.println("Co chcesz z mną robić: bawic sie(1), jeść(2), leczyc sie(3)");
            String x = sc.next();
            if(x.equals("1") || x.equals("bawic sie") || x.equals("Bawic sie") || x.equals("bawic sie(1)") || x.equals("Bawic sie(1)"))
            {
                System.out.println("Super zabawa !");
                a -= 1;
                b += 1;
            }
            else if(x.equals("2") || x.equals("jesc") || x.equals("Jesc") || x.equals("jesc(2)") || x.equals("Jesc(2)"))
            {
                System.out.println("Jakie kupimy jedzienie, fast food(1) za 20 czy salatke(2) za 10");
                String x2 = sc.next();
                if(x2.equals("1") || x2.equals("fast food") || x2.equals("Fast food") || x2.equals("fast food(1)") || x2.equals("Fast food(1)"))
                {
                  if(p>=20){
                    System.out.println("Mmmmm, ale dobre");
                    a += 2;
                    b += 1;
                    c -= 1;
                    d += 1;
                    p -= 20;
                  }
                  else
                  {
                    xx = 1;
                  }
                }
                else if(x2.equals("2") || x2.equals("salatke") || x2.equals("Salatke") || x2.equals("Salatke(2)") || x2.equals("salatke(2)"))
                {
                  if(p>=10){
                    System.out.println("Nie lubie za bardzo sałatki");
                    a += 1;
                    b -= 1;
                    c += 1;
                    d += 2;
                    p -= 10;
                  }
                  else
                  {
                    xx = 1;
                  }
                }
                else
                {
                  xx = 2;
                }
              }
            else if(x.equals("3") || x.equals("leczyc sie") || x.equals("Leczyc sie") || x.equals("leczyc sie(3)") || x.equals("Leczyc sie(3)"))
            {
                System.out.println("Musze wziąśc leki(1), czy cwiczyc(2)?");
                String x3 = sc.next();
                if(x3.equals("1") || x3.equals("leki") || x3.equals("Leki") || x3.equals("leki(1)") || x3.equals("Leki(1)"))
                {
                  if(p>=20)
                  {
                    System.out.println("Ale gożkie");
                    b -= 1;
                    c += 2;
                    p -= 20;
                  }
                  else
                  {
                    xx = 1;
                  }
                }
                else if(x3.equals("2") || x3.equals("cwiczyc") || x3.equals("Cwiczyc") || x3.equals("cwiczyc(2)") || x3.equals("Cwiczyc(2)"))
                {
                    if(d >= 1)
                    {
                    System.out.println("Fajnie się ćwiczy");
                    a += 1;
                    b += 1;
                    c += 1;
                    d -= 1;
                    }
                    else
                    {
                        System.out.println("Tamgotchi jest zmęczony");
                        a -= 1;
                        b -= 1;
                        c += 1;
                        d -= 1;
                    }
                }
                else
                {
                  xx=2;
                }
            }
            else 
            {
              xx=2;
            }
            if(xx == 1)
            {
                System.out.println("Nie stać cię!");
            }
            if(xx == 2)
            {
              System.out.println("Nie ma takiej opcji!");
            }
           }
                //Podsumowanie dnia
                System.out.print("Tamogotchi jest: ");
                if(a >= 1){System.out.print("Najedzony ");}
                if(a < 1){System.out.print("Głodny ");}
                if(b >= 1){System.out.print("Szczęśliwy ");}
                if(b < 1){System.out.print("Smutny ");}
                if(c >= 1){System.out.print("Zdrowy ");}
                if(c < 1){System.out.print("Chory ");}
                if(d >= 1){System.out.print("Zenergizowany ");}
                if(d < 1){System.out.print("Zmęczony ");}
                System.out.println();
                xx = 1;
                p += 10;
            }
            System.out.println("To już koniec gry! Czy chcesz zapisać swój wynik? Tak(1) lub Nie(2)"); 
            int odp = sc.nextInt();
            if(odp == 1)
            {
              File file = new File("Wynik.txt");
              System.out.println("Wyniki innych graczy: ");
              Scanner o = new Scanner(file);
              while(o.hasNextLine())
              {
                System.out.println(o.nextLine());
              }
              System.out.println("Jak chcesz się nazywać w tablicy wyników");
              String q = sc.next();
              FileWriter writer = new FileWriter(file, true);
              PrintWriter z = new PrintWriter(writer);
              z.println(q + ": Głod:" + a + " Szczescie:" + b + " Zdrowotnosc:" + c + " Pieniadze:" + d);
              z.close();
              o.close();
            }
            else
            {
              System.out.println("Dobrze, nie zapiszemy twojego wyniku! Mamy nadzieje że gra się podobała!");
            }
            sc.close();
        }
    }