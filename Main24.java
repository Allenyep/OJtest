import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by allen on 2017/5/2.
 */
public class Main24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        if(N<3){
            System.out.println(-1);
            return;
        }
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        if(N==3){
            System.out.println(arr[2]);
        }
        int min=arr[0];
        int time=2;
        for(int i=1;i<arr.length;i++){
            if(min<arr[i]){
                min=arr[i];
                time--;
            }
            if(time==0){
                System.out.println(min);
                return;
            }
        }
        System.out.println(-1);
    }
}
