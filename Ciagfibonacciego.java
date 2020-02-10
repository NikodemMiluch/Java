class Ciagfibonacciego {
    public static void main(String[] args) {
        /* int jest za maly zeby zmiescic*/
        long a = 1;
        long b = 1;
        long x = 3;
        System.out.println(a);
        System.out.println(b);
        while(x<100) 
        {
          a = a + b;
          System.out.print(x);
          System.out.print(".");
          System.out.println(a);
          b= a + b;
          x++;
          System.out.print(x);
          System.out.print(".");
          System.out.println(b);
          x++;
        }
     }
}