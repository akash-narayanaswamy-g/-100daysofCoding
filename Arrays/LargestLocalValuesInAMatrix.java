package ArrayProblems;

import java.util.Arrays;

//2373. Largest Local Values in a Matrix
//https://leetcode.com/problems/largest-local-values-in-a-matrix/description/
public class LargestLocalValuesInAMatrix {

	public static void main(String[] args) {
		int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
		System.out.println(Arrays.deepToString(largestLocal(grid)));
	}
	
	 public static int[][] largestLocal(int[][] grid) {
	       int[][] result = new int[grid.length - 2][grid.length - 2];

	        for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					
					int max=0;
					for (int r = i; r < i+3; r++) {
						for (int c = j; c < j+3; c++) {
							if(max<grid[r][c])
								max=grid[r][c];
						}
					}
					result[i][j]=max;
				}
			}
	        return result;
	    }

}
