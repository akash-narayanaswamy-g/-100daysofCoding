package BitManipulation;

//Check whether K-th bit is set or not
//https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=Check+whether+K-th+bit+is+set+or+not


public class checkBitIsSet {

	public static void main(String[] args) {
		int N = 4, K = 0;
		System.out.println(checkKthBit(N, K));

	}
	
	static boolean checkKthBit(int n, int k)
    {
       return (n&(1<<k))>>k==1;
        
    }

}
