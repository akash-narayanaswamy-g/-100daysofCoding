package MathConceptProblems;
import java.util.*;

//1979. Find Greatest Common Divisor of Array
//https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
public class GcdOfMinMax {

	public static void main(String[] args) {
		int arr[]= {3,3};
		System.out.println(findGCD(arr));

	}
	
	public static int findGCD(int[] nums) {
		        int b=Arrays.stream(nums).min().getAsInt();
		        int a=Arrays.stream(nums).max().getAsInt();
		       while(b!=0)
				{
					int remainder=a%b;
					a=b;
					b=remainder;
				}
				return(a);

		    }

}
