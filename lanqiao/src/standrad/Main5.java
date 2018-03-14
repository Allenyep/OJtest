package standrad;

import java.util.Scanner;

/**
 *
 * Created by Administrator on 2018/1/6.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a,b,c,d,e,f;
        for(int i=10000;i<999999;i++){
            if(i<100000){
                a=i%10;
                b=i/10%10;
                d=i/100%10;
                c=i/1000%10;
                e=i/10000;
                if(a==e&&b==c&&a+b+c+d+e==n){
                    System.out.println(i);
                }
            }else {
                a=i%10;
                b=i/10%10;
                d=i/100%10;
                c=i/1000%10;
                e=i/10000%10;
                f=i/100000;
                if(a==f&&b==e&&c==d&&a+b+c+d+e+f==n){
                    System.out.println(i);
                }
            }
        }
    }
}
