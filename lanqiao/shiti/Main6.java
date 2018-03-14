package shiti;

import java.util.Scanner;

public class Main6 {

	/**
	 *  历届试题 翻硬币  
	 *  直接算 遍历就过？？？？
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		String str2=in.next();
		int step=0;
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		for(int i=0;i<ch1.length-1;i++){
			if(ch1[i]!=ch2[i]&&ch1[i+1]==ch2[i+1]){
				ch1[i]=ch2[i];
				if(ch1[i+1]=='o')ch1[i+1]='*';
				else ch1[i+1]='o';
				step++;
			}
			if(ch1[i]!=ch2[i]&&ch1[i+1]!=ch2[i+1]){
				ch1[i]=ch2[i];
				ch1[i+1]=ch2[i+1];
				step++;
			}
		}
		
		System.out.println(step);
	}

}
