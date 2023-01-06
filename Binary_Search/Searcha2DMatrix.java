package Binary_Search;

//74. Search a 2D Matrix
//https://leetcode.com/problems/search-a-2d-matrix/description/
public class Searcha2DMatrix {

	public static void main(String[] args) {
		int[][] m= {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,60}
		};
		int target = 3;
		System.out.println(searchMatrix(m, target));

	}
	 public static boolean searchMatrix(int[][] matrix, int target) {
	        int r=matrix.length;
	        int c=matrix[0].length;

	        int s=0,e=(r*c)-1;
	        while(s<=e){
	            int mid=s+(e-s)/2;
	            if(matrix[mid/c][mid%c]==target)
	                return true;
	            else if(matrix[mid/c][mid%c]>target)
	                e=mid-1;
	            else
	                s=mid+1;
	        }
	        return false;
	        
	    }

}
