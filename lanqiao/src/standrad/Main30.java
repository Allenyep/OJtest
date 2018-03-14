package standrad;

import java.util.Scanner;

/**
 *   算法训练 Anagrams问题
 * Created by Administrator on 2018/2/2.
 */
public class Main30 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String str1=in.nextLine();
        String str2=in.nextLine();

        int[] arr1=new int[26];
        int[] arr2=new int[26];

        calc(str1,arr1);
        calc(str2,arr2);

        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("N");
                return;
            }
        }
        System.out.println("Y");
    }

    public static void calc(String str1,int[] arr1){
        int numchar = 0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>='a'&&str1.charAt(i)<='z'){
                numchar=str1.charAt(i)-'a';
            }
            else if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z'){
                numchar=str1.charAt(i)-'A';
            }
            int temp= arr1[numchar];
            temp++;
            arr1[numchar]=temp;
        }
    }
}
