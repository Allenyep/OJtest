import java.util.Scanner;

/**
 * 算法训练 出现次数最多的整数
 * Created by allen on 2018/1/24.
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 0 || n > 20) return;
        int[] arr = new int[n];
        int count = 1;
        int temp = 1;
        arr[0] = in.nextInt();
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == arr[i - 1]) {
                temp++;
                if (temp > count) {
                    count = temp;
                    result = arr[i];
                }
            } else {
                temp = 1;
            }

        }
        System.out.println(result);
    }
}
