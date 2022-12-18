package Recursion;
//326. Power of Three
//https://leetcode.com/problems/power-of-three/description/

public class isCubeNumber {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(27));

	}
	public static boolean isPowerOfThree(int n) {
        return n > 0 && Math.pow(3, 19) % n == 0;
}

}
