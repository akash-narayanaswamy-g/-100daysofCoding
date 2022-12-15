package MathConceptProblems;

//9. Palindrome Number-leetcode
//https://leetcode.com/problems/palindrome-number/

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int n=num;
		int y=0;
		while(n>0) {
			int r=n%10;
			y=y*10+r;
			n/=10;
		}
		System.out.println(y+" "+num);
		
		if(num==y)
			System.out.println("palindrome");
		else
			System.out.println("not a Palindrome");

	}

}
