class ptest {
  public static void main(String[] args) {
    for(int x=0;x<=100000;x++){
    int[] T = new int[x];
    int y = 0;
    for(;y<x;y++)
    {
      T[y] = y;
    }
    int p = 0;
    int k = T.length-1;
    int s = 0;
    int ileRazy = 1;
    while(p<k){
      ileRazy++;
      s = (p+k)/2;
      if(T[s]>=x){
        k = s;
      }
      else{
        p = s+1;
      }
    }
    System.out.println("Dla elementów: " + y + " mamy powtórzeń " + ileRazy);
    }
  }
}