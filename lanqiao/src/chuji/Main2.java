package chuji;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Main2 {
    public static void main(String[] args) {
        double r;
        Scanner in=new Scanner(System.in);
        r=in.nextInt();
        double s=r*r*3.14159265358979323;
        DecimalFormat df=new DecimalFormat("###.0000000");
        System.out.println(df.format(s));
    }
}
