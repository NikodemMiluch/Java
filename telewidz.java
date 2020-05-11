import java.util.*;
class telewidz {
   static public Scanner sc = new Scanner(System.in);
   public static int q = sc.nextInt();
   public static String t[][] = new String[q][3];

    System.out.println(knajwcz + 1);
   }
   public static void kasowanie(int a)
   {
    for(int i = 0;i<a;i++)
    {
        for(int j = hhmm2min(t[i][0]); j<hhmm2min(t[i][1]); j++)
        {
            if(j == hhmm2min(t[i+1][0]))
            {
                if(hhmm2min(t[i+1][1]) < hhmm2min(t[i][1]))
                {
                    t[i][0] = "0";
                    t[i][1] = "0";
                    t[i][2] = "0";
                }
                else if (hhmm2min(t[i+1][1]) == hhmm2min(t[i][1]))
                {
                    t[i+1][0] = "0";
                    t[i+1][1] = "0";
                    t[i+1][2] = "0";
                }
                else
                {
                    t[i+1][0] = "0";
                    t[i+1][1] = "0";
                    t[i+1][2] = "0";
                }
            }
        }
    }
   }
     public static int hhmm2min(String x){
          int h1 = (x.charAt(0) - 48) * 10 + (x.charAt(1) - 48);
          h1 *= 60;
          h1 += (x.charAt(3) - 48) * 10 + (x.charAt(4)-48);
          return h1;
      }
    public static String min2hhmm(int min)
    {
        int h = min/60;
        int m = min%60;
        String a;
        while(h>24){h = h % 24;}
        while(m>60){h += 1; m %= 60;}
        if (m==0){a = h + ":" + m + 0;}
        else{a = h + ":" + m;}
        return a;
    }
    public static void main(String[] args) {
    for(int i = 0;i<q;i++)
    {
      String x = sc.next();//rozpoczecie
      t[i][0] = x;
      String y = sc.next();//czas trwania
      t[i][2] = y;
      String z = min2hhmm(hhmm2min(x)+hhmm2min(y));//zakończenie
      t[i][1] = z;
    }
    //użycie taktyki a
    kasowanie(q-1);
    for(int i = 0 ;i<q;i++)
    {
      System.out.println(t[i][0]);
    }
    //zaczynający się najwcześniej 
    int p1 = hhmm2min(t[0][0]);
    int najwcz = 0;
    for(int i = 0;i<q;i++)
    {
      if(hhmm2min(t[i][0]) < p1)
      {
        p1 = hhmm2min(t[i][0]);
        najwcz = i;
      }
    }
    System.out.println(najwcz + 1);
    //konczacy sie najwczesniej
    int p2 = hhmm2min(t[0][1]);
    int knajwcz = 0;
    for(int i= 0;i<q;i++)
    {
     if(hhmm2min(t[i][1]) < p2)
      {
        p2 = hhmm2min(t[i][1]);
        knajwcz = i;
      }
    }
    System.out.println(knajwcz + 1);
    //najdluzszy
    int p3 = hhmm2min(t[0][2]);
    int najdluz = 0;
    for(int i= 0;i<q;i++)
    {
     if(hhmm2min(t[i][2]) > p3)
      {
        p3 = hhmm2min(t[i][2]);
        najdluz = i;
      }
    }
    System.out.println(najdluz + 1);
    //najkrotszy
    int p4 = hhmm2min(t[0][2]);
    int najkrot = 0;
    for(int i= 0;i<q;i++)
    {
     if(hhmm2min(t[i][2]) < p4)
      {
        p4 = hhmm2min(t[i][2]);
        najkrot = i;
      }
    }
    System.out.println(najkrot + 1);
  }
}