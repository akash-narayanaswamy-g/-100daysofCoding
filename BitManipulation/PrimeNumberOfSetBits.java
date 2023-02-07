package BitManipulation;

//762. Prime Number of Set Bits in Binary Representation
//https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/

public class PrimeNumberOfSetBits {

	public static void main(String[] args) {
		int left = 6, right = 10;
		System.out.println(countPrimeSetBits(left, right));
	}
	
	public static int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            
            if(isPrime(setbits(i)))
                c++;
        }
        
        return c;
    }
	
	public static  boolean isPrime(int n) {
		if(n<=1)
			return false;
		int c=2;
		while(c*c<=n) {
			if(n%c==0)
				return false;
			c++;
		}
		return true;
	}
	
	public static int setbits(int n) {
        int c=0;
        while(n>0){
            if((n&1)==1)
                c++;
            n=n>>1;
        }
        return c;
    }

}
