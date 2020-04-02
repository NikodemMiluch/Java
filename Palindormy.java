import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Podaj słowo: ");
  String q = sc.next();
  int x = 1;
   int dl = q.length(); // ilosc liter w string
   int p = dl - 1;
   int l = 0;
  while(p>l)
  {
    if(q.charAt(l)!= q.charAt(p))
    {
      x = 0;
      break;
    }
    l++;
    p--;
  }
  if(x == 1)
  {
    System.out.println("Słowo " +q +" jest palindromem");
  }
  else if(x == 0)
  {
    System.out.println("Słowo "+ q +" nie jest palindromem");
  }
  sc.close();
}
}