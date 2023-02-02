package BitManipulation;

//2220. Minimum Bit Flips to Convert Number
//https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/
public class MinimumBitFlipstoConvertNumber {

	public static void main(String[] args) {
		int start = 10, goal = 7;
		System.out.println(minBitFlips(start, goal));

	}
	
	public static int minBitFlips(int start, int goal) {
        if(start==goal)return 0;
        int c=0,xor=start^goal;
        while(xor>0){
            xor=xor&(xor-1);
            c++;
        }
        return c;
    }

}
