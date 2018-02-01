package standrad;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 算法训练 字串统计
 * TODO:有两个用例过不了
 * Created by Administrator on 2018/1/31.
 */
public class Main24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        boolean hasflag=false;

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int j = 0; j < n ; j++) {
            sb.append(str.charAt(j));
        }
        hashMap.put(String.valueOf(sb),1);
        sb.delete(0, n);


        for (int i = 1; i < str.length() - n; i++) {
            for (int j = i; j < n + i; j++) {
                sb.append(str.charAt(j));
            }
            for (String s : hashMap.keySet()) {
                if (sb.toString().equals(s)) {
                    int tempcount = hashMap.get(s);
                    hashMap.put(s, ++tempcount);
                    hasflag=true;
                    break;
                }
                hasflag=false;
            }

            if(!hasflag){
                hashMap.put(String.valueOf(sb), count);
            }

            sb.delete(0, n);
        }

        int maxvalue=0;
        String max="";
        for(String s:hashMap.keySet()){
            if(maxvalue<hashMap.get(s)){
                maxvalue=hashMap.get(s);
                max=s;
            }
            else if(maxvalue==hashMap.get(s)){
                if(max.length()<=s.length()){
                    max=s;
                }
            }
        }

        System.out.println(max);

    }
}
