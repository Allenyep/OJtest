package before;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by allen on 2017/4/26.
 */
public class Main223 {
    public static void main(String[] args) {
        filter("100-trade-done","1*trade*done");
    }
    public static void filter(String tradedone,String pattern){
        StringBuilder sb=new StringBuilder(pattern);
        sb.insert(sb.indexOf("*"),'.');
        sb.insert(sb.lastIndexOf("*"),'.');

        while (sb.indexOf("?")>0){
            sb.replace(sb.indexOf("?"),sb.indexOf("?")+1,".");
        }
        pattern=new String(sb);
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher=pattern1.matcher(tradedone);
        if(matcher.matches()){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
