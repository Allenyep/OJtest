import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by allen on 2017/4/19.
 */
public class Main18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<nums.length;i++){
            nums[i]=in.nextInt();
        }
        Arrays.sort(nums);
        int temp=nums[0];
        for (int i=0;i<nums.length-1;i++){
//            int temp=nums[i];
            if(nums[i]+1!=nums[i+1]){
                if(nums[i]+2==nums[i+1]&&nums[n-1]==nums[0]+n){
                    System.out.print(nums[i]+1);
                    return;
                }
                else {
                    System.out.print("mistake");
                    return;
                }
            }
        }
        if (nums[0]-1>0)
            System.out.print((nums[0]-1)+" "+(nums[n-1]+1));
        else
            System.out.print((nums[n-1]+1));
    }
}

/*
*牛牛的好朋友羊羊在纸上写了n+1个整数，羊羊接着抹除掉了一个整数，给牛牛猜他抹除掉的数字是什么。牛牛知道羊羊写的整数神排序之后是一串连续的正整数，
* 牛牛现在要猜出所有可能是抹除掉的整数。例如：
10 7 12 8 11 那么抹除掉的整数只可能是9                  7 8 10 11 12
5 6 7 8 那么抹除掉的整数可能是4也可能是9

输入描述:
输入包括2行：

第一行为整数n(1 <= n <= 50)，即抹除一个数之后剩下的数字个数

第二行为n个整数num[i] (1 <= num[i] <= 1000000000)


输出描述:
在一行中输出所有可能是抹除掉的数,从小到大输出,用空格分割,行末无空格。如果没有可能的数，则输出mistake

输入例子:
2
3 6

输出例子:
mistake
* */