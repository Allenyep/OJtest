package standrad;

import java.util.Scanner;

/**
 *   算法训练 未名湖边的烦恼
 * Created by Administrator on 2018/2/2.
 */
public class Main32 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int m=in.nextInt();
        int n=in.nextInt();

//        System.out.println(calc(m,n));

        int[][] arr=new int[21][21];
        for(int i=0;i<=m;i++){
            arr[i][0]=1;
        }

        for(int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if(i==j)
                    arr[i][j] = arr[i][j - 1];
                if(i>j){
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        System.out.println(arr[m][n]);

    }
    public static int calc(int m,int n){
        if(m < n)
            return 0;
        if(n == 0)
            return 1;
        return calc(m-1,n) + calc(m,n-1);
    }
}
