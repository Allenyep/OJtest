import java.util.Scanner;
import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {
        System.out.println(GetPowerFactor(31,3));
    }
    public static int[] GetPowerFactor (int R, int N) {
        // write code here
        int i=0;
        
        ArrayList<Integer> list = new ArrayList<>();

        if(N==0){
            return new int[]{};
        }
        
        if(R<N||R<=0){
            return new int[]{0};
        }

        while(R!=0){
            // arr[i] = R%N;
            list.add(R%N);
            R=R/N;
            i++;
        }
        // System.out.println(list.size());
        for(Integer tmp:list){
            if(tmp>=2){
                return new int[]{};
            }
        }
        ArrayList<Integer> ansList = new ArrayList<>();
        int idx=0;

        // for(int j=i-1;j>=0;j--){
        //     System.out.println(list.get(j));
        //     if(list.get(j)!=0){
        //         ansList.add(list.size()-j);
        //     }
        // }
        for(int j=0;j<i;j++){
            if(list.get(j)==1){
                ansList.add(j);
            }
        }

        int[] arr = new int[ansList.size()];
        for(int j =0;j<ansList.size();j++){
            arr[j] = ansList.get(j);
            System.out.println(arr[j]);
        }
        
        return arr;
    }
}