package leetcode;

public class Main283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,0,12,0,3,3,0,7};
		moveZeros3(arr);
		for(int i:arr){
			System.out.println(i);
		}
		
		int a=1,b=2;
		//swap(a,b);
		//System.out.println(a+" "+b);
	}
	
	//传参
	static void swap(int a,int b){
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println(a+" "+b);
	}
	
	//传值
	static void moveZeros1(int[] arr){
		int num=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0)num++;
		}
		int[] arrNew=new int[num];
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0)arrNew[k++]=arr[i];
		}
		for(int i=0;i<arr.length;i++){
			if(i<arrNew.length)
				arr[i]=arrNew[i];
			else
				arr[i]=0;
		}
	}
	
	static void moveZeros2(int[] arr){
		int p1=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0)
				arr[p1++]=arr[i];
		}
		for(int i=p1;i<arr.length;i++){
			arr[i]=0;
		}
	}
	
	static void moveZeros3(int[] arr){
		int p1=0,temp;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				temp=arr[p1];
				arr[p1]=arr[i];
				arr[i]=temp;
				p1++;
			}
		}
	}
}
