package chuji;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int[] arr=new int[1000000];
        arr[0]=1;
        arr[1]=1;
        int result=1;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=2;i<n;i++){
            arr[i]=(arr[i-1]+arr[i-2])%10007;
        }
        System.out.println(arr[n-1]);
    }
}
