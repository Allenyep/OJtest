package standrad;

import java.util.Scanner;

/**
 * 基础练习 查找整数
 * Created by Administrator on 2018/1/10.
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int flag=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int find=in.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==find){
                System.out.println(i+1);
                flag=1;
                return;
            }
        }
        if(flag==0)
            System.out.println(-1);
    }
}
