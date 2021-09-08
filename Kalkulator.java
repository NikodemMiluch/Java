package Main;
import java.util.Scanner;
import java.math.*;


public class Main {
	public static void main(String[] arg) {
		int a = 0;
		int b = 0;
		int c = 0;
		int essa = 2;
		Scanner sc = new Scanner(System.in);
		while(essa == 2) {
			System.out.println("witam , co chcesz zrobic? (dodawnie[1] , odejmowanie[2] , mno¿enie[3], dzielnie[4] , potêgowanie[5] , zakoñcz[6]");
			a = sc.nextInt();
			switch(a)
			{
				case 1:
					System.out.println("Podaj dwie liczby które chcesz dodac");
					b = sc.nextInt();
					c = sc.nextInt();
					System.out.println(b+c);
					break;
				case 2:
					System.out.println("Podaj dwie liczby które chcesz odj¹æ");
					b = sc.nextInt();
					c = sc.nextInt();
					System.out.println(b-c);
					break;
				case 3:
					System.out.println("Podaj dwie liczby które chcesz pomno¿yæ");
					b = sc.nextInt();
					c = sc.nextInt();
					System.out.println(b*c);
					break;
				case 4:
					System.out.println("Podaj dwie liczby które chcesz podzieliæ");
					b = sc.nextInt();
					c = sc.nextInt();
					if(c==0)
					{
						System.out.println("Nie mo¿na dzielic przez zero");
						break;
					}
					System.out.println(b/c);
					break;
				case 5:
					System.out.println("Podaj liczbê któr¹ chcesz zpotêgowaæ");
					b = sc.nextInt();
					System.out.println("Podaj wyk³adnik");
					c = sc.nextInt();
					System.out.println(Math.round(Math.pow(b,c)));
					break;
				case 6:
					System.out.println("tosiema");
					essa = 1;
					break;
				default:
					System.out.println("Nie ma takiego dzia³ania");
					break;
			}
		}
		sc.close();
	}
}
