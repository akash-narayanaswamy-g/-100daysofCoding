package MathConceptProblems;

//204. Count Primes
//https://leetcode.com/problems/count-primes/description/

public class PrimeCount {

	public static void main(String[] args) {
		int n=10;
		System.out.println(countPrimes(n));

	}
	
	
	public static int countPrimes(int n) {
        if(n==0 || n==1)
            return 0;
        
        boolean[] prime=new boolean[n];
        return isPrime(n, prime);
        
    }
	
	static int isPrime(int n,boolean[] prime) {
		for (int i = 2; i*i < prime.length; i++) {
			if(!prime[i]) {
				for (int j = i*2; j < n; j+=i) {
					prime[j]=true;
				}
			}
		}
		int c=0;
		for (int i = 2; i < prime.length; i++)
		{
			if(!prime[i]) {
				c++;
			}
		}
		return c;
		
	}

}
