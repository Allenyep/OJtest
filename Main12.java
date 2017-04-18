import java.util.Scanner;

/**
 * Created by allen on 2017/4/12.
 */

/*
*
* 一个数组有 N 个元素，求连续子数组的最大和。 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
输入描述:
输入为两行。
第一行一个整数n(1 <= n <= 100000)，表示一共有n个元素
第二行为n个数，即每个元素,每个整数都在32位int范围内。以空格分隔。


输出描述:
所有连续子数组中和最大的值。

输入例子:
3
-1 2 1

输出例子:
3
* */
public class Main12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j;
        long max;
        long temp;
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        max = getMax(arr);
        temp=arr[0];
        for (i = 0; i < n; i++) {
            if (temp >= 0)
                temp += arr[i];
            else
                temp = arr[i];
            if (temp > max) {
                max = temp;
            }
        }

        System.out.print(max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
