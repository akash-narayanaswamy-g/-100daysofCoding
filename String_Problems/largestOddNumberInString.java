package String_Problems;

//1903. Largest Odd Number in String
//https://leetcode.com/problems/largest-odd-number-in-string/description/

public class largestOddNumberInString {

	public static void main(String[] args) {
		String num = "4206";
		System.out.println(largestOddNumber(num));

	}
	
	/*
	 Ascii values of odd number is odd and for even number is even
	 */
	public static String largestOddNumber(String num) {
		for (int i = num.length()-1; i >=0; i--) {
			if(num.charAt(i)%2==1)
				return num.substring(0,i+1);
		}
		return "";
        
    }

}
