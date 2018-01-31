package standrad;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 算法训练 字串统计
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


        for (int i = 2; i < str.length() - n; i++) {
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
            }

            if(hasflag){
                hashMap.put(String.valueOf(sb), count);
                hasflag=true;
            }

            sb.delete(0, n);
        }
        System.out.println(hashMap.toString());

        System.out.println(sb.toString());

    }
}
