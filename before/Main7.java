package before;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by allen on 2017/4/10.
 */
public class Main7 {
    /*
    * 牛牛手里有N根木棒,分别编号为1~N,现在他从N根里想取出三根木棒，使得三根木棒构成一个三角形,你能计算出牛牛有多少种取法吗?
    * (考虑两种取法中使用的木棒编号有一个不一样就认为是不同的取法)。
    输入描述:
    首先输入一个正整数N，接下来的一行共有N个正整数表示每个木棒的长度。

    N ≤ 50, 木棒的长度 ≤ 10000.


    输出描述:
    输出一个整数表示方法数。

    输入例子:
    5
    1 2 3 4 5

    输出例子:
    3
    * */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i;
        int[] arr=new int[n];
        int count=0;
        for (i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        Arrays.sort(arr);
        for(i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]>arr[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
