import java.util.Scanner;

/**
 * 历届试题 分糖果
 * Created by allen on 2018/1/7.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        boolean flag = false;
        int[] arr = new int[n];
        int[] half = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        while (!flag) {



            for (int i = 0; i < n; i++) {
                if (i == n - 1)
                    half[0] = arr[i] / 2;
                else
                    half[i + 1] = arr[i] / 2;
            }

            for (int i = 0; i < n; i++) {
                arr[i] = arr[i] / 2 + half[i];
                if (arr[i] % 2 ==1) {
                    arr[i]++;
                    result++;
                }
            }
            for (int i = 0; i < n - 1; i++) {
                if (arr[0] != arr[i]) {
                    flag = false;
                    break;
                }
                flag = true;
            }

        }
        System.out.println(result);

        /*while(true) {
            boolean judge = true;
            for(int i = 1;i < n;i++) {
                if(arr[0] != arr[i]) {
                    judge = false;
                    break;
                }
            }
            if(judge)
                break;
            int[] half = new int[n];
            for(int i = 0;i < n;i++) {
                if(i == n - 1)
                    half[0] = arr[i] / 2;
                else
                    half[i + 1] = arr[i] / 2;
            }
            for(int i = 0;i <n;i++) {
                arr[i] = arr[i] / 2 + half[i];
                if(arr[i] % 2 == 1) {
                    result++;
                    arr[i]++;
                }
            }
        }
        System.out.println(result);*/
    }


}
