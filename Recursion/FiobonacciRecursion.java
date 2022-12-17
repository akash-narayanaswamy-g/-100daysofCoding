package Recursion;


//509. Fibonacci Number
//https://leetcode.com/problems/fibonacci-number/description/
public class FiobonacciRecursion {

	public static void main(String[] args) {
		System.out.println(fibo(10));
		

	}
	static int fibo(int n) {
		if(n<2)
			return n;
		return fibo(n-1)+fibo(n-2);
		
		
	}

}
