package hard;

import java.util.Scanner;

/**
 * 算法训练 最大最小公倍数
 * Created by Administrator on 2018/1/11.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long result;
        if (N < 3) {
            result = N;
        } else if (N % 2 != 0) {
            result = N * (N - 1) * (N - 2);
        } else if (N % 3 != 0) {
            result = (N) * (N - 1) * (N - 3);
        } else
            result = (N - 1) * (N - 2) * (N - 3);

        System.out.println(result);
    }
}
