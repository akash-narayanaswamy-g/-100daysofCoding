package String_Problems;

//1071. Greatest Common Divisor of Strings
//https://leetcode.com/problems/greatest-common-divisor-of-strings/

public class GreatestCommonDivisorOfStrings {

	public static void main(String[] args) {
		String str1 = "ABCABC", str2 = "ABC";
		System.out.println(gcdOfStrings(str1, str2));

	}
	
	public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        int gcd=gcd(str1.length(),str2.length());
        return str1.substring(0,gcd);
    }

    public static int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }

}
