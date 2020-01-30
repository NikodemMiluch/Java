import java.util.Scanner;

class Trojkaty {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String odp;
    int r = 1;
    while(r==1)
    {
    System.out.print("Od góry(1) czy od dołu(2):");
    odp = scan.next();
    if(odp.equals("2"))
    {
      for(int a = 0;a<10;a++)
      {
        for(int b = 0;b<a+1;b++)
        {
          System.out.print("-");
        }
        System.out.println("");
      }
      
    }
    else
    {
      for(int a = 10;a>0;a--)
      {
        for(int b = 0;b<a;b++)
        {
          System.out.print("-");
        }
        System.out.println("");
      }
    }
    System.out.print("Dalej = 1");
    r = scan.nextInt();
  }
    scan.close();
  }
}