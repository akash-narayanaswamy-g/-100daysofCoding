package ArrayProblems;
import java.util.*;

//989. Add to Array-Form of Integer
//https://leetcode.com/problems/add-to-array-form-of-integer/description/

public class AddtoArrayFormOfInteger {

	public static void main(String[] args) {
		int[] num = {1,2,0,0};
		int k = 34;
		System.out.println(addToArrayForm(num, k));

	}
	
	public static List<Integer> addToArrayForm(int[] num, int k) {
        int cur = k;
        List<Integer> ans = new ArrayList();
        int l=num.length;
        while(--l>=0 || cur>0) {
        	cur+=num[l];
        	ans.add(cur%10);
        	cur/=10;
        }
        Collections.reverse(ans);
        return ans;
    }

}
