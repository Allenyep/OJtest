package shiti;

import java.util.Scanner;

//历届试题 核桃的数量  
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		int min1=(a*b)/gbs(a,b);
		int min2=(c*min1)/gbs(min1,c);
		System.out.println(min2);
	}
	
	
	//公约数
	public static int gbs(int a,int b) {
		return b==0?a:gbs(b,a%b);
	}

}
