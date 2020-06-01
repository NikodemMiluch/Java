import java.util.*; // co można tu jescze dodać?
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = 1; //jedzenie +fast food ++zdrowe
        int b = 1; //szczescie +zabawa
        int c = 1; //zdrowotnosc +ćwiczenia, ++leki
        int d = 1; //zmęczenie
        int p = 50; // j(10), dj(20); lek(20)
        System.out.println("Cześć, jestem Tamagotchi! Musisz zadbać za moje zapotrzebowania! Po każdym dniu dostajesz 20 zł!");
        for(int i = 0;i<20;i++)
        {
            System.out.println("Co chcesz z mną robić: bawić się(1), jeść(2), ćwiczyć(3)");
            int x = sc.nextInt();
            if(x == 1)
            {
                System.out.println("Super zabawa !");
                a -= 1;
                b += 1;
            }
            if(x==2)
            {
                System.out.println("Jakie kupimy jedzienie, fast food(1) za 20 czy sałatkę(2) za 10");
                int x2 = sc.nextInt();
                if(x2 == 1)
                {
                    System.out.println("Mmmmm, ale dobre");
                    a += 2;
                    b += 1;
                    c -= 1;
                    d += 1;
                    p -= 20;
                }
                else if(x2 == 2)
                {
                    System.out.println("Nie lubie za bardzo sałatki");
                    a += 1;
                    b -= 1;
                    c += 1;
                    d += 2;
                    p -= 10;
                }
            }
            if(x==3)
            {
                System.out.println("Musze wziąśc leki(1), czy ćwiczyć(2)?");
                int x3 = sc.nextInt();
                if(x3 == 1)
                {
                    System.out.println("Ale gożkie");
                    b -= 1;
                    c += 2;
                    p -= 20;
                }
                else if(x3 == 2)
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
                p += 20;
            }
        }
    }
}