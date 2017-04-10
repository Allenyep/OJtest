import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by allen on 2017/4/10.
 */

/*
*
* 牛牛在二维坐标系中画了N个点，且都是整点。现在牛牛想画出一个矩形，使得这N个点都在矩形内或者在矩形上。
矩形的边均平行于坐标轴。牛牛希望矩形的面积最小。请你帮助牛牛计算下最小矩形的面积。
输入描述:
首先输入一个正整数N表示点的个数（2 <= N <= 50）

接下来N行每行两个整数x, y，表示该点的坐标。绝对值均小于等于100.


输出描述:
一个整数表示最小矩形的面积。

输入例子:
2
0 1
1 0

输出例子:
1
*
* */
public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] X=new int[n];
        int[] Y=new int[n];
        int Xmax,Xmin,Ymax,Ymin;
        int i;

        for (i=0;i<n;i++){
            X[i]=in.nextInt();
            Y[i]=in.nextInt();
        }
        Arrays.sort(X);
        Arrays.sort(Y);
        Xmax=X[n-1];Xmin=X[0];
        Ymax=Y[n-1];Ymin=Y[0];

        int S=(Ymax-Ymin)*(Xmax-Xmin);
        System.out.print(S);
    }
}
