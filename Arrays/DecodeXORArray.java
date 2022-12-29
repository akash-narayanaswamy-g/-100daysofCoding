package ArrayProblems;

//1720. Decode XORed Array
//https://leetcode.com/problems/decode-xored-array/
import java.util.Arrays;

public class DecodeXORArray {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int first=1;
		System.out.println(Arrays.toString(decode(a, first)));

	}
	public static int[] decode(int[] encoded, int first) {
		int[] a=new int[encoded.length+1];
        a[0]=first;
        for (int i = 1; i < a.length; i++) {
			a[i]=a[i-1]^encoded[i-1];
		}
        return a;
    }

}
