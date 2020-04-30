import java.util.*;
public class kx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        y = y * 60;
        x = x * 60;
        x = x+y;
        x = x / 60;
    
        System.out.println(x); 
    }

}