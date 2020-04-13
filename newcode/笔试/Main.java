import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * 5
            5 3 1 4 2 
            2 4 5 1 3
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i=0;i<n;i++){
            start[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            end[i] = in.nextInt();
        }
        int ans = 0;
        
        for(int i=1;i<n;i++){
            HashSet set1 = new HashSet<>();
            HashSet set2 = new HashSet<>();
            for(int j=0;j<n;j++){
                if(end[j]==start[i]){
                    for(int k=0;k<i;k++){//前集合
                        set1.add(start[k]);
                    }
                    for(int k=j;k<n;k++){//后集合
                        set2.add(end[k]);
                    }
                    // System.out.println(set1);
                    // System.out.println(set2);
                    break;
                }
            }
            set1.retainAll(set2);
            if(set1.size()!=0){
                ans++;
            }
        }
        System.out.println(ans);
    }

    
    
}