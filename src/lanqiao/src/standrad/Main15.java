package standrad;

import java.util.Scanner;

/**
 *  算法训练 P0103
 * Created by Administrator on 2018/1/30.
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        if(str.length()!=1)return;
        char ch=str.charAt(0);
        if(ch>'Z'||ch<'A'){
            return;
        }
        System.out.println((char)(ch-'A'+'a'));
    }
}
