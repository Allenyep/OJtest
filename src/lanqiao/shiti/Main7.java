package shiti;

import java.util.Scanner;

public class Main7 {

	/**
	 *   历届试题 连号区间数  
	 *   一个数也算
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int result=0;
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		
		for(int i=0;i<n;i++){
			int max=arr[i];
			int min=arr[i];
			for(int j=i;j<n;j++){
				if(max<arr[j])max=arr[j];
				if(min>arr[j])min=arr[j];
				if((j-i)==(max-min))result++;
			}
		}
		System.out.println(result);
	}

}
