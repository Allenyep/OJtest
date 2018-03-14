package standrad;

import java.util.Scanner;

/**
 *   算法训练 寻找数组中最大值
 * Created by Administrator on 2018/1/31.
 */
public class Main21 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int max,maxindex;
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        max=arr[0];
        maxindex=0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        System.out.println(max+" "+maxindex);
    }
}
