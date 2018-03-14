package before;

import java.util.Scanner;

/**
 * Created by allen on 2017/5/2.
 */
public class Main26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        if(N==0){
            return;
        }
        if (N==1){
            System.out.println(arr[0]);
            return;
        }
        if(N==2){
            System.out.println(Math.abs(arr[1]-arr[0]));
            return;
        }else {
            int max=0;
            int p=0;
            int sum=0;

            for(int i=1;i<arr.length;i++){
                sum+=Math.abs(arr[i]-arr[i-1]);
            }

            for(int i=1;i<arr.length-1;i++){
                int temp=Math.abs(arr[i]-arr[i-1])+Math.abs(arr[i+1]-arr[i]);
                if(temp>max){
                    max=temp;
                    p=Math.abs(arr[i+1]-arr[i-1]);
                }
            }
            System.out.println(sum-max+p);
        }


    }
}
