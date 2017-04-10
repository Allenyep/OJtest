import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by allen on 2017/4/9.
 */

/*输入数据包括五行:

第一行为周围出租车打车点的个数n(1 ≤ n ≤ 50)

第二行为每个出租车打车点的横坐标tX[i] (-10000 ≤ tX[i] ≤ 10000)

第三行为每个出租车打车点的纵坐标tY[i] (-10000 ≤ tY[i] ≤ 10000)

第四行为办公室坐标gx,gy(-10000 ≤ gx,gy ≤ 10000),以空格分隔

第五行为走路时间walkTime(1 ≤ walkTime ≤ 1000)和taxiTime(1 ≤ taxiTime ≤ 1000),以空格分隔*/
public class Main2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i;
        int gx,gy;
        int walkTime,taxiTime;
        int n=in.nextInt();
        int[] X=new int[n];
        int[] Y=new int[n];
        for(i=0;i<n;i++){
            X[i]=in.nextInt();
        }
        for(i=0;i<n;i++){
            Y[i]=in.nextInt();
        }
        gx=in.nextInt();
        gy=in.nextInt();
        walkTime=in.nextInt();
        taxiTime=in.nextInt();

        //先算走路时间sumWalkTime
        int sumWalkTime=(absint(gx)+absint(gy))*walkTime;
        //逐个计算打车时间点sumTaxiTime[n]
        int[] sumTaxtTime=new int[n];
        for(i=0;i<n;i++){
            int walk=(absint(X[i])+absint(Y[i]))*walkTime;
            int taxi=(absint(gx-X[i])+absint(gy-Y[i]))*taxiTime;
            sumTaxtTime[i]=walk+taxi;
        }
        //排序输入最小值
        Arrays.sort(sumTaxtTime);
        int result=sumWalkTime<sumTaxtTime[0]?sumWalkTime:sumTaxtTime[0];
        System.out.println(result);
//        System.out.println(sumTaxtTime[0]);
    }

    public static int absint(int a){
        return Math.abs(a);
    }
}
