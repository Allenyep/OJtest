import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by allen on 2017/5/2.
 */
public class Main25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int[] arr=new int[N];
        int[] sort=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
            sort[i]=arr[i];
        }
        Arrays.sort(sort);
        int i=0, j=0;
        while(j<N)
        {
            if(arr[j]==sort[i])
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }

        }
        System.out.println(N-i);
    }
}
