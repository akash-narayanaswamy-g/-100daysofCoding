package BitManipulation;
import java.util.*;

//260. Single Number III
//https://leetcode.com/problems/single-number-iii/description/

public class SingleNumber3 {

	public static void main(String[] args) {
		int []n= {1,2,1,3,2,5};
		System.out.println(Arrays.toString(singleNumber(n)));

	}
	public static int[] singleNumber(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
    int[] ans = new int[2];
    for(int num : nums) {
        if(map.containsKey(num)) map.put(num, map.get(num)+1);
        else map.put(num, 1);
    }
    ArrayList<Integer> arr = new ArrayList<>();
    for(int num : nums) {
        if(map.get(num) == 1) arr.add(num);
    }
    ans[0] = arr.get(0);
    ans[1] = arr.get(1);
    return ans;
}

}
