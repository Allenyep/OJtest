package standrad;

import java.util.Scanner;

/**
 *   算法训练 2的次幂表示
 * Created by Administrator on 2018/1/30.
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        System.out.println( toResult(n));


    }
    //转换为2进制
    public static String toBin(int n){
        return Integer.toBinaryString(n);
    }
    //第一步
    public static String toResult(int n){
        StringBuilder sb=new StringBuilder();
        String str=toBin(n);
        int len=str.length()-1;
        for (char c:str.toCharArray()) {
            if(c=='1'){
                if(len==2)
                    sb.append("2("+len+")");
                else if(len==1)
                    sb.append("2");
                else
                    //递归输出
                    sb.append("2("+toResult(len)+")");
                if(len!=0)
                    sb.append("+");
            }
            len--;
        }
        if(sb.toString().equals("")||sb.equals(null))
            return "0";
        if(sb.charAt(sb.length()-1)=='+')
            sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
