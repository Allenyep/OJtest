package shiti;

import java.util.Scanner;

//  历届试题 错误票据  
public class Main5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n;
		int chongfu=0,queshao=0;
		int[] arr=new int[100000];
		for(int i=0;i<100000;i++){
			arr[i]=0;
		}
		
		Scanner in=new Scanner(System.in);
		
		n=in.nextInt();
		String[] strs=new String[n];
		while(in.hasNext()){
			int temp=in.nextInt();
			if(arr[temp]==1){
				chongfu=temp;
			}
			else{
				arr[temp]=1;
			}
		}
		
		for(int i=1;i<100000;i++){
			if(arr[i-1]==1&&arr[i]==0&&arr[i+1]==1){
				queshao=i;
				break;
			}
		}
		System.out.println(queshao+" "+chongfu);
	}

}
