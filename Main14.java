import java.util.Scanner;

/**
 * Created by allen on 2017/4/16.
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        int[] n=new int[T];
        int[] result=new int[T];
        int i,j;
        for (i=0;i<n.length;i++){
            n[i]=in.nextInt();
            int[] arr=new int[n[i]];
            for (j=0;j<n[i];j++){
                arr[j]=in.nextInt();
            }
            result[i]=checklength(arr,n[i]);
            System.out.println(result[i]);
        }

    }

    private static int checklength(int[] arr,int T) {
        if(T==1)return 1;
        int result=0;
        int i,j;
        int[] list=new int[T];
        for(i=0;i<T;i++){
            list[i]=1;
            for( j=0;j<i;j++){
                if(arr[j]<arr[i]&&list[j]+1>list[i]){
                    list[i] = list[j]+1;
                }
            }
        }

            for(i=0;i<T;i++){
                if(list[i]>result)
                    result  = list[i];
            }

        return result;
    }
}


/*
* 给定一个长度为N的数组，找出一个最长的单调自增子序列（不一定连续，但是顺序不能乱）
例如：给定一个长度为8的数组A{1,3,5,2,4,6,7,8}，则其最长的单调递增子序列为{1,2,4,6,7,8}，长度为6.


输入描述:

第一行包含一个整数T，代表测试数据组数。

对于每组测试数据：
N-数组的长度

a1 a2 ... an （需要计算的数组）

保证：

1<=N<=3000,0<=ai<=MAX_INT.



输出描述:

对于每组数据，输出一个整数，代表最长递增子序列的长度。


输入例子:
2
7
89 256 78 1 46 78 8
5
6 4 8 2 17

输出例子:
3
3
*
* */
