package Recursion;

//1342. Number of Steps to Reduce a Number to Zero
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class NumberofStepstoReduceNumbertoZero {
	static int c=0;
    public static int numberOfSteps(int num) {
        if(num<1)
            return c;
        c++;
       if(num%2==0)
           return numberOfSteps(num/2);
       return numberOfSteps(num-1);
    }
    
	public static void main(String[] args) {
		int num = 14;
		System.out.println(numberOfSteps(num));

	}
	

}
