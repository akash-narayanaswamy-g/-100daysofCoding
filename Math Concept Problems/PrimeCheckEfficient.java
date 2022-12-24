package MathConceptProblems;

public class PrimeCheckEfficient {

	public static void main(String[] args) {
		int n=15;
		boolean[] prime=new boolean[n];
		isPrime(n, prime);
	}
	
	static void isPrime(int n,boolean[] prime) {
		for (int i = 2; i*i < prime.length; i++) {
			if(!prime[i]) {
				for (int j = i*2; j < n; j+=i) {
					prime[j]=true;
				}
			}
		}
		for (int i = 2; i < prime.length; i++) {
			if(!prime[i]) {
				System.out.println(i);
			}
		}
		
	}


}
