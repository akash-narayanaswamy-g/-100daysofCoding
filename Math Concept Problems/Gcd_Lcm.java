package MathConceptProblems;

//LCM And GCD
//https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1

public class Gcd_Lcm {

	public static void main(String[] args) {
		System.out.println(gcdValue(60, 50));
		System.out.println(lcmValue(9,18));
	}
	
	static int gcdValue(int a,int b) {
		if(a==0)
			return b;
		return gcdValue(a%b, a);
	}
	
	static int lcmValue(int a,int b) {
		return a*b/gcdValue(a, b);
	}

}
