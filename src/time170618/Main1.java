package time170618;

import java.util.Scanner;

/**
 * Created by allen on 2017/6/18.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result=0,cnt=0;
        int n = in.nextInt();
        if(n<=0)return;
        int arr[]=new int[n];
        int mei=in.nextInt();
        for(int i=2;i<n;i++){
            arr[i]=in.nextInt();
            if(arr[i]<=mei)cnt++;
        }
        if(cnt==0) System.out.println(0);
        else {
            cnt++;
            while (cnt>0){
                cnt/=2;
                result++;
            }
        }
        System.out.println(result);
    }
}
