import java.util.Scanner;

/**
 * Created by allen on 2017/4/19.
 */
public class Main17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        int result=0;
//        System.out.print(str1+"  "+str2);
        char[] chs1=str1.toCharArray();
        char[] chs2=str2.toCharArray();
        for (int i=0;i<chs1.length;i++){
            switch (chs1[i]){
                case 'A':
                    if (chs2[i]!='T'){
                        result++;
                        break;
                    }break;
                case 'C':
                    if (chs2[i]!='G'){
                        result++;
                        break;
                    }break;
                case 'G':
                    if (chs2[i]!='C'){
                        result++;
                        break;
                    }break;
                case 'T':
                    if (chs2[i]!='A'){
                        result++;
                        break;
                    }break;
            }
        }
        System.out.print(result);
    }
}


/*
* 输入包括一行：
包括两个字符串,分别表示两条链,两个字符串长度相同且长度均小于等于50。


输出描述:
输出一个整数，即最少需要多少次让两条碱基链配对成功

输入例子:
ACGT TGCA

输出例子:
0
* */