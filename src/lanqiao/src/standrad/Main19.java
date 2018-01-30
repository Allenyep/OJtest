package standrad;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *   算法训练 表达式计算
 * Created by Administrator on 2018/1/30.
 */
public class Main19 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String strmid=in.nextLine();
        String strpostfix;
        StringBuilder sbpostfix=new StringBuilder();

        //先将中缀转换为后缀，用后缀计算表达式值
        //使用Arraylist代替栈

        System.out.println(mid2postfix(strmid));


    }

    public static String mid2postfix(String str){
        StringBuilder sb=new StringBuilder();
        char op;
        Stack<Character> stack=new Stack<>();
        for (char c:str.toCharArray()) {
            if(c>='1'&&c<='9')
                sb.append(c);
            else {
                op=stack.peek()==null?stack.peek():null;
                if(opbetter(c)<opbetter(op)){
                    stack.push(op);
                }
                else if(opbetter(c)>opbetter(op)){
                    sb.append(stack.pop());
                }else {
                    if(op=='(')
                        continue;
                    sb.append(stack.pop());
                }
            }
        }

        return sb.toString();
    }
    public static int opbetter(char c){
        switch (c){
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
            default:break;
        }
        return 0;
    }
}
