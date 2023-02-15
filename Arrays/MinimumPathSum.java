package ArrayProblems;

//64. Minimum Path Sum
//https://leetcode.com/problems/minimum-path-sum/description/

public class MinimumPathSum {

	public static void main(String[] args) {
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(grid));

	}
	
	public static int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        return minSelector(grid,r-1,c-1);
    }

	private static int minSelector(int[][] grid, int r, int c) {
		if(r==0 && c==0)return grid[0][0];
		if(r<0 || c<0)return 999;
		int up=grid[r][c]+minSelector(grid, r-1, c);
		int left=grid[r][c]+minSelector(grid, r, c-1);
		
		return Math.min(up, left);
	}

}
