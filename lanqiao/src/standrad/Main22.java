package standrad;

import java.util.Scanner;

/**
 *  算法训练 删除数组零元素
 * Created by Administrator on 2018/1/31.
 */
public class Main22 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        int[] arr=new int[n];
        int[] arr2=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr2[count++]=arr[i];
            }
        }
        if(count==0){
            System.out.println(0);
            return;
        }
        System.out.println(count);
        count--;
        for(int i=0;i<n;i++){
            if(arr2[i]!=0){
                System.out.print(arr2[i]);
                if(count>0){
                    System.out.print(" ");
                    count--;
                }
            }
        }
    }
}
