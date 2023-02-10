package ArrayProblems;

//42. Trapping Rain Water
//https://leetcode.com/problems/trapping-rain-water/description/
public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));

	}
	
	public static int trap(int[] height) {
        int ans = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; i++) {
            int left_max = 0, right_max = 0;
            for (int j = i; j >= 0; j--) { 
                left_max = Math.max(left_max, height[j]);
            }
            for (int j = i; j < size; j++) { 
                right_max = Math.max(right_max, height[j]);
            }
            ans += Math.min(left_max, right_max) - height[i];
        }
        return ans;
    }

}
