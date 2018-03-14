package standrad;

import java.util.Scanner;

/**
 *  基础练习 闰年判断
 * Created by Administrator on 2018/1/10.
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if((n%4==0&&n%100!=0)||n%400==0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
