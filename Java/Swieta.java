import java.util.Scanner;
class Swieta
{
    public static void main(String[] args) 
    {
        String x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz zobaczyć kartkę świąteczną: ");
        x = scanner.next();
        
        if(x.equals("Tak"))
        {
        System.out.println("╔═════════════════════════════════════════════════════════════════╗");
        System.out.println("║     _[_]_	   ┌─────────────────────────┐       _[_]_	  ║");
        System.out.println("║      (**)        │  Wszystkiego Najlepszego|	      (**)        ║");
        System.out.println("║  `--( : )--'     │	Z okazji	     │     `--( : )--'    ║");
        System.out.println("║    (  :  )       │ Świąt Bożego Narodzienia│       (  :  )      ║");
        System.out.println("║   		   └─────────────────────────┘       		  ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════╝");
        }
        else 
        {
            System.out.println("to nie");
        }
        
        scanner.close();
    }

}
