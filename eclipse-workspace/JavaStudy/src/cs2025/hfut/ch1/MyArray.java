package cs2025.hfut.ch1;

public class MyArray{
	public static void main(String[] args){
		int[] arr=getArray(10,30);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	static int[] getArray(int m,int n){
		int[] result =new int[m];
		for(int i=0;i<m;i++){
			int tmp=(int)(Math.random()*n+1);
			result[i]=tmp;
		}
		return result;
	}
}