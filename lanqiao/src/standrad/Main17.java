package standrad;

import java.util.Scanner;

/**
 *  算法训练 图形显示
 * Created by Administrator on 2018/1/30.
 */
public class Main17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
                if(j!=1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
