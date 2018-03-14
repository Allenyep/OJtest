package standrad;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        //ArrayList<Integer> arrayList=new ArrayList<>();
        int[] arrayList=new int[n];
        for(int i=0;i<n;i++){
//            arrayList.add(in.nextInt());
            arrayList[i]=in.nextInt();
        }
        Arrays.sort(arrayList);
        for(int i=0;i<n;i++){
            System.out.print(arrayList[i]);
            if(i<(n-1))
                System.out.print(" ");
        }
    }
}
