package BitManipulation;

//868. Binary Gap
//https://leetcode.com/problems/binary-gap/
public class BinaryGap {

	public static void main(String[] args) {
		int n = 22;
		System.out.println(binaryGap(n));

	}
	
	public static int binaryGap(int N) {
	        
	        int[] A = new int[32];
	        int t = 0;
	        for (int i = 0; i < 32; ++i)
	            if (((N >> i) & 1) != 0)
	                A[t++] = i;
	
	        int ans = 0;
	        for (int i = 0; i < t - 1; ++i)
	            ans = Math.max(ans, A[i+1] - A[i]);
	        return ans;
	    }

}
