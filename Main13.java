import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by allen on 2017/4/12.
 */

/*
* 某餐馆有n张桌子，每张桌子有一个参数：a 可容纳的最大人数； 有m批客人，每批客人有两个参数:b人数，c预计消费金额。 在不允许拼桌的情况下，
* 请实现一个算法选择其中一部分客人，使得总预计消费金额最大
输入描述:
输入包括m+2行。
第一行两个整数n(1 <= n <= 50000),m(1 <= m <= 50000)
第二行为n个参数a,即每个桌子可容纳的最大人数,以空格分隔,范围均在32位int范围内。
接下来m行，每行两个参数b,c。分别表示第i批客人的人数和预计消费金额,以空格分隔,范围均在32位int范围内。


输出描述:
输出一个整数,表示最大的总预计消费金额

输入例子:
3 5
2 4 2
1 3
3 5
3 7
5 9
1 10

输出例子:
20
* */
public class Main13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date= format.format(new Date());
        java.sql.Date sqlDate=new java.sql.Date(new Date().getTime());
        System.out.println(sqlDate);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        int i,j;
        int[] a=new int[n];
//        int[] b=new int[m];
//        int[] c=new int[m];
        int b,c;
        Map<Integer,Integer> map=new HashMap<>();
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for (i=0;i<m;i++){
            b=in.nextInt();
            c=in.nextInt();
            map.put(b,c);
        }
        System.out.print(map);

    }
    public static java.sql.Date toSqlDate(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }

}
