package standrad;

import java.util.Scanner;

/**
 * 基础练习 数列特征
 * Created by Administrator on 2018/1/10.
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int max=arr[0],min=arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
