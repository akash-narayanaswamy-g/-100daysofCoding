package BitManipulation;import java.lang.reflect.Array;
import java.util.Arrays;


//338. Counting Bits
//https://leetcode.com/problems/counting-bits/
public class CountOfArrays {

	public static void main(String[] args) {
		int n=2;
		System.out.println(Arrays.toString(countBits(n)));

	}
	
	public static int[] countBits(int num) {
        int[] dp = new int[num + 1];
         
        for (int i = 1; i < dp.length; i++) {
        	System.out.print(i & (i - 1));
            dp[i] = dp[i & (i - 1)] + 1;
        }
         
        return dp;
    }

}
