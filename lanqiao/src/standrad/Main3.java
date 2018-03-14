package standrad;

        import java.util.Scanner;

/**
 * http://blog.csdn.net/catchingsun/article/details/50572050
 * Created by Administrator on 2018/1/4.
 */
public class Main3 {
    public static void main(String[] args) {
        String s;
        Scanner in=new Scanner(System.in);
        s=in.next();
        String result=Long.valueOf(s,16).toString();


        System.out.println(result);
    }
}
