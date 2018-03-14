package standrad;

import java.util.Scanner;

/**
 * 基础练习 字母图形
 * Created by Administrator on 2018/1/10.
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        char[][] chs=new char[n][m];
        for(int i=0;i<n;i++){
            chs[i][0]= (char) ('A'+i);
        }
        for(int i=0;i<m;i++){
            chs[0][i]= (char) ('A'+i);
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                chs[i][j]=chs[i-1][j-1];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(chs[i][j]);
            }
            System.out.println();
        }
    }
}
