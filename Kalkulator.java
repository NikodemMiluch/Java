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
			System.out.println("witam , co chcesz zrobic? (dodawnie[1] , odejmowanie[2] , mno�enie[3], dzielnie[4] , pot�gowanie[5] , zako�cz[6]");
			a = sc.nextInt();
			switch(a)
			{
				case 1:
					System.out.println("Podaj dwie liczby kt�re chcesz dodac");
					b = sc.nextInt();
					c = sc.nextInt();
					System.out.println(b+c);
					break;
				case 2:
					System.out.println("Podaj dwie liczby kt�re chcesz odj��");
					b = sc.nextInt();
					c = sc.nextInt();
					System.out.println(b-c);
					break;
				case 3:
					System.out.println("Podaj dwie liczby kt�re chcesz pomno�y�");
					b = sc.nextInt();
					c = sc.nextInt();
					System.out.println(b*c);
					break;
				case 4:
					System.out.println("Podaj dwie liczby kt�re chcesz podzieli�");
					b = sc.nextInt();
					c = sc.nextInt();
					if(c==0)
					{
						System.out.println("Nie mo�na dzielic przez zero");
						break;
					}
					System.out.println(b/c);
					break;
				case 5:
					System.out.println("Podaj liczb� kt�r� chcesz zpot�gowa�");
					b = sc.nextInt();
					System.out.println("Podaj wyk�adnik");
					c = sc.nextInt();
					System.out.println(Math.round(Math.pow(b,c)));
					break;
				case 6:
					System.out.println("tosiema");
					essa = 1;
					break;
				default:
					System.out.println("Nie ma takiego dzia�ania");
					break;
			}
		}
		sc.close();
	}
}
