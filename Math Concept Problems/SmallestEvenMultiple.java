package MathConceptProblems;

/*
2413. Smallest Even Multiple
https://leetcode.com/problems/smallest-even-multiple/description/
*/
public class SmallestEvenMultiple {

	public static void main(String[] args) {
		System.out.println(smallestEvenMultiple(5));

	}
	public static int smallestEvenMultiple(int n) {
        if(n<=2)
            return 2;
        else if(n%2==0)
            return n;
        else
            return n*2;
            
    }

}
