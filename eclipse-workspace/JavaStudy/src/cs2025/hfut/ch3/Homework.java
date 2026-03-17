package cs2025.hfut.ch3;

public class Homework {
	public static void main(String[] args) {
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*200);
		}
		for(int i=0;i<10;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
	private static boolean isPrime(int x) {
		if(x==0||x==1) return false;
		for(int i=2;i*i<=x;i++) {
			if(x%i==0) return false;
		}
		return true;
	}
}