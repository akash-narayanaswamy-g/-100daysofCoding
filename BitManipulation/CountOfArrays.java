package BitManipulation;import Collection_framework.comparatorInterface;

//338. Counting Bits
//https://leetcode.com/problems/counting-bits/
public class CountOfArrays {

	public static void main(String[] args) {
		int n=2;
		System.out.println(countBits(n).toString());

	}
	
	public static int[] countBits(int num) {
        int[] dp = new int[num + 1];
         
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i & (i - 1)] + 1;
        }
         
        return dp;
    }

}
