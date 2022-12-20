package BitManipulation;

//191. Number of 1 Bits
//https://leetcode.com/problems/number-of-1-bits/description/

public class HammingWeight {

	public static void main(String[] args) {
		int n=0010001000010;
		int noOfOnes=hammingWeight(n);
		System.out.println(noOfOnes);
	}
	
	// you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

}
