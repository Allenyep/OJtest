package standrad;

import java.util.Scanner;

/**
 *  算法训练 关联矩阵
 * Created by Administrator on 2018/2/1.
 */
public class Main29 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int m,n;
        m=in.nextInt();
        n=in.nextInt();
        int[][] arr=new int[m][n];

        for(int i=0;i<n;i++){
            int p1=in.nextInt();
            int p2=in.nextInt();

            arr[p1-1][i]=1;
            arr[p2-1][i]=-1;
        }

        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]);
                if(j!=n-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
