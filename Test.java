
import java.util.*;
class Test
{
  public static int f(int a[], int b[])
  {
    int q = 0;
    int tab[] = new int[a.length];
    int p = a[0];
    for(int i = 0;i<a.length;i++)
     {
      if(a[i] < p)
       {
         p = a[i];
       }
     }
     for(int i = 0;i<a.length;i++)
     {
       if(a[i]==p)
       {
         tab[q]=i;
         q += 1;
       }
     }
     if(q>1){
     p = b[tab[0]];  
     for(int i = 0;i<q;i++)
     {
       if(p > b[tab[i]])
       {
         p = b[tab[i]];
       }
     }
     }
     return p;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int z = sc.nextInt();
    int a[] = new int[z];
    int b[] = new int[z];
    for(int i = 0;i<z;i++)
    {
      a[i] = sc.nextInt();
    }
    for(int i = 0;i<z;i++)
    {
      b[i] = sc.nextInt();
    }
    System.out.println(f(a,b));
  }
}
