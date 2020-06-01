import java.util.*;
class NWW {
    public static void pier(int a)
    {
        int dz = 2;
        while(a>0)
        {
            if(a%dz == 0)
            {
                a /= dz;
                System.out.print(a + " ");
                System.out.println(dz);
            }
            else{dz++;}
        }
        System.out.print(a + " ");
        System.out.println(dz);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pier(a);
    }
}
