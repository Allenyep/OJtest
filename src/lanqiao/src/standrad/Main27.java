package standrad;

import java.util.Scanner;

/**
 *   算法训练 6-1 递归求二项式系数值
 * Created by Administrator on 2018/2/1.
 */
public class Main27 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();

        System.out.println(calc(k,n));
    }

    public static int calc(int k,int n){
        if(k==0||k==n){
            return 1;
        }
        return calc(k,n-1)+calc(k-1,n-1);
    }
}
