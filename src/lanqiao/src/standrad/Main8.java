package standrad;

import java.util.Scanner;

/**
 *   基础练习 杨辉三角形
 * Created by Administrator on 2018/1/10.
 */
public class Main8 {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[][] arr=new int[n][n];

        arr[0][0]=1;
        if(n>1)
            arr[1][0]=arr[1][1]=1;
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                arr[i][0]=arr[i][i]=1;
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]);
                if(i!=j)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
