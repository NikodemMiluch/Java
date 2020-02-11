import java.util.*;
class CzyPierwsza {
  public static void main(String[] args) {
    System.out.println("Podaj liczbę: ");
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    System.out.print("ta liczba ");
    int i = 2;
    for(i = 2; i * i <= n; i++ )
    {
      if(n % i == 0) 
      {
       System.out.print("nie ");
       break;
      }
    }
    System.out.print("jest pierwsza");
    sc.close();
  }
}