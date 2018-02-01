package standrad;

import java.util.Scanner;

/**
 *   算法训练 Torry的困惑(基本型)
 * Created by Administrator on 2018/2/1.
 */
public class Main26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int result=1;
        int i=2;
        int num=n;
//        if(n==1) {
//            System.out.println(2);
//            return;
//        }
        while (num>0){
            int temp=i;
            if(isPrime(i)){
                result*=temp;
                if(result>50000){
                    result=result%50000;
                }
                num--;
            }
            i++;
        }

        System.out.println(result);
    }
    public static boolean isPrime(int n){
        if(n==1)return false;
        if(n==2)return true;
        if(n==4)return false;
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
