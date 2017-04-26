import java.util.Scanner;

/**
 * Created by allen on 2017/4/25.
 */
public class Main21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        while (in.hasNext()) {
            str = in.nextLine();
            System.out.print(getResult(str));
        }

    }
    public static String getResult(String str){
        char[] chs = str.toCharArray();
        int num = 0;
        for (int i = chs.length - 1; i >= 0; i--) {
            if ((chs[i] >= 'A') && (chs[i] <= 'Z')) {
                num++;
                for (int j = i; j < chs.length - num; j++) {
                    char temp = chs[j + 1];
                    chs[j + 1] = chs[j];
                    chs[j] = temp;
                }
            }
        }
        String newstr=String.valueOf(chs);
        return newstr;
    }
}
