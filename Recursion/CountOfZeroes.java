package Recursion;

public class CountOfZeroes {

	public static void main(String[] args) {
		int n=1080500;
		System.out.println(numOfZeroes(n, 0));

	}
	
	public static int numOfZeroes(int n,int count) {
		if(n==0)
			return count;
		if(n%10==0)
			count++;
		return numOfZeroes(n/10, count);
			
	}

}
