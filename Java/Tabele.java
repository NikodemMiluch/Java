class Tabele {
  public static void main(String[] args) {
  int A[] = new int[10];
    for(int i=0; i<10;i++)
      A[i] = (int)(Math.random()*100);
    for(int i=0; i<10;i++)
      System.out.println(A[i]);
  double sr = 0;

  for(int i=0; i<10; i++)
    sr = sr + A[i];
  sr = sr / 10;
  
  double min = Math.abs(sr-A[0]);
  int liczba = A[0];
  for(int i=1; i<10;i++)
    if(min>Math.abs(sr-A[i])){
       min = Math.abs(sr-A[i]);
       liczba = A[i];
    }
  System.out.println("Średnia tych liczb wynosi: " + sr);
  System.out.println("Najblizej średniej jest liczba: " + liczba);
  }
}