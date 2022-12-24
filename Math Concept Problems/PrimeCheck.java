package MathConceptProblems;

public class PrimeCheck {

	public static void main(String[] args) {
		int n=16;
		for (int i = 0; i < n; i++) {
			System.out.println(i+" "+isPrime(i));
		}

	}
	
	public static boolean isPrime(int n) {
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

}
