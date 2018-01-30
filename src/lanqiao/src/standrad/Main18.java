package standrad;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *   算法训练 P1103
 * Created by Administrator on 2018/1/30.
 */
public class Main18 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String op;
        double a,b,c,d;
        DecimalFormat    df   = new DecimalFormat("#.00");

        String str=in.nextLine();
        String[] strings=str.split("\\s+");
        op=strings[0];
        a=Double.valueOf(strings[1]);
        b=Double.valueOf(strings[2]);
        c=Double.valueOf(strings[3]);
        d=Double.valueOf(strings[4]);
        double A=0,B=0;

        switch (op){
            case "+":
                A=a+c;
                B=b+d;
                System.out.println(df.format(A)+"+"+df.format(B)+"i");
                break;
            case "-":
                A=a-c;
                B=b-d;
                System.out.println(df.format(A)+"+"+df.format(B)+"i");
                break;
            case "*":
                A=a*c-b*d;
                B=a*d+b*c;
                System.out.println(df.format(A)+"+"+df.format(B)+"i");
                break;
            case "/":
                if(c==0||d==0)return;
                double len=c*c+d*d;
                A=(a*c+b*d)/len;
                B=(b*c-a*d)/len;
                System.out.printf("%.2f+%.2fi",A,B) ;
                break;
            default:break;

        }
       // System.out.printf("%.2f+%.2fi",A,B);
    }
}
