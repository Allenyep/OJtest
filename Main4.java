import java.util.*;

/**
 * Created by allen on 2017/4/9.
 */

/*输入包括两行：
第一行为序列长度n(1 ≤ n ≤ 50)
第二行为n个数sequence[i](1 ≤ sequence[i] ≤ 1000)，以空格分隔*/
public class Main4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Set<Integer> set = new LinkedHashSet<>();//声明LinkedHashSet
        for(int i = 0; i < n; i++){
            int number = in.nextInt();//赋值给某个变量
            //若set中包含该元素，先删再加；若不包含，直接加
            if (set.contains(number)){
                set.remove(number);
            }
            set.add(number);
        }
        Iterator it = set.iterator();
        if(it.hasNext()){
            Integer number = (Integer)it.next();
            System.out.print(number);
        }
        while(it.hasNext()){
            Integer number = (Integer)it.next();
            System.out.print(" "+number);
        }
    }
}
