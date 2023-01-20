package ArrayProblems;
import java.util.*;

//73. Set Matrix Zeroes
//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		setZeroes(matrix);
		System.out.println(Arrays.deepToString(matrix));

	}
	
	public static void setZeroes(int[][] matrix) {
	       Set<Integer> rows = new HashSet<Integer>();
	    Set<Integer> cols = new HashSet<Integer>();
	       
	       for(int i=0;i<matrix.length;i++){
	           for(int j=0;j<matrix[0].length;j++){
	           if(matrix[i][j]==0){
	               rows.add(i);
	               cols.add(j);
	           }
	       }
	       }

	        for(int i=0;i<matrix.length;i++){
	           for(int j=0;j<matrix[0].length;j++){
	            if (rows.contains(i) || cols.contains(j))
	                matrix[i][j] = 0;
	            }
	       }
	    }

}
