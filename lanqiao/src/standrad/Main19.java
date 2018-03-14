package standrad;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *   算法训练 表达式计算
 * Created by Administrator on 2018/1/30.
 */
public class Main19 {
    //方法一
    //先将中缀转换为后缀，用后缀计算表达式值
    //使用Arraylist代替栈

    //方法二
    //创建两个堆栈,放符号栈和数字栈
    //分别抽取进行运算
    static Stack<Integer> integers=new Stack<>();
    static Stack<Character> characters=new Stack<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();

        characters.push('#');
        char[] chs=str.toCharArray();
        int num=0;

        //数字
        for(int i=0;i<str.length();i++){
            if(chs[i]>='0'&&chs[i]<='9'){
                num=chs[i]-'0';
                for (i = i + 1; i < str.length(); i++) {
                    if ('0' <= chs[i] && chs[i] <= '9') {
                        num = num * 10 + (chs[i] - '0');
                    } else {
                        i--;
                        break;
                    }
                }
                integers.push(num);
                continue;
            }
            //运算符
            if(chs[i]=='+'||chs[i]=='-'||chs[i]=='*'||chs[i]=='/'){
                while (opCompare(characters.peek(),chs[i])&&integers.size()>1){
                    calc();
                }
                characters.push(chs[i]);
                continue;
            }

            if(chs[i]=='('){
                characters.push(chs[i]);
                continue;
            }

            if(chs[i]==')'){
                while (characters.peek()!='('&&integers.size()>1){
                    calc();
                }
                characters.pop();
            }
        }
        while (integers.size()>1){
            calc();
        }
        System.out.println(integers.get(0));
    }

    /**
     *
     * @param op1 栈顶符号
     * @param op2 入栈符号
     * @return
     */
    public static boolean opCompare(char op1,char op2){
        if(op1=='*'||op1=='/'){
            return true;
        }
        if(op2=='*'||op2=='/'||op1=='('){
            return false;
        }
        return true;
    }

    public static void calc(){
        char op=characters.pop();
        int num2=integers.pop();
        int num1=integers.pop();

        switch (op){
            case '+':
                integers.push(num1+num2);
                break;
            case '-':
                integers.push(num1-num2);
                break;
            case '*':
                integers.push(num1*num2);
                break;
            case '/':
                integers.push(num1/num2);
                break;
            default:break;
        }
    }

}
