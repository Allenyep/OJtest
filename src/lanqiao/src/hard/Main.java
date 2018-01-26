package hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *   算法训练 区间k大数查询
 * Created by Administrator on 2018/1/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int m=in.nextInt();
        for(int i=0;i<m;i++){
            int l=in.nextInt();
            int r=in.nextInt();
            int K=in.nextInt();

            int[] temparr=new int[r-l+1];
            for(int j=0;j<r-l+1;j++){
                temparr[j]=arr[l-1+j];
            }
           /* for(int j=0;j<temparr.length;j++){
                System.out.print(temparr[j]+" ");
            }*/
           Arrays.sort(temparr);
            System.out.println(temparr[temparr.length-K]);
        }
    }
}
