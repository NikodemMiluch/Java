import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int szczescie =  5;
        int wyzywienie =  5;
        int zdrowie =  5;
        int napojenie = 5;
        int zdrowiepsych = 5;
        int rozrywka = 5;
        System.out.println("Cześć! Jestem Tamagotchi. Baw się ze mną, troszcz się o mnie, a po 10 dniach pokaże tobie twój wynik!");
        for(int i = 0; i<20;i++)
        {   
            System.out.println("Cześć! Co będziemy dzisiaj robić? Bawić się(1), Leczyć się(2), Jeść(3), Pić(4), Spacer(5), Impreza(6)");
            int x = sc.nextInt();
            if(x == 1)
            {
                System.out.println("Wolisz pograć z mną w piłkę(1) czy w grę komputerową(2)?");
                int x1 = sc.nextInt();
                if(x1 == 1)
                {
                    System.out.println("WoW! Bawmy się! ᕕ(◕ᗜ◕)ᕗ");
                    szczescie += 1;
                    zdrowie += 1;
                    rozrywka += 1;
                    napojenie -= 1;
                    wyzywienie -= 1;
                }
                else if(x1 == 2)
                {
                    System.out.println("WoW! Bawmy się! ᕕ(◕ᗜ◕)ᕗ");
                    szczescie += 1;
                    rozrywka += 1;
                    zdrowiepsych -= 1;
                }
                else 
                {
                    System.out.println("Ojć! Nie ma takiej opcji! ᕙ(◕ᗝ◕)ᕗ");
                    i--;
                    continue;
                }
            }
            else if(x == 2)
            {
                System.out.println("W jakich sposób chcesz mnie leczyć? Wizyta u psychologa(1), Wizyta u lekaża(2), Połknięcie przypadkowych leków z szafki mamy(3)");
                int x2 = sc.nextInt();
                if(x2 == 1)
                {
                    System.out.println("Czas na moją terapię!");
                    szczescie++;
                    zdrowiepsych++;
                }
                else if(x2 == 2)
                {
                    System.out.println("Nie smakuje mi ten syrop! ᕙ(◕ᗝ◕)ᕗ");
                    szczescie -= 2;
                    zdrowie += 3;
                }
                else if(x2 == 3)
                {
                    System.out.println("A co to za światełko się świeci?ᕙ(⌐■ಎ■)ᕗ");
                    rozrywka += 3;
                    zdrowie -= 4;
                    zdrowiepsych -= 2;
                }
                else 
                {
                    System.out.println("Ojć! Nie ma takiej opcji! ᕙ(◕ᗝ◕)ᕗ");
                    i--;
                    continue;
                }
            }
            else if(x == 3)
            {
                System.out.println("Co dzisiaj zjemy? Fast food(1), Zdrowy posiłek(2), Szybka przekąska(3)");
                int x3 = sc.nextInt();
                if(x3 == 1)
                {
                    System.out.println("Mmmm, mój ulubiony hamburger!");
                    rozrywka += 3;
                    zdrowie -= 3;
                    wyzywienie += 4;
                }
                else if(x3 == 2)
                {
                    System.out.println("Eeeee, znowy sałatka");
                    zdrowie += 5;
                    wyzywienie += 2;
                    rozrywka -= 2;
                }
                else if(x3 == 3)
                {
                    System.out.println("Ooo, będzie więcej czasu na zabawę!");
                    wyzywienie += 1;
                    rozrywka += 3;
                    zdrowie -= 1;
                }
                else 
                {
                    System.out.println("Ojć! Nie ma takiej opcji! ᕙ(◕ᗝ◕)ᕗ");
                    i--;
                    continue;
                }
            }
            else if(x == 4)
            {
                System.out.println("Co mi dasz do picia? Liptonka(1), Monsterka(2), Wodę(3), Coś z barku mamy(4)");
                int x4 = sc.nextInt();
                if(x4 == 1)
                {
                    System.out.println("Mmmm, kocham liptonki!");
                    szczescie += 10;
                    napojenie += 10;
                    zdrowiepsych += 5;
                }
                else if(x4 == 2)
                {
                    System.out.println("Byczqu dupnij se monsterka");
                    zdrowie -= 10;
                    zdrowiepsych -= 5;
                    szczescie += 3;
                    rozrywka += 3;
                    napojenie += 2;
                }
                else if(x4 == 3)
                {
                    System.out.println("Zimna woda zdrowia doda!");
                    zdrowie += 5;
                    rozrywka -= 1;
                    napojenie += 3;
                }
                else if(x4 == 4)
                {
                    System.out.println("Łoooo jeju, kręci mi się w głowie");
                    zdrowie -= 4;
                    rozrywka += 2;
                    napojenie += 2;
                    zdrowiepsych -= 2;
                }
                else 
                {
                    System.out.println("Ojć! Nie ma takiej opcji! ᕙ(◕ᗝ◕)ᕗ");
                    i--;
                    continue;
                }
            }
            else if(x == 5)
            {
                System.out.println("Kocham spacer! Dokąd chcesz mnie zabrać? Spacer po lesie(1), Spacer po mieście(2), Spacer do parku(3)");
                int x5 = sc.nextInt();
                if(x5 == 1)
                {
                    System.out.println("Ooo, wiesz co to za drzewo?");
                    zdrowie += 4;
                    zdrowiepsych += 2;
                    rozrywka += 1;
                    szczescie += 1;
                    napojenie -= 1;
                    wyzywienie -= 1;
                }
                else if(x5 == 2)
                {
                    System.out.println("Widzisz tę szkołę? To szóstka! Kiedyś tam pójdę");
                    rozrywka += 3;
                    szczescie += 3;
                    zdrowie += 1;
                    napojenie -= 1;
                    wyzywienie -= 1;
                }
                else if(x5 == 3)
                {
                    System.out.println("Następnym razem chodźmy na rolki!");
                    zdrowie += 3;
                    zdrowiepsych += 1;
                    rozrywka += 2;
                    napojenie -= 1;
                    wyzywienie -= 1;
                }
                else 
                {
                    System.out.println("Ojć! Nie ma takiej opcji! ᕙ(◕ᗝ◕)ᕗ");
                    i--;
                    continue;
                }
            }
            else if(x == 6)
            {
                System.out.println("Jaki rodzaj imprezy preferujesz? Kameralne spotkanie(1), Biba w klubie(2), Piknik discopolo(3)");
                int x6 = sc.nextInt();
                if(x6 == 1)
                {
                    System.out.println("O zaproszę swoich najlepszych przyjaciół!");
                    szczescie += 6;
                    rozrywka += 4;
                    napojenie -= 1;
                    wyzywienie -= 1;
                    zdrowiepsych += 2;
                }
                else if(x6 == 2)
                {
                    System.out.println("CrunchChips jest impreza!");
                    szczescie += 3;
                    rozrywka += 3;
                    wyzywienie -= 3;
                    napojenie -= 3;
                }
                else if(x6 == 3)
                {
                    System.out.println("Przez twe oczy, twe oczy zielone oszalałem!");
                    szczescie += 1;
                    zdrowiepsych -= 10;
                    wyzywienie += 1;
                    napojenie += 1;
                    rozrywka -= 5;
                }
                else 
                {
                    System.out.println("Ojć! Nie ma takiej opcji! ᕙ(◕ᗝ◕)ᕗ");
                    i--;
                    continue;
                }
            }
            else 
            {
                 System.out.println("Ojć! Nie ma takiej opcji! ᕙ(◕ᗝ◕)ᕗ");
                 i--;
                 continue;
            }
            System.out.println("Już jestem zmęczony! Idę spać. Do zobaczenia jutro!");
            System.out.println("Stan statystyk Tamagotchi na dzień dzisiejszy wygląda następująco:");
            System.out.println("Szczęście: " + szczescie);
            System.out.println("Wyżywienie: " + wyzywienie);
            System.out.println("Zdrowie: " + zdrowie);
            System.out.println("Napojenie: " + napojenie);
            System.out.println("Zdrowie Psychiczne: " + zdrowiepsych);
            System.out.println("Rozrywka: " + rozrywka);
        }
        System.out.println("Mineło 20 dni. Cieszę się, że wspólnie spędziliśmy ten czas! Sprawdźmy twój wynik: ");
        System.out.println("Szczęście: " + szczescie);
        System.out.println("Wyżywienie: " + wyzywienie);
        System.out.println("Zdrowie: " + zdrowie);
        System.out.println("Napojenie: " + napojenie);
        System.out.println("Zdrowie Psychiczne: " + zdrowiepsych);
        System.out.println("Rozrywka: " + rozrywka);
        System.out.println("Do zobaczenia następnym razem !");
    }
}