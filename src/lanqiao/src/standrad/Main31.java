package standrad;

import java.util.Scanner;

/**
 *   算法训练 C++ CH08 01
 *   TODO:这个题是C++的，有点问题
 *
 * Created by Administrator on 2018/2/2.
 */
public class Main31 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();

        int bool1=0,bool2=0;
        if((double)a/b==(double)c/d){
            bool1=1;
            bool2=0;
        }
        else if((double)a/b<=(double)c/d){
            bool1=0;
            bool2=1;
        }


        System.out.print("zrf is:"+a/gys(a,b)+"/"+b/gys(a,b));
        System.out.println("; ssh is:"+c/gys(c,d)+"/"+d/gys(c,d));
        System.out.println("(zrf==ssh) is:"+bool1+"; (zrf<ssh) is:"+bool2);




    }



    public static int gys(int a,int b){
        int temp;
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        while (b%a!=0){
            temp=b%a;
            b=a;
            a=temp;
        }
        return a;
    }
}
