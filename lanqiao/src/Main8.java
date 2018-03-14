import java.util.Scanner;

/**
 *  算法训练 大小写转换
 * Created by allen on 2018/1/24.
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
                sb.append((char)(str.charAt(i)-'A'+'a'));
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
                sb.append((char)(str.charAt(i)-'a'+'A'));
        }
        System.out.println(sb);
    }
}
