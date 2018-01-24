import java.util.Scanner;

/**
 * Created by allen on 2018/1/7.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        lcm(a, b);
    }

    public static void lcm(int a, int b) {
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        for (int i = b; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
