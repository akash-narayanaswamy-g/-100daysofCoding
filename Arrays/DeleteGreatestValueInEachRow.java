package ArrayProblems;

import java.util.Arrays;

//2500. Delete Greatest Value in Each Row
//https://leetcode.com/problems/delete-greatest-value-in-each-row/

public class DeleteGreatestValueInEachRow {

	public static void main(String[] args) {
		int[][] grid = {{1,2,4},{3,3,1}};
		System.out.println(deleteGreatestValue(grid));
	}
	
	public static int deleteGreatestValue(int[][] grid) {
        
        for (int i = 0; i < grid.length; i++) {
			Arrays.sort(grid[i]);
		}
        
        int ans = 0;
        for(int i=grid[0].length-1; i>=0; i--){
            int temp = 0;
            for(int j=0; j<grid.length; j++){
                temp = Math.max(temp , grid[j][i]);
            }
            ans += temp;
			
		}
        return ans;
    }

}
