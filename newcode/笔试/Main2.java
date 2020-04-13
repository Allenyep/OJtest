import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /**
         * 3
        02:10
        200
         */

        
        int day = in.nextInt();
        String time = in.next();
        int minBack = in.nextInt();

        int min = Integer.parseInt(time.substring(0, 2));
        int sec = Integer.valueOf(time.substring(3, 5));

        int alltimeToday = min * 60 + sec;

        if(alltimeToday<minBack){
            minBack = minBack - alltimeToday;
            
            while(minBack>0){
                day--;
                if(day==0){
                    day = 7;
                }
                minBack = minBack - 24*60;
            }
            minBack = -minBack;
            System.out.println(day);
            min = minBack/60;
            sec = minBack%60;
            String minStr = String.valueOf(min);
            String secStr = String.valueOf(sec);
            if(min<10){
                minStr = "0"+minStr;
            }
            if(sec<10){
                secStr = "0"+secStr;
            }
            
            System.out.println(minStr+":"+secStr);
        }else{
            alltimeToday = alltimeToday - minBack;
            System.out.println(day);
            min = alltimeToday/60;
            sec = alltimeToday%60;
            String minStr = String.valueOf(min);
            String secStr = String.valueOf(sec);
            if(min<10){
                minStr = "0"+minStr;
            }
            if(sec<10){
                secStr = "0"+secStr;
            }
            
            System.out.println(minStr+":"+secStr);
        }
        

        in.close();
    }
}