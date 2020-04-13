import java.util.Scanner;
class Silnia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = 1;
        long x = 0;
        System.out.print("Ile chcesz silni?  ");
        x = sc.nextLong();
        for(long n = 1; n<=x;n++)
        {
          A = A * n;
          System.out.print(n);
          System.out.print(".");
          System.out.println(A);
        }
        sc.close();
    }
}