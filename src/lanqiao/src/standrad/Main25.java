package standrad;

import java.util.Arrays;
import java.util.Scanner;

/**
 *   算法训练 最小乘积(基本型)
 * Created by Administrator on 2018/2/1.
 */
public class Main25 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T,n,result=0;
        T=in.nextInt();
        for(int i=0;i<T;i++){
            n=in.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[n];

            for(int j=0;j<n;j++){
                arr1[j]=in.nextInt();
            }
            for (int j=0;j<n;j++){
                arr2[j]=in.nextInt();
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for(int j=0;j<n;j++){
                result+=arr1[j]*arr2[n-j-1];
            }
            System.out.println(result);
            result=0;
        }

    }
}
