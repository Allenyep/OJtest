import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by allen on 2017/5/14.
 */
public class Main27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
//        int flag=1;
//        if(n<0){
//            flag=0;
//        }
//        if(n<8){
//            System.out.println(n);
//            return;
//        }
//        else {
//            ArrayList<Integer> arr=new ArrayList<>();
//            int i=0;
//            while (n>8){
//                arr.add(n%8);
//                n=n/8;
//                if(n<8)
//                    arr.add(n);
//            }
//            Collections.reverse(arr);
//            StringBuilder strb=new StringBuilder();
//            for(int temp:arr){
////                System.out.print(temp);
//                strb.append(temp);
//            }
//            System.out.print(Integer.valueOf(String.valueOf(strb)));
//        }
        System.out.println(Integer.toOctalString(n));
    }
}

/*
* 输入一个整数，将其转换成八进制数输出。
输入描述:
输入包括一个整数N(0<=N<=100000)。


输出描述:
可能有多组测试数据，对于每组数据，
输出N的八进制表示数。*/
