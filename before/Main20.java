package before;

import java.util.Scanner;

/**
 * Created by allen on 2017/4/21.
 */
public class Main20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String str2=new StringBuilder(str).reverse().toString();
        char[] chs1=str.toCharArray();
        char[] chs2=str2.toCharArray();
        int n=chs1.length;
        int[][] result=new int[n+1][n+1];
        for(int i=1;i<chs1.length+1;i++){
            for (int j=1;j<chs2.length+1;j++){
                if(chs1[i-1]==chs2[j-1]){
                    result[i][j]=result[i-1][j-1]+1;
                }else {
                    result[i][j]=Math.max(result[i-1][j],result[i][j-1]);
                }
            }
        }
        System.out.print(n-result[n][n]);
    }
}

/*给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
输出需要删除的字符个数。

输入描述:

输入数据有多组，每组包含一个字符串s，且保证:1<=s.length<=1000.



输出描述:

对于每组数据，输出一个整数，代表最少需要删除的字符个数。

输入例子:
abcda
google

输出例子:
2
2
* */