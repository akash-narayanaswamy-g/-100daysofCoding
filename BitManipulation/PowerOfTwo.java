package BitManipulation;

//231. Power of Two
//https://leetcode.com/problems/power-of-two/description/

public class PowerOfTwo {

	public static void main(String[] args) {
		int n=4;
		System.out.println(isPowerOfTwo(n));
		

	}
	public static boolean isPowerOfTwo(int n) {
        int c=0;
        while(n>0){
            int v=n&1;
            if(v==1)
                c++;
            n=n>>1;
        }
        return c==1;
    }

}
