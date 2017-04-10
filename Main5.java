import java.util.Scanner;

/**
 * Created by allen on 2017/4/10.
 */
public class Main5 {
    /*输出为一个整数，表示最长公共连续子串的长度。*/
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String str1=in.nextLine();
        String str2=in.nextLine();
        int[][] dp;
        int Max;
        int i,j;
        int len1=str1.length();
        int len2=str2.length();
        if ( len1 < 1 || len2 < 1){
            System.out.print(0);
            return;
        }
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        dp=new int[len1+1][len2+1];

        for(i=0;i<len1;i++){
            if(ch1[i]==ch2[0]){
                dp[i][0]=1;
            }
        }

        for(i=0;i<len2;i++){
            if(ch1[0]==ch2[i]){
                dp[0][i]=1;
            }
        }
        /*
         for ( int i = 0 ; i < len1 ; i++){
            if ( ch1[i] == ch2[0]){
                dp[i][0] = 1;
            }
        }

        for ( int i = 0 ; i < len2 ; i++){
            if ( ch2[i] == ch1[0]){
                dp[0][i] = 1;
            }
        }
        * */
        Max=dp[0][0];
        for (i=1;i<len1;i++){
            for (j=1;j<len2;j++){
                if(ch1[i]==ch2[j]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                if(dp[i][j]>Max){
                    Max=dp[i][j];
                }
            }
        }
        System.out.print(Max);

    }

}
