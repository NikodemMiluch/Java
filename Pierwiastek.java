import java.util.*;
class Pierwiastek {
  public static void main(String[] args) {
    // Program który, jezeli pierwiastek z liczby jest calkowity wypisuje go, jezeli nie, daje pomiedy jakimi liczbmi znajduje sie ta liczba
    System.out.println("Podaj liczbę: ");
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int i = 2;
    for(i = 2; i * i <= n; i++ ){}
    System.out.println(i-1);
    if((i-1)*(i-1)!=n)
    {
      System.out.println(i);
    }
    sc.close();
  }
}