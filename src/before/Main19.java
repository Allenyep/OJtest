package before;

import java.util.Scanner;

/**
 * Created by allen on 2017/4/19.
 */
public class Main19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


    }

    public static boolean isSu(int p){
        return false;
    }
}

/*
* 如果一个数字能表示为p^q(^表示幂运算)且p为一个素数,q为大于1的正整数就称这个数叫做超级素数幂。现在给出一个正整数n,如果n是一个超级素数幂需要找出对应的p,q。
输入描述:
输入一个正整数n(2 ≤ n ≤ 10^18)


输出描述:
如果n是一个超级素数幂则输出p,q,以空格分隔,行末无空格。
如果n不是超级素数幂，则输出No

输入例子:
27

输出例子:
3 3
*
* */
