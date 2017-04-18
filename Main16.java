import java.util.Scanner;

/**
 * Created by allen on 2017/4/18.
 */
/*
* 四个方向最大值
* */
public class Main16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int D=in.nextInt();
        int i,j;
        int[][] arrs=new int[N][N];
        int[][] result=new int[N][N];
        for (i=0;i<N;i++){
            for (j=0;j<N;j++){
                arrs[i][j]=in.nextInt();
            }
        }
        int max=0;

        //横向
        for (i=0;i<N;i++){
            for (j=0;j<N-D;j++){
                int temp=0;
                int m=j;
                for (int k=0;k<D;k++){
                    temp+=arrs[i][m++];
                }
                if(max<temp)max=temp;
            }
        }


        //竖向
        for (j=0;j<N;j++){
            for (i=0;i<N-D;i++){
                int temp=0;
                int m=i;
                for (int k=0;k<D;k++){
                    temp+=arrs[m++][j];
                }
                if (max<temp)max=temp;
            }
        }


        //左上
        for (i=D-1;i<N;i++){
            for (j=0;j<N-D;j++){
                int temp=0;
                int m=i,n=j;
                for (int k=0;k<D;k++){
                    temp+=arrs[m--][n++];
                }
                if(max<temp)max=temp;
            }
        }

        //右下
        for (i=0;i<N-D;i++){
            for (j=0;j<N-D;j++){
                int temp=0;
                int m=i,n=j;
                for (int k=0;k<D;k++){
                    temp+=arrs[m++][n++];
                }
                if (max<temp)max=temp;
            }
        }

        System.out.print(max);

    }
}
/*
*
* 在一个N*N的数组中寻找所有横，竖，左上到右下，右上到左下，四种方向的直线连续D个数字的和里面最大的值
输入描述:
每个测试输入包含1个测试用例，第一行包括两个整数 N 和 D :
3 <= N <= 100
1 <= D <= N
接下来有N行，每行N个数字d:
0 <= d <= 100


输出描述:
输出一个整数，表示找到的和的最大值

输入例子:
4 2
87 98 79 61
10 27 95 70
20 64 73 29
71 65 15 0

输出例子:
193
* */