package before;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int sum = 0;
        int dp[] = new int[210000];
        int n = in.nextInt();//输入次数,第一行
        int[] num = new int[n];
        for (i = 0; i < n; i++) {
            num[i] = in.nextInt() / 1024;
            sum += num[i];
        }
//        Arrays.sort(num);
        for (i = 0; i < n; i++) {
            for (int j = sum / 2; j >= num[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - num[i]] + num[i]);

            }
        }

        System.out.println((sum - dp[sum / 2]) * 1024);
    }
}
