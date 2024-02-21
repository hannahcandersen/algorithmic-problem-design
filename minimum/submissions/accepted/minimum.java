import java.util.Scanner;
import java.lang.Math;

public class minimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(Math.min(n, m));
    }
}
