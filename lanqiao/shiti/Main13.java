package lanqiao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  历届试题 回文数字  
 * @author Allen
 *
 */
public class Main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=0,c=0;
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		int n=in.nextInt();
		for(int i=1;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=9;k++){
					if(i*2+j*2+k==n){
						list1.add(i*10000+j*1000+k*100+j*10+i);
					}
					if(i*2+j*2+k*2==n){
						list2.add(i*100000+j*10000+k*1000+k*100+j*10+i);
					}
				}
			}
		}
		if(list1.isEmpty()&&list2.isEmpty())
			System.out.println(-1);
		else{
			for(int i:list1){
				System.out.println(i);
			}
			for(int i:list2){
				System.out.println(i);
			}
		}
			
	}

}
