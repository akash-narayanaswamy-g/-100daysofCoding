package Recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sum(1342));

	}
	
	public static int sum(int n) {
		if(n<1)
			return 0;
		return n%10+sum(n/10);
	}

}
