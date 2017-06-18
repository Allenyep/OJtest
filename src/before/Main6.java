package before;

import java.util.Scanner;

/**
 * Created by allen on 2017/4/10.
 */
public class Main6 {
    /*
    * 牛牛想在[a, b]区间内找到一些数满足可以被一个整数c整除,现在你需要帮助牛牛统计区间内一共有多少个这样的数满足条件
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            while(a%c != 0){
                a++;
            }
            if(a>b){
                System.out.println(0);
            }else {
                //这个吊
                System.out.println((b-a)/c + 1);
            }
        }
    }
}
