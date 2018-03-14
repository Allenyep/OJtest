package standrad;

import java.util.Arrays;
import java.util.Scanner;

/**
 *   算法训练 排序
 * Created by Administrator on 2018/1/30.
 */
public class Main16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=2;i>=0;i--){
            System.out.print(arr[i]);
            if(i!=0)
                System.out.print(" ");
        }
    }
}
