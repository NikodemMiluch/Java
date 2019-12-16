import java.util.sca;

class CzyParzysta {
  public static void main(String[] args) {


    int a;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj liczbę:");
    a = scanner.nextInt();
    if(a%2==0)
    {
      System.out.println("Liczba jest parzysta");
    }
    else 
    System.out.println("Liczba nie jest parzysta");
    }
}
