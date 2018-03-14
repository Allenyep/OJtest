import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by allen on 2018/1/7.
 */
public class Main2 {
    public static void main(String[] args) {
        double r;
        Scanner in=new Scanner(System.in);
        r=in.nextDouble();
        double s=r*r*r*3.1415926*4/3;
        DecimalFormat df=new DecimalFormat("###.00000");
        System.out.println(df.format(s));
    }
}
