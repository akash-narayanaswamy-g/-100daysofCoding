package Recursion;

public class ReverseOfNumber {
	static int sum=0;
	public static void reverse(int n) {
		if(n==0)
			return ;
		sum=sum*10+ n%10;
		reverse(n/10);
	}
	public static void main(String[] args) {
		int n=1342;
		reverse(n);
		System.out.println(sum);

	}
	
}
