import java.util.*;
class Cool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x = x.replaceAll("l", "1");
        x = x.replaceAll("L", "1");
        x = x.replaceAll("i", "1");
        x = x.replaceAll("I", "1");
        x = x.replaceAll("j", "1");
        x = x.replaceAll("J", "1");
        x = x.replaceAll("e", "3");
        x = x.replaceAll("E", "3");
        x = x.replaceAll("a", "4");
        x = x.replaceAll("A", "4");
        x = x.replaceAll("s", "5");
        x = x.replaceAll("S", "5");
        x = x.replaceAll("z", "7");
        x = x.replaceAll("Z", "7");
        x = x.replaceAll("o", "0");
        x = x.replaceAll("o", "0");
        x = x.replaceAll("c", "(");
        x = x.replaceAll("C", "(");
        System.out.println(x);
        sc.close();
    }
}