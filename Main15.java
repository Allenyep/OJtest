import java.util.Scanner;

/**
 * Created by allen on 2017/4/17.
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        char[] chs=str.toCharArray();
        int temp=0;
        for(int i=0;i<chs.length-1;i++){
            if(chs[i]!=chs[i+1]){
                System.out.print(i+1-temp);
                System.out.print(chs[i]);
                temp=i+1;
            }
        }
        for (int i=chs.length-1;i>0;i--){
            if (chs[i]!=chs[i-1]){
                System.out.print(chs.length-i);
                System.out.print(chs[i]);
                return;
            }
        }
        System.out.print(chs.length);
        System.out.print(chs[0]);
    }
}

/*
*
* 给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。比如字符串AAAA B CC D AA会被编码成4A1B2C1D2A。
输入描述:
每个测试输入包含1个测试用例
每个测试用例输入只有一行字符串，字符串只包括大写英文字母，长度不超过10000。


输出描述:
输出编码后的字符串

输入例子:
AAAABCCDAA

输出例子:
4A1B2C1D2A
* */
