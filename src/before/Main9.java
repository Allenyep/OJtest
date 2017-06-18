package before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by allen on 2017/4/10.
 */
/*
*
* 牛牛在研究他自己独创的平衡数，平衡数的定义是：将一个数分成左右两部分，分别成为两个新的数。
左右部分必须满足以下两点：
1，左边和右边至少存在一位。
2，左边的数每一位相乘如果等于右边的数每一位相乘，则这个数称为平衡数。
例如：1221这个数，分成12和21的话，1*2=2*1，则称1221为平衡数，再例如：1236这个数，可以分成123和1*2*3=6，所以1236也是平衡数。而1234无论怎样分也不满足平衡数。
输入描述:
输入一个正整数（int范围内）。


输出描述:
如果该数是平衡数，输出 "YES", 否则输出 "NO"。

输入例子:
1221
1234

输出例子:
YES
NO
* */

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int yushu = 0;

        List<Integer> nums2 = new ArrayList<Integer>();
        int i, j;
        do {
//            nums[i++]=n%10;
            nums2.add(n % 10);
            n = n / 10;
        } while (n != 0);

        int[] nums = new int[nums2.size()];
        for (i = 0; i < nums.length; i++) {
            nums[i] = nums2.get(i);

        }

        if (nums.length <= 1) {
            System.out.println("NO");
            return;
        }
        int left = 1;
        int right = 1;
        boolean bool = false;
        for (i = 0; i < nums.length; i++) {
            left = left * nums[i];
            for (j = i + 1; j < nums.length; j++) {
                right = right * nums[j];
            }
            if (left == right) {

                bool = true;
                break;
            } else {
                right = 1;
            }
        }
        if (bool) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }

}
