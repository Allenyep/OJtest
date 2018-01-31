package standrad;

import java.util.Scanner;

/**
 *    算法训练 动态数组使用
 * Created by Administrator on 2018/1/31.
 */
public class Main23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        int[] arr=new int[n];
        int sum=0,mean;

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        mean=sum/n;

        System.out.println(sum+" "+mean);
    }
}
