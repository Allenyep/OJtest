package standrad;

import java.util.Scanner;

/**
 *   算法训练 矩阵乘法
 * Created by Administrator on 2018/2/1.
 */
public class Main28 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int m=in.nextInt();
        int s=in.nextInt();
        int n=in.nextInt();

        int[][] arr1=new int[m][s];
        int[][] arr2=new int[s][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<s;j++){
                arr1[i][j]=in.nextInt();
            }
        }

        for(int i=0;i<s;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=in.nextInt();
            }
        }

        int[][] arr3=new int[m][n];

        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                //循环
                for(int k=0;k<s;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
