package standrad;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * Created by Administrator on 2018/1/4.
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(Integer.toHexString(new Scanner(System.in).nextInt()).toUpperCase());
        long a;
        Scanner in=new Scanner(System.in);
        a=in.nextLong();
        ArrayList<String> str=new ArrayList<>();

        while (a>16){
            int temp=(int)a%16;
            if(temp>9){
                switch (temp){
                    case 10:str.add("A");break;
                    case 11:str.add("B");break;
                    case 12:str.add("C");break;
                    case 13:str.add("D");break;
                    case 14:str.add("E");break;
                    case 15:str.add("F");break;
                    default:break;

                }
            }else {
                str.add(String.valueOf(temp));
            }

            a=a/16;
        }
        str.add(String.valueOf(a));
        Collections.reverse(str);
        for(String s:str){
            System.out.print(s);
        }
    }

}
