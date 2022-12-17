package MathConceptProblems;

//32 bit integer condition
//7. Reverse Integer
//https://leetcode.com/problems/reverse-integer/description/

public class ReverseNumberImp {

	public static void main(String[] args) {
		System.out.println(reverse(123));

	}
	
	public static int reverse(int x) {
        int y = 0;

    while(x != 0) {
        int yy = y*10 + x%10;

        if ((yy - x%10)/10 != y) return 0;
        else y = yy;

        x = x/10;   
    }
    return y;
    }

}
