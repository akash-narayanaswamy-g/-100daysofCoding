package ArrayProblems;

//  1137. N-th Tribonacci Number
//https://leetcode.com/problems/n-th-tribonacci-number/description/

public class TribonacciNumber {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(tribonacci(n));

	}
	
	public static int tribonacci(int n) {
        int dp[] = {0, 1, 1};
      for(int num=3;num<=n;num++){
          dp[num%3]=dp[0]+dp[1]+dp[2];
      }
     return dp[n%3];
    }

}
